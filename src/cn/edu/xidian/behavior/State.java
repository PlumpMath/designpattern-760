package cn.edu.xidian.behavior;
/**
 * 状态模式,当类的状态发生改变时，改变它的行为
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface State {
	public void handler() ;
}
class ConcreteStateA implements State{
	public void handler(){
		System.out.println("状态A对应的方法执行...");
	}
}
class ConcreteStateB implements State{
	public void handler(){
		System.out.println("状态B对应的方法执行...");
	}
}
class ConcreteStateC implements State{
	public void handler(){
		System.out.println("状态C对应的方法执行...");
	}
}

class StateContext{
	private State state ;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public StateContext(State state) {
		this.state = state;
	}
	
	public void execute(){
		state.handler() ;
	}
}