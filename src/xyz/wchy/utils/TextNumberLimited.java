/**
* @FileName: TextNumberLimited.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: TextNumberLimited.java: 文本输入框数字限制.
* @Author wchy，技术交流(891946049).
* @Date 2018年2月1日 下午3:46:31.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import java.awt.event.KeyEvent;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
* @ClassName: TextNumberLimited.java
* 
* @Description: 
* <p>
* 文本输入框数字限制.
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
* @Date: 2018年2月1日 下午3:46:31.
* 
*/
public class TextNumberLimited extends PlainDocument 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int limit;

	public TextNumberLimited(int limit) 
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
		}
	}
	
}
