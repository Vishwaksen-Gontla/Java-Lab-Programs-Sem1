/*Aim:Develop a Java application to generate Electricity bill. Create a class with the following 
members: Consumer no., consumer name, previous month reading, current month reading, and 
type of EB connection (i.e. domestic or commercial). Compute the bill amount using the 
following tariff. [CO1]
If the type of the EB connection is domestic, calculate the amount to be paid as follows:
1. First 100 units - Rs. 1 per unit
2. 101-200units - Rs. 2.50 per unit
3. 201 -500 units - Rs. 4 per unit
4. >501 units - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to be paid as follows:
5. First 100 units - Rs. 2 per unit
6. 101-200units - Rs. 4.50 per unit
7. 201 -500 units - Rs. 6 per unit
8. >501 units - Rs. 7 per unit*/
package lab2;

public class Ebill {
	String cons_no;//consumer number
	String cons_name;//consumer name
	double pmr;//previous month reading 
	double cmr;//current month reading 
	String EB_con;//Eb connection
	double bill=0.0;
	
	Ebill(String cons_no,String cons_name,double pmr, double cmr, String EB_con){
		this.cons_no=cons_name;
		 this.cons_name=cons_name;
	     this.pmr= pmr;
		 this.cmr=cmr;
		 this.EB_con=EB_con;
		
	}
	double bill()
	{
		double tmr=pmr+cmr;
		if(EB_con.equals("domestic"))
		{
			if(tmr>501)
			{
				bill=bill+((tmr-500)*6);
				tmr=tmr-(tmr-500);
			}
			if(tmr>200)
			{
				bill=bill+((tmr-200)*4);
				tmr=tmr-(tmr%500);
			}
			if(tmr>100)
			{
				bill=bill+((tmr-200)*2.50);
				tmr=tmr-(tmr%500);
			}
			if(tmr>0)
			{
				bill=bill+tmr*1;
				tmr=0;
			}
		}
		else
		{
			if(tmr>501)
			{
				bill=bill+((tmr-500)*7);
				tmr=tmr-(tmr-500);
			}
			if(tmr>200)
			{
				bill=bill+((tmr-200)*6);
				tmr=tmr-(tmr%500);
			}
			if(tmr>100)
			{
				bill=bill+((tmr-200)*4.50);
				tmr=tmr-(tmr%500);
			}
			if(tmr>0)
			{
				bill=bill+tmr*2;
				tmr=0;
			}
			
		}
		return bill;
	}
	
	

}
