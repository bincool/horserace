/**
* @FileName: ApplicationConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ApplicationConstant.java: 记事本常量-可配置.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月31日 上午16:38:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.constant;

import java.util.Map;

import xyz.wchy.utils.ApplicationConfigHelper;

/**
* @ClassName: ApplicationConstant.java
* 
* @Description: 
* <p>
* 记事本常量-可在application.properties中配置其常量具体值.
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
public interface ApplicationConstant 
{
	
	/**
	 * 应用配置.
	 */
	Map<String, String> APP_CONFIGS = ApplicationConfigHelper.getInstance().getPropMap();
	
	/**
	 * Frame图标路径.
	 */
	String FRAME_ICON_PATH = APP_CONFIGS.get("frame.icon.path");
	
	/**
	 * Frame标题.
	 */
	String FRAME_TITLE = APP_CONFIGS.get("frame.title");
	
}
