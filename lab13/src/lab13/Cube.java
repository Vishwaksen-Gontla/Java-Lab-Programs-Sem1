package lab13;

public class Cube  extends Thread{
	int x;

	 

	 Cube(int n)
	 {	
		 x = n;
	 }
	 public void run()
	 {
		 int cub = x * x * x;
	 	System.out.println("Cube of " + x + " = " + cub );
	 }

}
