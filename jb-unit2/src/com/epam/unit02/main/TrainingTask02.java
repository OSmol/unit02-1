package com.epam.unit02.main;

public class TrainingTask02 {
//���������� ������� �� ����� ����� �� 1 �� 5.
//���������� ������� �� ����� ����� �� 5 �� 1.
//���������� ������� �� ����� ������� ��������� �� 3.
	public static void main(String[] args) {
		for(int i=1; i<6; i++) {
		System.out.println(i);
		}
		
		System.out.println("-------------------------------");
		
		for(int i=5; i>=1; i--) {
		System.out.println(i);
		}	
		
		System.out.println("-------------------------------");
		
		for(int i=0; i<=10; i++) {
			System.out.println(i + "*3 =" + i*3);
		}	
	}
}