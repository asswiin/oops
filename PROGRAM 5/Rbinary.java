import java.util.Scanner;
import java.util.Arrays;
class Binary
{
    void bSearch(int arr[],int l,int r,int item) 
    {
        int m=(l+r)/2;
        if (l > r) {
            System.out.println("\nNot Found");
            return;
        }
        if(arr[m]==item)
        {
            System.out.println("\nFound");
            return;
        }
            if(arr[m]<item)
            {
            bSearch(arr,m+1,r,item);
            }
            if(arr[m]>item)
            {
            bSearch(arr,l,m-1,item);
            }
    }
    public static void main(String args[])
    {
        int n,i,item;
        Binary b=new Binary();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number of elements :");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("\nEnter "+n+" numbers :");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.print("\nEnter item to search :");
        item=sc.nextInt();
        b.bSearch(arr,0,n-1,item);
    }
}
