package cn.edu.xidian.construct;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * JDK动态代理模式
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface Subject {
	public void method() ;
}
class RealSubject implements Subject{
	public void method(){
		System.out.println("真正的对象方法开始执行...");
	}
}

class MyProxy{
	public void execute(){
		Subject subject = new RealSubject() ;
		Subject obj = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), subject.getClass().getInterfaces(),new MyHandler(subject)) ;
		obj.method() ;
	}
}
class MyHandler implements InvocationHandler{
	private Subject subject ;
	
	public MyHandler(Subject subject){
		this.subject = subject ;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before...");
		method.invoke(subject, args) ;
		System.out.println("after...");
		return null;
	}
}