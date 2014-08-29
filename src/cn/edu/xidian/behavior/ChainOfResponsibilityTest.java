package cn.edu.xidian.behavior;

public class ChainOfResponsibilityTest {

	public static void main(String[] args) {
		MyHandler myHandler1 = new MyHandler("handler1",5) ;
		MyHandler myHandler2 = new MyHandler("handler2",6) ;
		MyHandler myHandler3 = new MyHandler("handler3",10) ;
		
		myHandler1.setHandler(myHandler2) ;
		myHandler2.setHandler(myHandler3) ;
		
		myHandler1.operation(11) ;
	}

}
