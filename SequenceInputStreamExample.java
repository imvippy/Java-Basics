import java.io.*;  
class SequenceInputStreamExample {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("D:\\My Data\\Proffestional\\Java Practice\\testout1.txt");    
   FileInputStream input2=new FileInputStream("D:\\My Data\\Proffestional\\Java Practice\\testout.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
}    