package cn.edu.xidian.creater;
/**
 * 工厂方法模式
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
public class FactoryMethod {
	
	public static void main(String[] args){
		IFactory factory = new ConcreteFactory() ;
		Product product = factory.createProduct() ;
		product.method() ;
	}
	
}

interface IFactory{
	public Product createProduct() ;
}
interface Product{
	public void method() ;
}

class ConcreteFactory implements IFactory{
	public Product createProduct(){
		return new ConcreteProduct() ;
	}
}
class ConcreteProduct implements Product{
	public void method(){
		System.out.println("具体生产的产品的方法...");
	}
}