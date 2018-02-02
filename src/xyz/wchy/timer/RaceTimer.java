/**
* @FileName: RaceTimer.java
* @Package: xyz.wchy.timer
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: RaceTimer.java: ����ʱ��.
* @Author wchy����������(891946049).
* @Date 2018��2��1�� ����4:46:38.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.timer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import xyz.wchy.bean.Horse;
import xyz.wchy.constant.SystemConstant;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: RaceTimer.java
* 
* @Description: 
* <p>
* ����ʱ��.
* </p>
* <p>
* ����ʱ��.
* </p>
* <p>
* ����ʱ��.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��2��1�� ����4:46:38.
* 
*/
public class RaceTimer implements Runnable
{
	
	/**
	 * ����ʱ��(��).
	 */
	private int timeNumber;
	
	public RaceTimer(int timeNumber) 
	{
		this.timeNumber = timeNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() 
	{
		try 
		{
			DomainHelper.getInstance().setStop(false);
			Thread.sleep(timeNumber * 1000);
			DomainHelper.getInstance().setStop(true);
			DomainHelper.getInstance().getSubmitBtn().setText("��ʼ");
			
			// ����.
			Horse[] horses = DomainHelper.getInstance().getHorses();
			List<Horse> horseList = new ArrayList<Horse>();
			for (int i = 0; i < horses.length; i++) 
			{
				Horse horse = new Horse(i + 1, horses[i].getPosition());
				horseList.add(horse);
			}
			Collections.sort(horseList);
			
			StringBuffer sb = new StringBuffer("��������������Ϊ��\r\n");
			for(Horse horse : horseList) 
			{
				sb.append(horse).append(SystemConstant.LINE_SEPARATOR_WINDOWS);
			}
			String message = sb.toString();
			JOptionPane.showMessageDialog(null, message, "Horse Race Finish", JOptionPane.INFORMATION_MESSAGE);
		} 
		catch (Exception ex) 
		{
			return;
		}
	}
	
}
