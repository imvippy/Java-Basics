interface Showable{  
  void show();  
//   interface Message{  
//    void msg();  
//   }  
}  
class TestNestedInterface1 implements Showable{  
 //public void msg(){System.out.println("Hello nested interface");}  
  //public void show(){System.out.println("hi");}
 public static void main(String args[]){  
  //Showable.Message message=new TestNestedInterface1();//upcasting here  
  //message.msg();  
  System.out.println("Hello nested interface");
 }  
} 