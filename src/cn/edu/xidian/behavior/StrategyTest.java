package cn.edu.xidian.behavior;

public class StrategyTest {

	public static void main(String[] args) {
		
		Context context = new Context(new Plus()) ;
		int result = context.execute(12, 23) ;
		System.out.println(result);
	}

}
