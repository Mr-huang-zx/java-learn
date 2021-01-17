package com.zhuxuan.pro;

public class mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建类的对象
		Person pi =new Person();
		
		//调用属性 .
		pi.name="烛炫";
		pi.eat();
		pi.sleep("你只会睡觉");
	}

}

//创建类
class Person{
	//属性
	String name;
	int age;
	boolean isplay;
	
	//方法
	public void eat() {
		
	}
	
	public void sleep(String lag) {
		System.out.print(lag);
	}
}