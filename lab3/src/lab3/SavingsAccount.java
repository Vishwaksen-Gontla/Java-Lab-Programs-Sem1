/*Aim : Create class SavingsAccount. Use a static variable annualInterestRate to store the annual 
interest rate for all account holders. Each object of the class contains a private instance variable 
savingsBalance indicating the amount the saver currently has on deposit. Provide method 
calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance 
by annualInterestRate divided by 12 this interest should be added to savingsBalance. Provide 
a static method modifyInterestRate that sets the annualInterestRate to a new value.Write a 
program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and 
saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, 
then calculate the monthly interest and print the new balances for both savers. Then set the 
annualInterest Rate to 5%, calculate the next month�s interest and print the new balances for 
both savers. */


package lab3;

public class SavingsAccount {
	
	static double air=4;//annual interest rate 
	private double sb;//savings balance 
	double mi;//montly interest 

	SavingsAccount(double amount) 

	{ 
	    this.sb=amount; 
	} 

	 double getsb() 
	 { 
	     return sb; 
	 } 

	double cal_montly_interes() 
	{ 
	    mi=((sb*air)/1200); 
	    sb=sb+mi; 
	    return mi; 
    } 

	static void mair(double rate) 
	{ 
	    air=rate; 
	} 

} 


