import currency_converter.Currency;
import time_converter.Time;
import distance_converter.Distance;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Currency c = new Currency();
		Time t = new Time();
		Distance d = new Distance();
		
		System.out.println("The converted value of 10 dollars is "+c.dtr(10));
		System.out.println("The converted value of 10 euro    is "+c.etr(10));
		System.out.println("The converted value of 10 yen     is "+c.ytr(10));
		
		System.out.println("The converted value of 10 rupee into dollar is "+c.rtd(10));
		System.out.println("The converted value of 10 rupee into euro   is "+c.rte(10));
		System.out.println("The converted value of 10 rupee into yen    is "+c.rty(10));
		
		
		System.out.println("The converted value of 300 hrs to mins  is "+t.htm(300));
		System.out.println("The converted value of 300 hrs to sec   is "+t.hts(300));
		System.out.println("The converted value of 6380 mins to hrs is "+t.mth(6380));
		System.out.println("The converted value of 6380 mins to sec is "+t.mts(6380));
		System.out.println("The converted value of 6380 sec to hrs  is "+t.sth(6380));
		System.out.println("The converted value of 6380 sec to mins is "+t.stm(6380));
		
		
		System.out.println("The converted value of 5426 km to miles is "+d.ktmi(5426));
		System.out.println("The converted value of 5426 km to meter is "+d.ktm(5426));
		System.out.println("The converted value of 5426 meter to km is "+d.mtk(5426));
		System.out.println("The converted value of 5426 meter to miles is"+d.mtmi(5426));
		System.out.println("The converted value of 5426 miles to km is "+d.mitk(5426));
		System.out.println("The converted value of 5426 miles to meter is "+d.mitm(5426));
		
		
		}

}
