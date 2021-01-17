package com.zhuxuan.pro;

public class circle {
	public static void main(String[] args) {
		aircle areas = new aircle();
		areas.radius =2.5;
		double results = areas.getArea();
		System.out.println(results);
	}
}

//Բ
class aircle{
	double radius;
	
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
}
