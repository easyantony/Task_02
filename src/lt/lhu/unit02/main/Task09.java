package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		
		int x;
		double fx;
		
		x = (int)(Math.random()*(20+1))-10;
		
		if (x <= -3) {
			fx = 9;
			  System.out.print("x = " + x + ", значит fx = " + fx);
		}if (x > 3) {
			fx = (1/ (Math.pow(x,2) + 1));
			  System.out.print("x = " + x + ", значит fx = " + fx);
		}if (x < 3 & x > -3) {
			  System.out.print("ѕростите, число не попало в диапазон");
		}
			

	}

}
