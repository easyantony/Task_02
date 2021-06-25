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
		
		System.out.print("Введите переменную a: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("Вы ввели не число.");
			System.out.print("Введите переменную a: ");
		}
		a = sc.nextDouble();
		
		System.out.print("Введите переменную b: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("Вы ввели не число.");
			System.out.print("Введите переменную b: ");
		}
		b = sc.nextDouble();
		
		System.out.print("Введите переменную c: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("Вы ввели не число.");
			System.out.print("Введите переменную c: ");
		}
		c = sc.nextDouble();
		
		form = ((a*a) - ((b-c)*(b-c))) + (Math.log(b*b+1));
		
		System.out.print("Значение формулы с данными числами = " + form);

	}

}
