
package lab5;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		int a[] = new int[20];
		int size;
		int key,pos;
		Bin_search bs = new Bin_search();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of values in the array:");
		size=scan.nextInt();
		System.out.println("Enter sorted array values:\n");
		for(int i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the value to search \n");
		key=scan.nextInt();
		pos=bs.search(a, 0, size-1, key);
		if(pos==-1)
			System.out.println("The element is not found in the given array ");
		else
			System.out.println("the element is found at position " + pos);
		
		
        scan.close();
	}

}
