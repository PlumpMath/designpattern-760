package cn.edu.xidian.construct;
/**
 * ���ģʽ
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
class Facade {
	
	private CPU cpu ;
	private Memory memory ;
	private Displayer displayer ;
	
	public Facade(){
		cpu = new CPU() ;
		memory = new Memory() ;
		displayer = new Displayer() ;
	}
	
	public void run(){
		cpu.cpuWork() ;
		memory.memoryWork() ;
		displayer.displayerWork() ;
	}
}

class CPU{
	public void cpuWork(){
		System.out.println("CPU��ʼ����...");
	}
}
class Memory{
	public void memoryWork(){
		System.out.println("�ڴ濪ʼ����...");
	}
}
class Displayer{
	public void displayerWork(){
		System.out.println("��ʾ����ʼ����...");
	}
}
