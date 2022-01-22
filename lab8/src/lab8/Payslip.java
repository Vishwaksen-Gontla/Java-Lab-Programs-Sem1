package lab8;

public class Payslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p= new Professor("rahul","243","vij","rahul123@gmail.com","9854366556");
		Assistant_Professor ap = new Assistant_Professor("ram","244","vij","ram123@gmail.com","9854545699");
		Associate_Professor asp=new Associate_Professor("ramesh","245","vij","ramesh123@gmail.com","9785455699");
		Programmer pm= new Programmer("rajesh","246","vij","rajesh123@gmail.com","8956555699");
		
		p.setbp(100000);
		ap.setbp(75000);
		asp.setbp(85000);
		pm.setbp(150000);
		
		System.out.println(p+"\n\n");
		System.out.println(ap+"\n\n");
		System.out.println(asp+"\n\n");
		System.out.println(pm+"\n\n");

	}

}
