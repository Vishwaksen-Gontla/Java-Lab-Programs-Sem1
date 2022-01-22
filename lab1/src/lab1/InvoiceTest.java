package lab1;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice apple=new Invoice();
		apple.set_number("121NHMJK");
		apple.set_des("apple is the product");
		apple.set_quan(50);
		apple.set_price(9.50);
		System.out.println(apple.get_number()+"\n"+apple.get_des()+"\n"+apple.get_quan()+"\n"+apple.get_price()+"\n");
		System.out.println(apple.getInvoiceAmount()+" "+"is the total bill amount");

	}

}
