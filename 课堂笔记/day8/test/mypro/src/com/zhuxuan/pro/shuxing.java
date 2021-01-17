package com.zhuxuan.pro;

/*
 * 属性(成员变量)和局不变量
 * 	属性:直接定义在类的一对{}内
 * 	局部变量:声明在方法内，方法形参，代码块内，构造器内部的变量
 * 
 * 	相同点:声明格式一样 数据类型 变量名 = 变量值
 * 		   先声明 后使用
 * 		   变量都有其对应的作用域
 * 	不同点:声明的位置不同
 * 		   属性直接定义在{}中
 * 		   局部变量 定义在方法内 代码块内 构造器形参 构造器内部的变量
 * 		   
 * 			关于权限修饰符的不同
 * 		   		属性:可以在声明属性时,指明其权限 使用权限修饰符
 * 		   		常用的权限修饰符
 * 						private,public,缺省:就是在属性前面没加private和public
 * 					就是在定义属性前面加上
 * 					class Animal{
						//属性
						private String name;
				
						public void eat() {
							//局部变量
							String name ="烛炫";
						}
					}
			类的属性都有默认初始化值
			局部变量没有默认初始化值所以声明了一定要复制，形参在调用时赋值即可
			
			内存中的加载位置不同
				属性:加载在堆空间中(非static)
				局部变量:加载在栈空间
	
	
 */
public class shuxing {
		int names;
		/**
		 * names:1 表示我
		 * name:2 表示你
		 */

			
		public void eat() {
			 */
			//局部变量
			String name ="烛炫";
		}
		
}

