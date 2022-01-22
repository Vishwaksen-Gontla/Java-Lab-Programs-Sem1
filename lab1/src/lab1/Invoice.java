/*Aim:  Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. 
 An Invoice should include four pieces of information as instance variables-a part number (type String),a 
 part description(type String),a quantity of the item being purchased (type int) and a price per item (double).
 Your class should have a constructor that initializes the four instance variables. Provide a set and a get method  
 for each instance variable. In addition, provide a method named getInvoiceAmount() that calculates the invoice 
amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity
is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a 
test application named InvoiceTest that demonstrates class Invoice’s capabilities.*/

package lab1;

public class Invoice {
	String number;
	String description;
	int quantity;
	double price;
	Invoice()
	{
		number="";
		description="";
		quantity=0;
		price=0.0;
	}
	void set_number(String x)
	{
		number=x;
	}
	String get_number()
	{
		return number;
	}

	void set_des(String x)
	{
		description=x;
	}
	String get_des()
	{
		return description;
	}

	void set_quan(int x)
	{
		if(x>0)
		quantity=x;
	}
	int get_quan()
	{
		return quantity;
	}

	void set_price(double x)
	{
		if(x>0)
		price=x;
	}
	double get_price()
	{
		return price;
	}
	
	double getInvoiceAmount()
	{
		return price*quantity;
	}


}
