package com.epam.unit02.main;

public class Task11 {
//���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.
	public static void main(String[] args) {
		String a = "1133445";
		String b = "1144478";
		String c = "";
		
        for (int i = 0; i < a.length(); i++){
        	for (int k = 0; k < b.length(); k++){
        		if(a.charAt(i) == b.charAt(k)){
        			if(!c.contains(String.valueOf(a.charAt(i)))){
                        c += "\n" + a.charAt(i);
                        }
                    }
                }
            }
            System.out.println("����� �������� � ������ ������� � ������� �����: " + c);
	}
}
