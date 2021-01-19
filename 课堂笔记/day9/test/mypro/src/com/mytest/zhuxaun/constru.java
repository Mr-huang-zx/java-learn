package com.mytest.zhuxaun;

public class constru {
	public static void main(String[] args) {
		Personnl m =new Personnl();
		Personnl ne =new Personnl("ÖòìÅ");
		System.out.println(ne.name);
	}
}


class Personnl{
	String name;
	int age;
	
	public void eat() {
		
	}
	public Personnl(){
		
	}
	public Personnl(String nam){
		name =nam;
	}
}