  
import java.io.*;    
class SequenceReadWrite{    
  public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("D:\\My Data\\Proffestional\\Java Practice\\testout.txt");    
   FileInputStream fin2=new FileInputStream("D:\\My Data\\Proffestional\\Java Practice\\testout1.txt");    
   FileOutputStream fout=new FileOutputStream("D:\\My Data\\Proffestional\\Java Practice\\testout2.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i);        
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}   