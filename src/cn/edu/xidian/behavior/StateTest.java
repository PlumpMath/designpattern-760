package cn.edu.xidian.behavior;

public class StateTest {

	public static void main(String[] args) {
		State stateA = new ConcreteStateA() ;
		State stateB = new ConcreteStateB() ;
		StateContext context = new StateContext(stateA) ;
		context.execute() ;
		context.setState(stateB) ;
		context.execute() ;
	}

}
