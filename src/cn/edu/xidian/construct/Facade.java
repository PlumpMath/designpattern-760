package cn.edu.xidian.construct;
/**
 * 外观模式
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
		System.out.println("CPU开始工作...");
	}
}
class Memory{
	public void memoryWork(){
		System.out.println("内存开始工作...");
	}
}
class Displayer{
	public void displayerWork(){
		System.out.println("显示器开始工作...");
	}
}
