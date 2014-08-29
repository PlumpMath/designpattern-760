package cn.edu.xidian.behavior;

import java.util.ArrayList;
import java.util.List;
/**
 * 观察者模式
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface Observer {
	public void update() ;
}

class ConcreteObserver implements Observer{
	private String name ;
	public ConcreteObserver(String name) {
		this.name = name;
	}

	public void update(){
		System.out.println(name + "开始更新自己的状态...");
	}
}

abstract class Observable{
	
	private List<Observer> observers = new ArrayList<>() ;
	
	public void attach(Observer o){
		observers.add(o) ;
	}
	
	public void dettach(Observer o){
		observers.remove(o) ;
	}
	
	public void notifyObservers(){
		for(Observer observer:observers){
			observer.update() ;
		}
	}
}

class ConcreteObservable extends Observable{
	public void advice(){
		super.notifyObservers() ;
	}
}