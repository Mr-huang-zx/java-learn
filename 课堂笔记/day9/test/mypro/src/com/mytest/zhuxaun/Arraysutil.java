package com.mytest.zhuxaun;

public class Arraysutil {
	public static void main(String[] args) {
		int[] arrs = new int[] {1,66,9,66,35};
		Arraysutil arra = new Arraysutil();
		int max = arra.getMax(arrs);
		System.out.print(max);
	}
	
	
	//��װ��ȡ���ֵ
	public int getMax(int[] arr) {
		int na =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>na) {
				na =arr[i];
			}
		}
		return na;
	}
	
	//����ķ�ת
	
}
