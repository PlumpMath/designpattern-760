package cn.edu.xidian.behavior;

public class TemplateMethodTest {

	public static void main(String[] args) {
		
		int[] arr = {12,5,3,36,4,15,2,32} ;
		ConcreteClass concreteClass = new ConcreteClass() ;
		concreteClass.display(arr) ;
	}
}
