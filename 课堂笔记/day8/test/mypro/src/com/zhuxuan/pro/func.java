package com.zhuxuan.pro;
/*
 * ����
 * ��һ�� public void name(){}  void��ʾû�з���ֵ
 * 		class Animal{
 * 			public void name(){
 * 					
 * 			}
 * 		}
 * �ڶ��� public String name(){}  ��ʾ����ֵΪ�ַ��� һ��Ҫ�з���ֵ ��Ȼ�ᱨ��
 * 
 * 		ע�� static final abstract�����η���
 * 					Ȩ�����η� private(��ʾ˽�� ���ò�)��public��ȱʡ��protected
 * 			 ��������з���ֵ��������ڷ�������ʱ��ָ������ֵ�����ͣ�ͬʱ�������У���Ҫʹ��return �ؼ���������ָ�����͵ı�������
 * 			
 * 		�β��б�:����������������β�
 * 			��������1 �β�1,��������2 �β�2
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
		return "����һ��";
	}
	
}