package cn.edu.xidian.construct;
/**
 * 适配器模式
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface TargetInterface {
	public void run() ;
}

class Person{
	public void walk(){
		System.out.println("走路...");
	}
}

class Adapter implements TargetInterface{
	private Person person ;
	public Adapter(Person person){
		this.person = person ;
	}
	
	public void run(){
		System.out.println("跑步...");
	}
	public void walk(){
		person.walk() ;
	}
}