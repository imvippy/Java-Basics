import java.io.*;  
public class OutputExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("D:\\My Data\\Proffestional\\Java Practice\\f1.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(5);  
        data.flush();  
        data.close();
        
        
        // FileInputStream fin = new FileInputStream("D:\\My Data\\Proffestional\\Java Practice\\f1.txt") ;
        
        // int k;
        // while ((k = fin.read()) != -1) {  
        //     //Conversion of a byte into character  
        //     char ch = (char) k;  
        //     System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
        //   }  
        // fin.close();
          

        // int j = fin.read();

        // System.out.println("aaaaaa"+j);
        // fin.close();  

        InputStream input = new FileInputStream("D:\\My Data\\Proffestional\\Java Practice\\f1.txt");  
         DataInputStream inst = new DataInputStream(input);  
    //     int count = input.available();  
    //     byte[] ary = new byte[count];  
    //     inst.read(ary);  
    //     for (byte bt : ary) {  
    //       char k = (char) bt;  
    //       System.out.print(k+"-");  
    //     }  
    //   }
   // while (inst.read()!=-1)

    System.out.print(""+inst.readInt());




    }
    } 