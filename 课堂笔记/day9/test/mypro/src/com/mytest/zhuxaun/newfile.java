package com.mytest.zhuxaun;

public class newfile {
	public static void main(String[] args) {
		Data data =new Data();
		data.a =10;
		data.b = 20;
		newfile as =new newfile();
		as.funs(data);
		System.out.print(data.a);
		System.out.print(data.b);
	}
	
	public void funs(Data data) {
		int tem = data.a;
		data.a =data.b;
		data.b=tem;
		
	}
	
	
}
class Data{
	int a;
	int b;
}


