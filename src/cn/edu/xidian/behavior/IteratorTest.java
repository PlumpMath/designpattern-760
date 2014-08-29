package cn.edu.xidian.behavior;

public class IteratorTest {

	public static void main(String[] args) {
		MyList<String> myList = new MyList<>() ;
		myList.add("zhangsan") ;
		myList.add("lisi") ;
		myList.add("wangwu") ;
		Iterator<String> iterator = myList.iterator() ;
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
