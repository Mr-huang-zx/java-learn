package com.zhuxuan.pro;

public class mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������Ķ���
		Person pi =new Person();
		
		//�������� .
		pi.name="����";
		pi.eat();
		pi.sleep("��ֻ��˯��");
	}

}

//������
class Person{
	//����
	String name;
	int age;
	boolean isplay;
	
	//����
	public void eat() {
		
	}
	
	public void sleep(String lag) {
		System.out.print(lag);
	}
}