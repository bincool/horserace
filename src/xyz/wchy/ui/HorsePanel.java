/**
* @FileName: HorsePanel.java
* @Package: xyz.wchy.ui
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: HorsePanel.java: 赛马场panel.
* @Author wchy，技术交流(891946049).
* @Date 2018年2月1日 下午12:32:19.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: HorsePanel.java
* 
* @Description: 
* <p>
* 赛马场panel.
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
* @Date: 2018年2月1日 下午12:32:19.
* 
*/
public class HorsePanel extends JPanel 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public HorsePanel() 
	{
		this.setBackground(Color.white);

	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		String imgPath = "images/run_horse.gif";
		if (DomainHelper.getInstance().isStop()) 
		{
			imgPath = "images/stop_horse.gif";
		}
		Image img = Toolkit.getDefaultToolkit().getImage(imgPath);
		
		if (null != DomainHelper.getInstance().getHorses()) 
		{
			for (int i = 0; i < DomainHelper.getInstance().getHorses().length; i++) 
			{
				g.drawImage(img, DomainHelper.getInstance().getHorses()[i].getPosition(), i * 60, this);
				
				g.setColor(Color.red);//设置当前绘图颜色
				g.drawString((i + 1) + "号", DomainHelper.getInstance().getHorses()[i].getPosition() + 60, i * 60 + 10);
			}
		}
	}
	
}
