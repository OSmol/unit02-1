package com.epam.unit02.main;

public class TrainingTask03 {
//��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] �
//����� h. ��������� ����������� � ���� �������, ������ ������� ������� � ��������
//���������, ������ - ��������������� �������� �������: F(x)=2tg(x/2)+1
		public static void main(String[] args) {
	    double a = 0.2;
	    double b = 4;
	    double h = 0.2;
	    double y = 0;

	    System.out.println(" -----------------------");
	    System.out.println("|     x     |     y     |");

	    for (double i = a; i <= b; i += h) {
	        y = 2*Math.tan((i/2))+1;
	        System.out.println("------------------------");
	        System.out.printf("|%.1f        ", i);
	        System.out.printf("|%.6f   |\n", y);
	    }
	    	System.out.println("------------------------");
		}
}
