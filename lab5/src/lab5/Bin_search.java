/*Write a JAVA program to search for an element in a given list of elements using binary search 
mechanism. */


package lab5;

public class Bin_search {
	
	public int search(int a[],int lb,int ub,int key)
	{
		int mid;
		while(lb<=ub)
		{
			mid=(ub+lb)/2;
			if(a[mid]==key)
				return mid;
			else 
			{
				if(a[mid]>key)
					return this.search(a, lb, mid-1, key);
				if(a[mid]<key)
					return this.search(a, mid+1, ub, key);
			}
		}
		return -1;
	}

}
