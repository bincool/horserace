/**
* @FileName: LayoutPanel.java
* @Package: xyz.wchy.ui
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: LayoutPanel.java: UI布局.
* @Author wchy，技术交流(891946049).
* @Date 2018年2月1日 下午12:30:27.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.ui;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import xyz.wchy.action.HorseNumberAction;
import xyz.wchy.action.SubmitAction;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.TextNumberLimited;

/**
* @ClassName: LayoutPanel.java
* 
* @Description: 
* <p>
* UI布局.
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
* @Date: 2018年2月1日 下午12:30:27.
* 
*/
public class LayoutPanel extends JPanel 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final DomainHelper domain = DomainHelper.getInstance();

	private static final JButton submitBtn = domain.getSubmitBtn();
	
	private static final JTextField horseNumberTf = domain.getHorseNumberTf();
	
	private static final JTextField timeNumberTf = domain.getTimeNumberTf();
	
	private static final JLabel horseLbl = new JLabel("马匹(匹)：");
	
	private static final JLabel timeLbl = new JLabel("时间(秒)：");

	// 设置布局
	public LayoutPanel() 
	{

		this.setLayout(null);
		this.add(horseLbl);
		this.add(horseNumberTf);
		this.add(timeLbl);
		this.add(timeNumberTf);
		this.add(submitBtn);
		
		horseLbl.setBounds(10, 10, 95, 25);
		
		horseNumberTf.setBounds(70, 10, 55, 25);
		horseNumberTf.setDocument(new HorseNumberAction(2));
		horseNumberTf.setText("3");
		
		timeLbl.setBounds(10, 40, 95, 25);
		timeNumberTf.setBounds(70, 40, 55, 25);
		timeNumberTf.setDocument(new TextNumberLimited(2));
		timeNumberTf.setText("9");
		
		submitBtn.setBounds(45, 70, 80, 30);
		submitBtn.addActionListener(new SubmitAction());
	}
	
}
