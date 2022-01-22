package lab9;

public class Test {
	public static void main(String args[])
	{
		Circle c = new Circle(45);
		Triangle t = new Triangle(30,35);
		Rectangle r = new Rectangle(30,35);
		
		c.Print_Area();
		t.Print_Area();
		r.Print_Area();
	}

}
