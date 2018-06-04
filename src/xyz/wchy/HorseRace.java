/**
* @FileName: HorseRace.java
* @Package: xyz.wchy
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: HorseRace.java: 赛马游戏.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月31日 下午4:42:55.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;

import xyz.wchy.constant.ApplicationConstant;
import xyz.wchy.ui.LayoutPanel;
import xyz.wchy.ui.HorsePanel;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.Logger;

/**
* @ClassName: HorseRace.java
* 
* @Description: 
* <p>
* 赛马游戏-可比赛时间，马匹的数量等等.
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
* @Date: 2018年1月31日 下午4:42:55.
* 
*/
public class HorseRace 
{

	/**
	 * 领域对象.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();

	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger();

	/**
	 * 主窗体.
	 */
	private JFrame frame;

	/**
	 * 无参构造函数.
	 */
	public HorseRace() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		// 主窗体.
		frame = domain.getFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_ICON_PATH));
		frame.setTitle(ApplicationConstant.FRAME_TITLE);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(dimension.getWidth()/2 - 750/2);
		int height = (int)(dimension.getHeight()/2 - 750/2);
		frame.setBounds(width, height, 750, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HorsePanel horsePanel = DomainHelper.getInstance().getHorsePanel();
		LayoutPanel layoutPanel = new LayoutPanel();
		layoutPanel.setPreferredSize(new Dimension(150, 20));
		
		frame.add(horsePanel, BorderLayout.CENTER);
		frame.add(layoutPanel, BorderLayout.EAST);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	/**
	 * 主方法. Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					// 设置对话框的风格.
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

					// 创建一个记事本对象.
					HorseRace window = new HorseRace();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					LOGGER.error(HorseRace.class, e);
				}
			}
		});
	}

}
