/*distance converter (meter to KM, miles to KM and vice-versa)*/
package distance_converter;

public class Distance {
	double km,miles,meter;
	
	public double ktmi(int km)
	{
		this.km=km;
		miles=km/1.609;
		return miles;
	}
	
	public double mitk(int miles)
	{
		this.miles=miles;
		km=miles*1.609;
		return km;
	}
	
	public double mtk(int meter)
	{
		this.meter=meter;
		km=meter/1000;
		return km;
	}
	
	public double ktm(int km)
	{
		this.km=km;
		meter= km*1000;
		return meter;
	}
	
	public double mitm(int miles)
	{
		this.miles=miles;
		meter=miles*1609.34;
		return meter;
	}
	
	public double mtmi(int meter)
	{
		this.meter= meter;
		miles=meter*1609;
		return miles;
	}

}
