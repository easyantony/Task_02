package lt.lhu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*40 +1);
		int b = (int)(Math.random()*30 +1);
		int c = (int)(Math.random()*10 +1);
		int d = (int)(Math.random()*20 +1);
	    double y;
	 
	 	y = ((a/c) * (b/d)) - ((a*b - c) / (c*d));
	 
	 	System.out.println("a = "+a+"\r\n"
	 			  +"b = "+b+"\r\n"
	 			  +"c = "+c+"\r\n"
	 			  +"d = "+d+"\r\n"
	 			  +"y = "+y+"\r\n");
	}

}
