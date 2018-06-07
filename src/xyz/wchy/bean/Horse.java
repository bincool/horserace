/**
* @FileName: Horse.java
* @Package: xyz.wchy.bean
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: Horse.java: 马匹bean.
* @Author wchy，技术交流(891946049).
* @Date 2018年2月1日 上午11:37:14.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.bean;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: Horse.java
* 
* @Description: 
* <p>
* 马匹bean.
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
* @Date: 2018年2月1日 上午11:37:14.
* 
*/
public class Horse extends Thread implements Comparable<Horse>, Cloneable 
{
	
	/**
	 * 马匹位置.
	 */
	private int position = 0;
	
	/**
	 * 跑到号.
	 */
	private int trackNumber = 0;
	
	/**
	 * 
	 * @param trackNumber
	 */
	public Horse(int trackNumber) 
	{
		this.trackNumber = trackNumber;
	}
	
	/**
	 * 
	 * @param trackNumber
	 * @param position
	 */
	public Horse(int trackNumber, int position) 
	{
		this.trackNumber = trackNumber;
		this.position = position;
	}
	
	/**
	 * 获取position.
	 * @return
	 *     position.
	 */
	public int getPosition() 
	{
		return position;
	}

	/**
	 * 获取trackNumber.
	 * @return
	 *     trackNumber.
	 */
	public int getTrackNumber() 
	{
		return trackNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() 
	{
		while (!DomainHelper.getInstance().isStop()) 
		{
			position += (int) (Math.random() * 7) + 1;

			if (position >= 600) 
			{
				position -= 600;
			}
			DomainHelper.getInstance().getHorsePanel().repaint();
			try 
			{
				Thread.sleep(50);
			} 
			catch (Exception ex) 
			{
				return;
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Horse o) 
	{
		if (this.position > o.position) 
		{
			return -1;
		} 
		else if (this.position < o.position) 
		{
			return 1;
		} 
		else 
		{
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#toString()
	 */
	@Override
	public String toString() 
	{
		return trackNumber + "号";
	}
	
}
