package com.epam.unit02.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task12 {
//��������� ��������� ������������� ������ �� ������� ������������ ��������. � �������� ������� ������� ��������� ������ ����� � ���� ������������� ��������� ������� ����� ���� �������, ������� � ������ �������������.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("������� �����>");
		
		while(sc.hasNextLine() == true) {
			String str= sc.nextLine();
			if (Pattern.matches("^[_a-zA-Z][a-zA-Z0-9_]*$", str)) {
				System.out.println("�� ����� ������ ��������");
			}else {
				System.out.println("�� ����� �������� ��������, ���������� ��� ���");
				System.out.print("> ");
			}
			}
		}
}