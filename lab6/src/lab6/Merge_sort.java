package lab6;

public class Merge_sort {
	int count=0;
	int a[] =new int[20];
	Merge_sort(int a[],int i,int j)
	{
		for(;i<=j;i++)
		this.a[i]=a[i];
	}
	public void mergepass(int a[],int lb,int ub)
	{
		int mid;
		if(ub!=lb)
		{
			mid=(ub+lb)/2;
			this.mergepass(a,lb,mid);
			this.mergepass(a,mid+1,ub);
			this.mergesort(a,lb,mid,ub);
		}
		
	}
	public void mergesort(int a[],int lb,int mid,int ub)
	{
		int i,j,k;
	    int temp[]=new int[20];
		i=lb;
		j=mid+1;
		k=lb;
		while((i<=mid) && (j<=ub))
		{
			if(a[i]<=a[j])
			{
				temp[k++]=a[i++];
				count++;
			}
			else
			{
				temp[k++]=a[j++];
				count++;
			}
		}
		while(i<=mid)
		{
			temp[k++]=a[i++];
			count++;
		}
		while(j<=ub)
		{
			temp[k++]=a[j++];
			count++;
		}
		
		for(i=lb;i<=ub;i++)
		{
			a[i]=temp[i];
		}
		
	}
	
	int getcount()
	{
		return this.count;
	}

}
