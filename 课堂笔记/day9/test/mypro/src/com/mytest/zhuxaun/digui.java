package com.mytest.zhuxaun;

public class digui {
	public static void main(String[] args) {
		dd d =new dd();
		int a =d.nums(4);
		System.out.print(a);
	}
}

/**
 * 
 * @author »ÆĞ¡°×
 *
 */
class dd{
	public int nums(int nu) {
		if(nu==1) {
			return 1;
		}else {
			return nu + nums(nu-1);
		}
		
		
	}
}
