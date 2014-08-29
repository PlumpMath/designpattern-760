package cn.edu.xidian.creater;
/**
 * ����ʽ����ģʽ
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
public class Singleton2 {
	
	private static Singleton2 instance = new Singleton2() ;
	
	private Singleton2(){}
	
	public static Singleton2 getInstance(){
		return instance ;
	}
}	
