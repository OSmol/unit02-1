package com.epam.unit02.main;

import java.util.Scanner;

public class TrainingTask01 {
//��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � ������� �� ����� ����� 7, � ��������� ������ � ����� 8.
//��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � ������� �� ����� ����� �yes�, � ��������� ������ � ����� �no�
//��������� ��������� ��������� ���������� ����� � � ����� 3. ������� �� ����� ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�.
	public static void main(String[] args) {
	int a=2;
	int c=3;
	if (a<c) {
		System.out.println(7);
	} else {
		System.out.println(8);
	}
	
	System.out.println("-------------------------------");
	
	if (a<c) {
		System.out.println("yes");
	} else {
		System.out.println("no");
	}
	
	System.out.println("-------------------------------");
	
	Scanner sc= new Scanner(System.in);
	System.out.println("������� �����: ");
	int b=sc.nextInt();
	if (b<3) {
		System.out.println("yes");
	} 
	if (b>3)
		System.out.println("no");
	}
}