package com.epam.unit02.main;

public class Task18 {
//��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] �
//����� h. ��������� ����������� � ���� �������, ������ ������� ������� � ��������
//���������, ������ - ��������������� �������� �������: F(x) = sin2(x)
	public static void main(String[] args) {
    double a = 0.1;
    double b = 3;
    double h = 0.1;
    double y = 0;

    System.out.println(" -----------------------");
    System.out.println("|     x     |     y     |");

    for (double i = a; i <= b; i += h) {
        y = Math.sin(i) * Math.sin(i);
        System.out.println("------------------------");
        System.out.printf("|%.1f        ", i);
        System.out.printf("|%.6f   |\n", y);
    }
    	System.out.println("------------------------");
	}
}