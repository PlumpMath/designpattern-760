package cn.edu.xidian.construct;

public class AdapterTest {

	public static void main(String[] args) {
		Adapter adapter = new Adapter(new Person()) ;
		adapter.run() ;
		adapter.walk() ;
	}

}
