package com.epam.unit02.main;

public class Task05 {
//��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.
	public static void main(String[] args) {
		int a=4;
		int b=6;
		int s=2; // �������
		double x=Math.pow(a, s);
		double z=Math.pow(b, s);
		if (x>z) {
			System.out.println("������� ����� b ������ �������� ����� a");
		}
		if (x<z) {
			System.out.println("������� ����� a ������ �������� ����� b");
		}
	}
}