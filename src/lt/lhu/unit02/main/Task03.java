package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc;
		
		double form;
		double a;
		double b;
		double c;
		
		sc = new Scanner(System.in);
		
		System.out.print("������� ���������� a: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ���������� a: ");
		}
		a = sc.nextDouble();
		
		System.out.print("������� ���������� b: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ���������� b: ");
		}
		b = sc.nextDouble();
		
		System.out.print("������� ���������� c: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ���������� a: ");
		}
		c = sc.nextDouble();
		
		form = ((a*a) - ((b-c)*(b-c))) + (Math.log(b*b+1));
		
		System.out.print("�������� ������� � ������� ������� = " + form);

	}

}
