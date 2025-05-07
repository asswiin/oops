import java.io.*;
class file {
    public static void main(String args[])throws IOException {
        String source="Hello Wolrd";
        byte buf[]=source.getBytes();
        FileInputStream fin;
        int i;
        try {
            FileOutputStream fi=new FileOutputStream("file.txt");
            for(i=0;i<buf.length;i++)
            fi.write(buf[i]);
        }
        catch(IOException e) {
            System.out.println("An IO Error occured");
        }
        try {
            fin=new FileInputStream(args[0]);
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("usage:showfile file");
            return;
        }
        do {
            i=fin.read();
            if(i!=-1)
            System.out.println((char)i);
        }
        while(i!=-1);
    }
}
