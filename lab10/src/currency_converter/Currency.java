/*Aim : Develop a java application to implement currencyconverter(DollartoINR,EURO
toINR,YentoINR and vice versa), distance converter (meter to KM, miles to KM and vice 
versa), timeconverter (hours to minutes, seconds and vice versa) using packages. */

package currency_converter;

public class Currency {
	double dollar,rupee,euro,yen;
	
	public double dtr(double dollar)
	{
		this.dollar=dollar;
		rupee=dollar*74.12;
		return rupee;
	}
	
	public double rtd(double rupee)
	{
		this.rupee=rupee;
		dollar = rupee*0.013;
		return dollar;
	}
	
	public double rte(double rupee)
	{
		this.rupee= rupee;
		euro = rupee*0.012;
		return euro;
	}
	
	public double etr(double euro)
	{
		this.euro=euro;
		rupee= euro * 84.70;
		return rupee;
	}
	
    public double ytr(double yen)
    {
    	this.yen= yen;
    	rupee=yen* 0.65;
    	return rupee;
    }
    
    public double rty(double rupee)
    {
    	this.rupee=rupee;
    	yen = rupee*1.54;
    	return yen;
    }
}
