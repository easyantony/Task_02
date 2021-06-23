package lt.lhu.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100 +1);		
		int b = (int)(Math.random()*100 +1);
		int gip;
		int S;
		
		gip = a*a + b*b;
		
		S = (a*b) / 2;
		
		System.out.println("Сторона треугольника а = " +a);
		System.out.println("Сторона треугольника b = " +b);
		System.out.println("Гипотенуза треугольника = " +gip);
		System.out.println("Площадь треугольника = " +S);
		
		
		

	}

}
