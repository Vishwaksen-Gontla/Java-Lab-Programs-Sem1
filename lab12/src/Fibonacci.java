

import java.io.*;
import java.io.PipedWriter;
//import java.io.PipedReader;
public class Fibonacci extends Thread {
	  PipedWriter fw=new PipedWriter();
      public PipedWriter getwrite()
      {
                  return fw;
      }
      public void run()
      {
                  super.run();
                  fibo();
      }
      int f(int n)
      {
                  if(n<2)
                  return n;
                  else
                  return f(n-1)+f(n-2);
      }
      void fibo()
      {
                  for(int i=2,fibv=0;(fibv=f(i))<100000;i++)
                  {
                              try{
                             
                              fw.write(fibv);
                              }
                              catch(IOException e){
                              }
                  }
      }
}


