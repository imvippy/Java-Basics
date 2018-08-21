class Property 
{
    String propertyName;
    Property(String name)
    {
        this.propertyName = name;
    }

}
class Father extends Property
{
    String fName;
    Father(String fName,String propertyName)
    {
        super(propertyName);
        this.fName = fName;
    }

}
class Son extends Father
{
    String sName;
    Son(String sName,String fName,String propertyName)
    {
        super(fName,propertyName);
        this.sName = sName;
    }
    void printDetails()
    {
        System.out.print("Property Holder "+sName+" Acuared Property "+propertyName+" From his father "+fName);
    }
}

class MultiLevelInheritance
{
    public static void main(String[] args) {
     Son son = new Son("Vijay","Prakash","Bangalo");

     son.printDetails();
    }
}