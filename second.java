class A
{
    void show()
    {
        System.out.println("Show");
        
    }
}
class B extends A
{

    static A x = new B();
    static B a =(B) x;
    
    void showB()
    {
        System.out.println("show B");
    }
}
class second
{
    public static void main(String[] args) {
    
        System.out.println("hjhhjhjhjh");
 
        A a = new A();

        a.show();

        B b = new B();

        b.show();

        A c = new B();
        c.show();


        System.out.println();
    

        
         B.a.show();
         B.a.showB();

        B d = (B) c;

        d.show();

        d.showB();

        }
}