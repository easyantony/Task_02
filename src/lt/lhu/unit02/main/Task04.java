package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner sc;
		
		int a,b,c;
		int sum;
		
		sc = new Scanner(System.in);
		
		System.out.print("������� ���������� a: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ���������� a: ");
		}
		a = sc.nextInt();
		
		System.out.print("������� ���������� b: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ���������� b: ");
		}
		b = sc.nextInt();
		
		System.out.print("������� ���������� c: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ���������� c: ");
		}
		c = sc.nextInt();
		
		
		sum = a + b + c;
		
		System.out.print("����� ������ ����� = " + sum);
		

	}

}
