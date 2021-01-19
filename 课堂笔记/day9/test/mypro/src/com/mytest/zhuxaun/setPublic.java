package com.mytest.zhuxaun;

public class setPublic {
	public static void main(String[] args) {
		Animal seg =new Animal();
		seg.setLeg(39);
		System.out.print(seg.getLegs());
	}
}

class Animal{
	int age;
	String name;
	private int leg; //外部不能使用 
	
	//属性的设置
	public void setLeg(int l) {
		if(l>=0 && l%2==0) {
			leg =l;
			System.out.print(leg);
		}else {
			leg =0;
			System.out.print(leg);
		}
	}
	//属性的获取
    public int getLegs(){
        return leg;
    }
}
