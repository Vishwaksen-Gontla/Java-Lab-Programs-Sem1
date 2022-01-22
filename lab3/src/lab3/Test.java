package lab3;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount(2000); 
		SavingsAccount saver2 = new SavingsAccount(3000); 
        System.out.println("the montly interest is  for saver 1 is"+saver1.cal_montly_interes()); 
		System.out.println("the montly interest is for saver 2 is "+saver2.cal_montly_interes()); 
		System.out.println("the balance for saver1 is "+saver1.getsb()); 
		System.out.println("the balance for saver2 is "+saver2.getsb()); 
		System.out.println("the balance for saver1 is "+saver1.getsb()); 
		SavingsAccount.mair(5); 
		System.out.println("the montly interest for saver1 after modification is "+saver1.cal_montly_interes()); 
		System.out.println("the montly interest for saver2 afer modification is"+saver2.cal_montly_interes()); 
		System.out.println("the balance for saver1 is "+saver1.getsb()); 
		System.out.println("the balance for saver2 is "+saver2.getsb());   

		} 

	}


