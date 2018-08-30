import java.io.FileInputStream;
import java.*;

class UncheckedException
{
    public static void main(String[] args) {
        String s = "a";
 
        try{
           // Class a = Class.forName(hi);
            int i = Integer.parseInt(s);
           // int j = 5/0;
        }
        
        catch(Exception c)
        {
            System.out.print("Divide By Zero ");
        }
    }
}