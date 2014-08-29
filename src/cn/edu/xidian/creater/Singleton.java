package cn.edu.xidian.creater;
/**
 * ����ʽ����ģʽ
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
public class Singleton {
	
	private static Singleton instance ;
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(instance == null){
			synchronized(Singleton.class){
				if(instance == null){
					instance = new Singleton() ;
				}
			}
		}
		return instance ;
	}
}
