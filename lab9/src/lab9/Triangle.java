package lab9;

public class Triangle extends Shape {
	int height;
	int base;
	Triangle(int a ,int b)
	{
		height=a;
		base=b;
	}

	@Override
	void Print_Area() {
		// TODO Auto-generated method stub
		System.out.println("The area of triangle  is "+ 0.5*base*height +"\n");;
	}

}
