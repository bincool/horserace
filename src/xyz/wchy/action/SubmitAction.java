/**
* @FileName: SubmitAction.java
* @Package: xyz.wchy.action
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SubmitAction.java: 赛马比赛提交事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年2月1日 下午2:08:11.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import xyz.wchy.base.BaseData;
import xyz.wchy.bean.Horse;
import xyz.wchy.timer.RaceTimer;

/**
* @ClassName: SubmitAction.java
* 
* @Description: 
* <p>
* 赛马比赛提交事件.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年2月1日 下午2:08:11.
* 
*/
public class SubmitAction extends BaseData implements ActionListener 
{

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Horse[] horses = domain.getHorses();

		if (e.getActionCommand() == "开始") 
		{
			int horseNumber = 0;
			try 
			{
				horseNumber = Integer.parseInt(domain.getHorseNumberTf().getText());
			} 
			catch (Exception e1) 
			{
				showMessageDialog("马匹和时间输入非法!");
				domain.getHorseNumberTf().setText("3");
				domain.getTimeNumberTf().setText("9");
				return;
			}

			if (horseNumber > 0 && horseNumber <= 12) 
			{
				
				if (domain.isStop()) 
				{
					for (int i = 0; i < domain.getHorses().length; i++) 
					{
						horses[i] = new Horse(i + 1);
					}
					domain.setHorses(horses);
				}
				
				int raceNumber = 9;
				try 
				{
					raceNumber = Integer.parseInt(domain.getTimeNumberTf().getText());
					if (raceNumber < 1) 
					{
						raceNumber = 9;
					}
				} 
				catch (Exception e3) 
				{
					raceNumber = 9;
				}
				Thread thread1 = new Thread(new RaceTimer(raceNumber), "timer");
                thread1.start();
				
				// 启动比赛.
				for (Horse horse : horses) 
				{
					horse.start();
				}
				
				domain.getSubmitBtn().setText("比赛中");;
			} 
			else 
			{
				showMessageDialog("为方便演示，马匹数请输入1-12匹!");
			}
		} 
		else if (e.getActionCommand() == "比赛中") 
		{
			for (Horse horse : horses) 
			{
				horse.resume();
			}

			domain.getSubmitBtn().setText("比赛中");
		}
	}
	
	/**
	 * 警告弹框.
	 * @param message
	 */
	private void showMessageDialog(String message) 
	{
		JOptionPane.showMessageDialog(domain.getFrame(), message, "Horse Race Warn", JOptionPane.WARNING_MESSAGE);
	}

}
