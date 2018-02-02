/**
* @FileName: DomainHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: DomainHelper.java: ������������.
* @Author wchy����������(891946049).
* @Date 2018��1��31�� ����16:38:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import xyz.wchy.bean.Horse;
import xyz.wchy.ui.HorsePanel;

/**
* @ClassName: DomainHelper.java
* 
* @Description: 
* <p>
* �����������ࣺ�ı���iframe��....
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
* @Date: 2018��1��31�� ����16:38:40.
* 
*/
public class DomainHelper 
{
	
	/**
	 * ������.
	 */
	private JFrame frame = new JFrame();
	
	/**
	 * ����panel.
	 */
	private HorsePanel horsePanel = new HorsePanel();
	
	/**
	 * �����ύ��ť.
	 */
	private JButton submitBtn = new JButton("��ʼ");
	
	/**
	 * ��ƥ��.
	 */
	private JTextField horseNumberTf = new JTextField();
	
	/**
	 * ʱ����.
	 */
	private JTextField timeNumberTf = new JTextField();
	
	/**
	 * ��ƥ.
	 */
	private Horse[] horses = new Horse[] {new Horse(1), new Horse(2), new Horse(3)};
	
	/**
	 * ����ֹͣ��ʶ.
	 */
	private boolean stop = false;
	
	/**
	 * �������ʵ��.
	 */
	private static final DomainHelper instance = new DomainHelper();
	
	/**
	 * ˽�й��캯��.
	 */
	private DomainHelper() 
	{
	}
	
	/**
	 * ��ȡ�������ʵ��.
	 * @return
	 */
	public static DomainHelper getInstance() 
	{
		return instance;
	}

	/**
	 * ��ʼ��ϵͳ�������.
	 */
	public void initDomain() 
	{
		
	}

	/**
	 * ��ȡframe.
	 * @return
	 *     frame.
	 */
	public JFrame getFrame() 
	{
		return frame;
	}

	/**
	 * ��ȡhorsePanel.
	 * @return
	 *     horsePanel.
	 */
	public HorsePanel getHorsePanel() 
	{
		return horsePanel;
	}

	/**
	 * ��ȡsubmitBtn.
	 * @return
	 *     submitBtn.
	 */
	public JButton getSubmitBtn() 
	{
		return submitBtn;
	}

	/**
	 * ��ȡhorseNumberTf.
	 * @return
	 *     horseNumberTf.
	 */
	public JTextField getHorseNumberTf() 
	{
		return horseNumberTf;
	}

	/**
	 * ��ȡtimeNumberTf.
	 * @return
	 *     timeNumberTf.
	 */
	public JTextField getTimeNumberTf() 
	{
		return timeNumberTf;
	}

	/**
	 * ��ȡhorses.
	 * @return
	 *     horses.
	 */
	public Horse[] getHorses() 
	{
		return horses;
	}

	/**
	 * ����horses.
	 * @param
	 *     horses.
	 */
	public void setHorses(Horse[] horses) 
	{
		this.horses = horses;
	}

	/**
	 * ����stop.
	 * @param
	 *     stop.
	 */
	public void setStop(boolean stop) 
	{
		this.stop = stop;
	}
	
	/**
	 * ��ȡstop.
	 * @return
	 *     stop.
	 */
	public boolean isStop() 
	{
		return stop;
	}
	
}
