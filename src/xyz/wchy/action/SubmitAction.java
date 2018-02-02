/**
* @FileName: SubmitAction.java
* @Package: xyz.wchy.action
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: SubmitAction.java: ��������ύ�¼�.
* @Author wchy����������(891946049).
* @Date 2018��2��1�� ����2:08:11.
* @Content: ����.
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
* ��������ύ�¼�.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��2��1�� ����2:08:11.
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

		if (e.getActionCommand() == "��ʼ") 
		{
			int horseNumber = 0;
			try 
			{
				horseNumber = Integer.parseInt(domain.getHorseNumberTf().getText());
			} 
			catch (Exception e1) 
			{
				showMessageDialog("��ƥ��ʱ������Ƿ�!");
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
				
				// ��������.
				for (Horse horse : horses) 
				{
					horse.start();
				}
				
				domain.getSubmitBtn().setText("������");;
			} 
			else 
			{
				showMessageDialog("Ϊ������ʾ����ƥ��������1-12ƥ!");
			}
		} 
		else if (e.getActionCommand() == "������") 
		{
			for (Horse horse : horses) 
			{
				horse.resume();
			}

			domain.getSubmitBtn().setText("������");
		}
	}
	
	/**
	 * ���浯��.
	 * @param message
	 */
	private void showMessageDialog(String message) 
	{
		JOptionPane.showMessageDialog(domain.getFrame(), message, "Horse Race Warn", JOptionPane.WARNING_MESSAGE);
	}

}
