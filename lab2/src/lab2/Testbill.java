package lab2;
import java.util.Scanner;
public class Testbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cons_no;//consumer number
		String cons_name;//consumer name
		double pmr;//previous month reading 
		double cmr;//current month reading 
		String EB_con;//Eb connection
		System.out.println("Enter consumer number ");
		cons_no=sc.nextLine();
		System.out.println("Enter consumer name ");
		cons_name=sc.nextLine();
		System.out.println("Enter consumers previous month unbilled reading ");
		pmr=sc.nextDouble();
		System.out.println("Enter consumer current month electic reading");
		cmr=sc.nextDouble();
		System.out.println("Enter consumer Eb connection type(domestic or commercial)");
		 EB_con=sc.next();
		Ebill bill1=new Ebill(cons_no,cons_name,pmr,cmr,EB_con);
		System.out.println("the total bill generated is "+ bill1.bill());
		
		
		sc.close();
		

	}

}
