import java.util.Scanner;

class Linear{
    public static void main(String args[]){
        int limit,key,i;
        boolean found=false;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of element in array : ");
        limit=sc.nextInt();

        int array[]=new int[limit];

        System.out.println("Enter the elements of the array : ");
        for(i=0;i<limit;i++){
            array[i]=sc.nextInt();
        }


        System.out.print("Enter the element to be searched : ");
        key=sc.nextInt();

        for(i=0;i<limit;i++){
            if(array[i]==key){
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
