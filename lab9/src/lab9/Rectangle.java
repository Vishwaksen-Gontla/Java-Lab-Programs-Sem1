package lab9;

public class Rectangle extends Shape {
	int length;
	int breadth;
	Rectangle(int a,int b)
	{
		length=a;
		breadth=b;
	}
	
	void Print_Area() {
		// TODO Auto-generated method stub
		System.out.println("The area of rectangle  is "+ length*breadth +"\n");

    }
}
