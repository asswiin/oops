import java.util.Scanner;

class Cpu {
    int price;
    
    
    class Processor {
        String no_of_cores, manufacturer;
        
        void display() {
            System.out.println("Processor Manufacturer : " + manufacturer );
            
            System.out.println("No of cores of processor : " + no_of_cores );
        }
    }

    static class Ram{
        int memory;
        String manufacturer;

        void display() {
        System.out.println("RAM memory : " + memory);
        System.out.println("RAM manufacturer : " + manufacturer);
    }
}

void display() {
    System.out.println("price : "+ price);
}
}

public class Cpuinfo {
    public static void main(String args[]){
        Cpu ncpu=new Cpu();
        Cpu.Processor processor=ncpu.new Processor();
        Cpu.Ram ram=new Cpu.Ram();

        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter details\n");
        System.out.print("--------------\n");
        System.out.print("Enter the processor manufacturer : ");
        processor.manufacturer=sc.next();

        System.out.print("Enter the no of cores of processor : ");
        processor.no_of_cores=sc.next();

        System.out.print("Enter the RAM memory size : ");
        ram.memory=sc.nextInt();

        System.out.print("Enter the RAM manufacturer : ");
        ram.manufacturer=sc.next();

        System.out.print("Enter the price : ");
        ncpu.price=sc.nextInt();

        System.out.println("\ninformation of processor and RAM ");
        System.out.print("--------------------------------------\n");
        processor.display();
        ram.display();
        ncpu.display();
    }
}
    
   
