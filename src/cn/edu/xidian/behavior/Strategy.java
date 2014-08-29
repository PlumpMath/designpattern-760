package cn.edu.xidian.behavior;
/**
 * ²ßÂÔÄ£Ê½
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface Strategy {
	public int calculate(int num1, int num2) ;
}

class Plus implements Strategy{
	public int calculate(int num1, int num2){
		return num1 + num2 ;
	}
}

class Sub implements Strategy{
	public int calculate(int num1, int num2){
		return num1 - num2 ;
	}
}

class Context{
	private Strategy strategy ;
	
	public Context(Strategy strategy){
		this.strategy = strategy ;
	}
	
	public int execute(int num1, int num2){
		return strategy.calculate(num1, num2) ;
	}
}