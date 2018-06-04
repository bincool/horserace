/**
* @FileName: HorseRace.java
* @Package: xyz.wchy
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: HorseRace.java: ������Ϸ.
* @Author wchy����������(891946049).
* @Date 2018��1��31�� ����4:42:55.
* @Content: ����.
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
* ������Ϸ-�ɱ���ʱ�䣬��ƥ�������ȵ�.
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
* @Date: 2018��1��31�� ����4:42:55.
* 
*/
public class HorseRace 
{

	/**
	 * �������.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();

	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger();

	/**
	 * ������.
	 */
	private JFrame frame;

	/**
	 * �޲ι��캯��.
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
		
		// ������.
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
	 * ������. Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					// ���öԻ���ķ��.
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

					// ����һ�����±�����.
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
