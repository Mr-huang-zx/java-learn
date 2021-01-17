package com.zhuxuan.pro;
/*
 * 方法
 * 第一种 public void name(){}  void表示没有返回值
 * 		class Animal{
 * 			public void name(){
 * 					
 * 			}
 * 		}
 * 第二种 public String name(){}  表示返回值为字符串 一定要有返回值 不然会报错
 * 
 * 		注意 static final abstract来修饰方法
 * 					权限修饰符 private(表示私有 调用不)，public，缺省，protected
 * 			 如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时，方法中，需要使用return 关键字来返回指定类型的变量或常量
 * 			
 * 		形参列表:方法可以声明多个形参
 * 			数据类型1 形参1,数据类型2 形参2
 */
public class func {
	public static void main(String[] args) {
		shuxing a =new shuxing();
		a.names =2;
	}
}
class buhui{
	public void name(){
		String name;
	}
	public String name2() {
		return "给你一把";
	}
	
}