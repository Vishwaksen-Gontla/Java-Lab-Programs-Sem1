import java.io.*;
import java.io.PipedWriter;
//import java.io.PipedReader;
public class prime extends Thread {
	PipedWriter pw=new PipedWriter();
    public PipedWriter getwrite()
    {
                return pw;
    }
    public void run()
    {
                super.run();
                prim();
    }
    public void prim()
    {
                for(int i=2;i<100000;i++)
                {
                            if(isprime(i))
                            {
                                        try{
                                                    pw.write(i);
                                        }
                                        catch(IOException e){
                                        }
                            }
                }
    }
    boolean isprime(int n)
    {
                boolean p=true;
                int s=(int)Math.sqrt(n);
                for(int i=2;i<=s;i++)
                {
                            if(n%i==0)
                                        p=false;
                }
                return p;
    }

}
