package org.lsq.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @类名：IdBuilder
 * @作用：生成Id
 * @使用方法：实例化一个IdBuilder对象，每次调用该对象的getNewId()方法都会返回一个唯一id，id类型为17位长整形
 * 
*/
public class IdBuilder {
	//例子：生成Id
//	public static void main(String[] args) {

	//	System.out.println(IdBuilder.getNewId());

	//	IdBuilder getId = new IdBuilder();
	//	System.out.println(getId.getNewId());
		
	//}
	
	
	/**
	 * 生成id算法   id=时间+计数器当前数值
	 * 例如当前是见为1365905550062  累加器当前数值为3801，则生成id为13659055500623801
	*/
	//线程锁对象
	private static final Lock LOCK = new ReentrantLock();
	//上一次生成id的时间部分
	private static long lastTime = System.currentTimeMillis();
	//上一次生成id的计数器部分
	private static short lastCount = 0;
	//计数器最大值，当计数器当前值超过最大值时计数器清0
	private static int maxSize=10000;
	//新生成的id的时间部分
	private static long time;
	//新生成的id的计数器部分
	private static short count;
	
	
	
	
	/**
	 *得到新生成的Id 
	 */	
	public static long getNewId(){
		long newId;
		LOCK.lock();
		try {
			boolean done = false;
			while (!done) {
				long now = System.currentTimeMillis();
				if (now == lastTime) {
					try {
						Thread.currentThread().sleep(1);
					} catch (java.lang.InterruptedException e) {
					} 
					continue;
				} else {
					lastTime = now;
					done = true;
				}
			}
			if(lastCount==maxSize){
				lastCount=0;
			}
			time = lastTime;
			count = lastCount++;
			newId=time*maxSize+count;
		} finally {
			LOCK.unlock();
		}
		return newId;
	}
	
}
