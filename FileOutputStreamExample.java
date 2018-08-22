import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\My Data\\Proffestional\\Java Practice\\testout1.txt");    
             fout.write(99);    
             fout.close();
             FileInputStream fin= new FileInputStream("D:\\My Data\\Proffestional\\Java Practice\\testout1.txt")    ;

             int i = fin.read();
             System.out.println(""+(char)i);    

             System.out.println("success...");    
             
            }catch(Exception e){System.out.println(e);}    
      }    
}  