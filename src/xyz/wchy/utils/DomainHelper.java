/**
* @FileName: DomainHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: DomainHelper.java: 领域对象帮助类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月31日 上午16:38:40.
* @Content: 新增.
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
* 领域对象帮助类：文本域、iframe、....
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
* @Date: 2018年1月31日 上午16:38:40.
* 
*/
public class DomainHelper 
{
	
	/**
	 * 主窗体.
	 */
	private JFrame frame = new JFrame();
	
	/**
	 * 赛马panel.
	 */
	private HorsePanel horsePanel = new HorsePanel();
	
	/**
	 * 比赛提交按钮.
	 */
	private JButton submitBtn = new JButton("开始");
	
	/**
	 * 马匹数.
	 */
	private JTextField horseNumberTf = new JTextField();
	
	/**
	 * 时间数.
	 */
	private JTextField timeNumberTf = new JTextField();
	
	/**
	 * 马匹.
	 */
	private Horse[] horses = new Horse[] {new Horse(1), new Horse(2), new Horse(3)};
	
	/**
	 * 比赛停止标识.
	 */
	private boolean stop = false;
	
	/**
	 * 领域对象实例.
	 */
	private static final DomainHelper instance = new DomainHelper();
	
	/**
	 * 私有构造函数.
	 */
	private DomainHelper() 
	{
	}
	
	/**
	 * 获取领域对象实例.
	 * @return
	 */
	public static DomainHelper getInstance() 
	{
		return instance;
	}

	/**
	 * 初始化系统领域对象.
	 */
	public void initDomain() 
	{
		
	}

	/**
	 * 获取frame.
	 * @return
	 *     frame.
	 */
	public JFrame getFrame() 
	{
		return frame;
	}

	/**
	 * 获取horsePanel.
	 * @return
	 *     horsePanel.
	 */
	public HorsePanel getHorsePanel() 
	{
		return horsePanel;
	}

	/**
	 * 获取submitBtn.
	 * @return
	 *     submitBtn.
	 */
	public JButton getSubmitBtn() 
	{
		return submitBtn;
	}

	/**
	 * 获取horseNumberTf.
	 * @return
	 *     horseNumberTf.
	 */
	public JTextField getHorseNumberTf() 
	{
		return horseNumberTf;
	}

	/**
	 * 获取timeNumberTf.
	 * @return
	 *     timeNumberTf.
	 */
	public JTextField getTimeNumberTf() 
	{
		return timeNumberTf;
	}

	/**
	 * 获取horses.
	 * @return
	 *     horses.
	 */
	public Horse[] getHorses() 
	{
		return horses;
	}

	/**
	 * 设置horses.
	 * @param
	 *     horses.
	 */
	public void setHorses(Horse[] horses) 
	{
		this.horses = horses;
	}

	/**
	 * 设置stop.
	 * @param
	 *     stop.
	 */
	public void setStop(boolean stop) 
	{
		this.stop = stop;
	}
	
	/**
	 * 获取stop.
	 * @return
	 *     stop.
	 */
	public boolean isStop() 
	{
		return stop;
	}
	
}
