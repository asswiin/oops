import java.util.Scanner;

class Linear{
    public static void main(String args[]){
        int a,i,e;
        boolean found=false;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of element in array : ");
        a=sc.nextInt();

        int[] ar=new int[a];

        System.out.println("Enter the elements of the array : ");
        for(i=0;i<a;i++){
            ar[i]=sc.nextInt();
        }


        System.out.print("Enter the element to be searched : ");
        e=sc.nextInt();

        for(i=0;i<a;i++){
            if(ar[i]==e){
                found=true;
                break;
            }
        }
         if(found){
            System.out.println("Element is found");
         }else{
            System.out.println("Element is not found");
         }
         sc.close();
    }
}
