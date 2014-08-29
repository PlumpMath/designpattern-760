package cn.edu.xidian.behavior;

import java.util.ArrayList;
import java.util.List;
/**
 * µü´úÆ÷Ä£Ê½
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface Iterator<E >{
	public boolean hasNext() ;
	public E next() ;
}

class ConcreteIterator<E> implements Iterator<E>{
	
	private List<E> list = new ArrayList<E>() ;
	
	private int cursor = 0 ;
	
	public ConcreteIterator(List<E> list){
		this.list = list ;
	}
	@Override
	public boolean hasNext() {
		if(cursor == list.size()){
			return false ;
		}
		return true;
	}

	@Override
	public E next() {
		E obj = null ;
		if(hasNext()){
			obj = list.get(cursor++) ;
			return obj ;
		}
		return null;
	}
}

interface IList<E>{
	public void add(E e) ;
	public void remove(Object obj) ;
	public Iterator<E> iterator() ;
}

class MyList<E> implements IList<E>{
	
	private List<E> list = new ArrayList<E>() ;
	
	@Override
	public void add(E e) {
		list.add(e) ;
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj) ;
	}

	@Override
	public Iterator<E> iterator() {
		return new ConcreteIterator<>(list) ;
	}
	
}