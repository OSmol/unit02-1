package com.epam.unit02.main;

import java.util.Scanner;

public class TrainingTask04 {
//��������� �������� ������� F(x), 9: ���� x<=-3, 1/x2+1: ���� x>3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("������� �������� x:");
        double x = sc.nextDouble();
		if (x<=-3 ) {
			System.out.println("F(x)=9");
		} else if (x>3) {
			System.out.println("F(x)= " + (1 / (Math.pow(x,2) + 1)));
		} else {
			System.out.println("F(x) - �� �������, � ������ ���� ������ ��� ����� -3 ��� ������ 3");
		}
	}
}
