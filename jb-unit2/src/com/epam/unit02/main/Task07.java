package com.epam.unit02.main;

public class Task07 {
//��������� ���������, ������� ��������� ������� ������ ����� ������.
	public static void main(String[] args) {
		int r1=4; // ������ ������� �����
		int r2=6; // ������ ������� �����
		double s1=Math.PI*Math.pow(r1, 2); //������� ������� �����
		double s2=Math.PI*Math.pow(r2, 2); //������� ������� �����
		if (s1>s2) {
			System.out.println("������� ������� ����� ������");
		}
		if (s2>s1) {
			System.out.println("������� ������� ����� ������");
		}
	}
}