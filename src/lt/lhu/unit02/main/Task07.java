package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*(200+1))-100;
		int b = (int)(Math.random()*(200+1))-100;
		int c = (int)(Math.random()*(200+1))-100;
		int z2 = 2, z4 = 4;
		
		
		if (a>=0) {
			System.out.println("Number a = " + a + ". This number positive. Its square = " + Math.pow(a, z2));
		
		}else {
			System.out.println("Number a = " + a + ". This number negative. Its fourth power = " + Math.pow(a, z4));
		      }
		 
		
		if (b>=0) {
			System.out.println("Number b = " + b + ". This number positive. Its square = " + Math.pow(b, z2));
				
		}else {
			System.out.println("Number b = " + b + ". This number negative. Its fourth power = " + Math.pow(b, z4));
			  }
		
		
		if (c>=0) {
			System.out.println("Number c = " + c + ". This number positive. Its square = " + Math.pow(c, z2));
					
		}else {
			System.out.println("Number c = " + c + ". This number negative. Its fourth power = " + Math.pow(c, z4));
			  }
				
	}
		
}
