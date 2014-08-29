package cn.edu.xidian.behavior;
/**
 * √¸¡Óƒ£ Ω
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface Command {
	public void execute() ;
}

class ConcreteCommand implements Command{
	
	private Receiver receiver ;
	public void setReceiver(Receiver receiver){
		this.receiver = receiver ;
	}
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver ;
	}
	
	public void execute(){
		receiver.action() ;
	}
}

class Receiver{
	public void action(){
		System.out.println("÷¥––√¸¡Ó...");
	}
}

class Invoker{
	
	private Command command ;
	public void setCommand(Command command){
		this.command = command ;
	}
	
	public void invoke(){
		command.execute() ;
	}
}
