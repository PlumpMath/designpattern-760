package cn.edu.xidian.construct;
/**
 * ������ģʽ
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface TargetInterface {
	public void run() ;
}

class Person{
	public void walk(){
		System.out.println("��·...");
	}
}

class Adapter implements TargetInterface{
	private Person person ;
	public Adapter(Person person){
		this.person = person ;
	}
	
	public void run(){
		System.out.println("�ܲ�...");
	}
	public void walk(){
		person.walk() ;
	}
}