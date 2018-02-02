/**
* @FileName: BaseData.java
* @Package: xyz.wchy.bean
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: BaseData.java: 基础框架数据.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月31日 上午16:38:40.
* @Content: 新增.
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
* 基础框架数据.
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
public abstract class BaseData 
{
	
	/**
	 * 领域对象.
	 */
	protected static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * 日志对象.
	 */
	protected static final Logger LOGGER = Logger.getLogger();
	
}
