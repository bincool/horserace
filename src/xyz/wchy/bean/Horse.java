/**
* @FileName: Horse.java
* @Package: xyz.wchy.bean
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: Horse.java: ��ƥbean.
* @Author wchy����������(891946049).
* @Date 2018��2��1�� ����11:37:14.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.bean;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: Horse.java
* 
* @Description: 
* <p>
* ��ƥbean.
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
* @Date: 2018��2��1�� ����11:37:14.
* 
*/
public class Horse extends Thread implements Comparable<Horse>, Cloneable 
{
	
	/**
	 * ��ƥλ��.
	 */
	private int position = 0;
	
	/**
	 * �ܵ���.
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
	 * ��ȡposition.
	 * @return
	 *     position.
	 */
	public int getPosition() 
	{
		return position;
	}

	/**
	 * ��ȡtrackNumber.
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
		return trackNumber + "��";
	}
	
}
