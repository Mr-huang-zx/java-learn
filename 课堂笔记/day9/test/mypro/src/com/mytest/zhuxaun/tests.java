package com.mytest.zhuxaun;

public class tests {
	public static void main(String[] args) {
		Person sendpri =new Person();
		sendpri.show(new Phone());
		
		dd a =new dd();
		System.out.println(a.nums(10));
	}
}
class Person{
	public void show(Phone num) {
		num.say();
	}
}
class Phone{
	double price;
	public void say() {
		System.out.print("调用成功");
	}
}