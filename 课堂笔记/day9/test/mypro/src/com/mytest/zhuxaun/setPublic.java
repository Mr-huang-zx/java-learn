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
	private int leg; //�ⲿ����ʹ�� 
	
	//���Ե�����
	public void setLeg(int l) {
		if(l>=0 && l%2==0) {
			leg =l;
			System.out.print(leg);
		}else {
			leg =0;
			System.out.print(leg);
		}
	}
	//���ԵĻ�ȡ
    public int getLegs(){
        return leg;
    }
}
