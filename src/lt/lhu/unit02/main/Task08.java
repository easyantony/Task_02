package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double h;
		double fx;
		
		
		System.out.print("������� �������� ������� a:");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� �������� ������� a: ");
		}
		a = sc.nextDouble();
		
		System.out.print("������� �������� ������� b:");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� �������� ������� b: ");
		}
		b = sc.nextDouble();
		
		System.out.print("������� ��������   ����  h:");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ��������   ����  h: ");
		}
		h = sc.nextDouble();
		
	   
		System.out.println(" _________ ");
		System.out.printf("|%4s|%4s|\n", "x","fx");
		System.out.println(" _________ ");
		
		
		for (double x = a; x <= b; x = x + h) {
		fx = 2 * Math.tan(x / 2) + 1;
		System.out.printf("|%4.1f|%4.1f|\n", x, fx);
	    }
	    
	    
		System.out.println(" _________ ");
		
		
			
	}
}


