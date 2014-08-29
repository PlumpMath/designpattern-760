package cn.edu.xidian.behavior;
/**
 * ״̬ģʽ,�����״̬�����ı�ʱ���ı�������Ϊ
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface State {
	public void handler() ;
}
class ConcreteStateA implements State{
	public void handler(){
		System.out.println("״̬A��Ӧ�ķ���ִ��...");
	}
}
class ConcreteStateB implements State{
	public void handler(){
		System.out.println("״̬B��Ӧ�ķ���ִ��...");
	}
}
class ConcreteStateC implements State{
	public void handler(){
		System.out.println("״̬C��Ӧ�ķ���ִ��...");
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