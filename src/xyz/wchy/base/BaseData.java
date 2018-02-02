/**
* @FileName: BaseData.java
* @Package: xyz.wchy.bean
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: BaseData.java: �����������.
* @Author wchy����������(891946049).
* @Date 2018��1��31�� ����16:38:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.base;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.Logger;

/**
* @ClassName: BaseData.java
* 
* @Description: 
* <p>
* �����������.
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
public abstract class BaseData 
{
	
	/**
	 * �������.
	 */
	protected static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * ��־����.
	 */
	protected static final Logger LOGGER = Logger.getLogger();
	
}
