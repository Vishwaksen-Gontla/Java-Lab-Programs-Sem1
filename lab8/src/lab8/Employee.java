/*Aim:Develop a java application with Employee class with Emp_name, Emp_id, Address, Mail_id,
Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate 
Professor and Professor from employee class. Add Basic Pay (BP) as the member of all the 
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP 
for staff club fund. Generate pay slips for the employees with their gross and net salary*/

package lab8;

 public class Employee {
	String Emp_name;
	String Emp_id;
	String address;
	String mailid;
	String mobile_no;
	double bp;
	String str="";
	Employee(String Emp_name,String Emp_id,String address,String mailid,String mobile_no)
	{
		 this.Emp_name=Emp_name;
		 this.Emp_id=Emp_id;
		 this.address=address;
		 this.mailid=mailid;
		 this.mobile_no=mobile_no;
		 str=Emp_name+"\t\t"+Emp_id+"\t\t"+mailid+"\t\t"+mobile_no+"\t\t"+address+"\n";
		
	}
	
	public void setbp(double bp)
	{
		this.bp=bp;
	}
	public String toString()
	{
		str=str+"The base pay amount is " + bp + "\nThe DA amount is  " + bp*0.97 +
				"\nThe HRA amount is "+ bp*0.1+"\nThe PF amount is "+0.12*bp+
				"\nThe staff club fund is "+bp*0.001+"\nThe gross pay is  "+(bp+bp*(0.97+0.1))+
				"\nThe net salary after tax deduction is "+((bp+bp*(0.97+0.1))-(bp+bp*(0.97+0.1))*(0.18+0.001+0.12));
		return str;
	}

}
