import java.util.Scanner;
import java.util.Arrays;

public class binary
{
	public static void main(String args[])
	{
		int i,j,limit,result,temp,key;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit of array : ");
		limit=sc.nextInt();
		
		int array[]=new int[limit];
		
		System.out.println("Enter the elements into the array : ");
		for(i=0;i<limit;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println();
		Arrays.sort(array);
		
		
		System.out.println("Array after sorted");
		for(i=0;i<limit;i++)
		{
			System.out.println(array[i]);
		}
		System.out.print("\nEnter the element to search : ");
		key=sc.nextInt();
		
		result=binarysearch(array,0,limit-1,key);
		
		if(result==-1)
		{
			System.out.println("Element not found in the array");
		}
		else
		{
			System.out.println("\nElement found at index : " +result);
		}
		sc.close();
	}
	
		public static int binarysearch(int arr[],int low,int high,int key)
		{
			while(low<=high)
			{
				int mid=low+(high-low)/2;
				
				if(arr[mid]==key)
					return mid;
				if(arr[mid]<key)
					low=mid+1;
				else
					high=mid-1;
			}
			return -1;
		}
}

