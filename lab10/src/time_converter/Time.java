package time_converter;

public class Time {
	double hrs,mins,sec;
	
	public double htm(int hrs)
	{
		this.hrs=hrs;
		mins=hrs*60;
		return mins;
	}
	
	public double mth(int mins)
	{
		this.mins=mins;
		hrs =mins/60;
		return hrs;
	}
	
	public double mts(int mins )
	{
		this.mins=mins;
		sec=mins*60;
		return sec;
	}
	
	public double stm(int sec)
	{
		this.sec=sec;
		mins=sec/60;
		return mins;
	}
	
	public double hts(int hrs)
	{
		this.hrs=hrs;
		sec=hrs*3600;
		return sec;
	}
	
	public double sth(int sec)
	{
		this.sec=sec;
		hrs = sec/3600;
		return hrs;
	}

}
