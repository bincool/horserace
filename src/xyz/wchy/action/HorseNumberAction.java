/**
* @FileName: HorseNumberAction.java
* @Package: xyz.wchy.action
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: HorseNumberAction.java: ��ƥ������¼�.
* @Author wchy����������(891946049).
* @Date 2018��2��1�� ����4:13:15.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import xyz.wchy.bean.Horse;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: HorseNumberAction.java
* 
* @Description: 
* <p>
* ��ƥ������¼�.
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
* @Date: 2018��2��1�� ����4:13:15.
* 
*/
public class HorseNumberAction extends PlainDocument 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final DomainHelper domain = DomainHelper.getInstance();
	
	private int limit;

	public HorseNumberAction(int limit) 
	{
		super();
		this.limit = limit;
	}

	/* (non-Javadoc)
	 * @see javax.swing.text.PlainDocument#insertString(int, java.lang.String, javax.swing.text.AttributeSet)
	 */
	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException 
	{
		if (StringUtils.isNotEmpty(str) && (getLength() + str.length()) <= limit) 
		{
			
			char[] upper = str.toCharArray();
			int length = 0;
			for (int i = 0; i < upper.length; i++) 
			{
				if (upper[i] >= KeyEvent.VK_0 && upper[i] <= KeyEvent.VK_9) 
				{
					upper[length++] = upper[i];
				}
			}
			super.insertString(offs, new String(upper, 0, length), a);
			
			int horseNumber = Integer.parseInt(domain.getHorseNumberTf().getText());
			
			if (horseNumber < 1 || horseNumber > 12) 
			{
				JOptionPane.showMessageDialog(domain.getFrame(), "Ϊ������ʾ����ƥ��������1-12ƥ!", "Horse Race Warn", JOptionPane.WARNING_MESSAGE);
				domain.getHorseNumberTf().setText("9");
				horseNumber = 10;
			} 
			
			// ������ƥ����.
			Horse[] horses = new Horse[horseNumber];
			for (int i = 0; i < horseNumber; i++) 
			{
				horses[i] = new Horse(i + 1);
			}
			domain.setHorses(horses);
			domain.getSubmitBtn().setText("��ʼ");
			
		}
	}
	
}
