package lab6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {45,67,43,89,9};
		Merge_sort ms= new Merge_sort(a,0,4);
		for(int i=0;i<5;i++)
			System.out.println(a[i]);
		ms.mergepass(a, 0, 4);
		System.out.println("after sorting :");
		for(int i=0;i<5;i++)
			System.out.println(a[i]);
		
		System.out.println("No of exchanges is"+ms.getcount());
		

	}

}
