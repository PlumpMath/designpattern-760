package cn.edu.xidian.behavior;

public class ObserverTest {

	public static void main(String[] args) {
		ConcreteObservable observable = new ConcreteObservable() ;
		ConcreteObserver observer1 = new ConcreteObserver("�۲���1") ;
		ConcreteObserver observer2 = new ConcreteObserver("�۲���2") ;
		ConcreteObserver observer3 = new ConcreteObserver("�۲���3") ;
		observable.attach(observer1) ;
		observable.attach(observer2) ;
		observable.attach(observer3) ;
		
		observable.advice() ;
		observable.dettach(observer2) ;
		observable.advice() ;
	}

}
