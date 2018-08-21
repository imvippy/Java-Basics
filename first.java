class first 
{
    public static void main(String args[])
    {
       String s = "Hi";

       System.out.println(s.hashCode());

       s = s+" Hello";
       

       System.out.println(s.hashCode());

    
       StringBuffer a = new StringBuffer("Hi");

       System.out.println(a.hashCode());

       a.append(" Hello");

       System.out.println(a.hashCode());
 

    }
}