package cn.edu.xidian.behavior;
/**
 * 责任链模式
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
interface Handler{
	public void operation(int mLevle) ;
}

abstract class AbstractHandler{
	private MyHandler handler ;
	public void setHandler(MyHandler handler){
		this.handler = handler ;
	}
	
	public MyHandler getHandler(){
		return handler ;
	}
}

class MyHandler extends AbstractHandler implements Handler{
	private String name ;
	private int level ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public MyHandler(String name,int level){
		this.name = name ;
		this.level = level ;
	}
	
	public void operation(int mLevel){
		if(this.level > mLevel){
			System.out.println(name + "执行操作...");
		}else{
			if(getHandler() != null){
				getHandler().operation(mLevel) ;
			}else{
				System.out.println("没有可处理的handler...");
			}
		}
	}
}

