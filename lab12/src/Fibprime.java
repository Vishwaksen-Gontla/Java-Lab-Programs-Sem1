import java.io.IOException;
public class Fibprime {


		// TODO Auto-generated method stub
		   public static void main (String[] args) throws IOException {
               Fibonacci fi=new Fibonacci();
               prime pri=new prime();
               Receiver r=new Receiver(fi,pri);
               fi.start();
               pri.start();
               r.start();
              
	}

	}

