package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		
		double a = (int)(Math.random()*10 +1);
		double b = (int)(Math.random()*10 +1);
		double c = (int)(Math.random()*10 +1);
		double answer;
		
		answer = ((b + Math.sqrt((b*b) + (4*a*c))) / (2*a)) - ((Math.pow(a, 3)*c) + b);
		
		System.out.println("à = " +a+ "\r\n"
				  +"b = " +b+ "\r\n"
				  +"c = " +c+ "\r\n"
				  +"answer = " +answer);
		
		

	}

}
