import java.util.Scanner;

public class binary
{
    public static void main(String args[])
    {
        int i,j,limit,result,temp,key;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit in array : ");
        limit=sc.nextInt();
        
        int array[]=new int[limit];
        
        System.out.println("Enter element to array : ");
        for(i=0;i<limit;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println();
        for(i=0;i<limit-1;i++)
        {
            for(j=i-1;j<limit;j++)
            {
                if(array[i]>array[j])
                {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
    }
    
    System.out.println("Array after sorted : ");
    for(i=0;i<limit;i++)
    {
        System.out.println(array[i]);
    }
    
    System.out.print("Enter element to search : ");
    key=sc.nextInt();
    
    result= binarysearch(array,0,limit-1,key);
    
    if(result==-1)
    {
        System.out.println("item not found ");
    }
    else
    {
        System.out.println("item found : " +result);
    }
    sc.close();
}

public static int binarysearch(int arr[],int high,int low,int key)
{
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(arr[mid]==key)
        return key;
        if(arr[mid]<key)
        low=mid+1;
        else
        high=mid-1;
    }
    return -1;
}
}
