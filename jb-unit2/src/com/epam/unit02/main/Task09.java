package com.epam.unit02.main;

public class Task09 {
//���� ��� �������������� �����. �������� � ������� �� �� ���, �������� ������� ��������������, � � ��������� ������� � �������������.
	public static void main(String[] args) {
		int a=5;
		int b=-8;
		double c=2.5;
		
		if (a>=0) {
			a=(int) Math.pow(a, 2);
		} else {
			a=(int) Math.pow(a, 4);
		}
		
		if (b>=0) {
			b=(int) Math.pow(b, 2);
		} else {
			b=(int) Math.pow(b, 4);
		}
		
		if (c>=0) {
			c=(int) Math.pow(c, 2);
		} else {
			c=(int) Math.pow(c, 4);
		}
		System.out.println("����� �=" + a +", ����� b=" + b +", ����� c=" + c);
	}
}