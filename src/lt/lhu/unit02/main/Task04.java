package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner sc;
		
		int a,b,c;
		int sum;
		
		sc = new Scanner(System.in);
		
		System.out.print("Введите переменную a: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("Вы ввели не число.");
			System.out.print("Введите переменную a: ");
		}
		a = sc.nextInt();
		
		System.out.print("Введите переменную b: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("Вы ввели не число.");
			System.out.print("Введите переменную b: ");
		}
		b = sc.nextInt();
		
		System.out.print("Введите переменную c: ");
		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.println("Вы ввели не число.");
			System.out.print("Введите переменную c: ");
		}
		c = sc.nextInt();
		
		
		sum = a + b + c;
		
		System.out.print("Сумма данных чисел = " + sum);
		

	}

}
