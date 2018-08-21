class Human
{
    String name;
    int age;
    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void walk()
    {
        System.out.println("Can Walk");
    }
}
class Boy extends Human
{
    String fName;
    Boy(String name,int age, String fName)
    {
        super(name, age);
        this.fName = fName;
    }
    void factory()
    {
        System.out.println("Name "+name+" age "+age+" Factory Name "+fName);
    }
    
}
class SingleInheritance
{
    public static void main(String[] args) {
        Boy boy = new Boy("ajit",21,"Volvo");
        boy.factory();
    }
}