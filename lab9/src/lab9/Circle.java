package lab9;

public class Circle extends Shape {
	int radius;
	Circle(int a)
	{
		radius=a;
	}

	@Override
	void Print_Area() {
		// TODO Auto-generated method stub
		System.out.println( "The area of circle  is "+3.14*radius*radius+"\n");
	}

}
