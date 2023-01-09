import java.util.*;
class A{
    A(){

    }
    public void move()
    {
        System.out.println("Class A is moving ");
    }
}
class B extends A{

    B()
    {

    }
    
    public void move()
    {
        System.out.println("Class B is moving ");
    }
}
class c extends A{
    c(){}
    public void move()
    {
        System.out.println("Class C is moving");
    }


}
public class Polymor {
    //Best example of run time polymorphism
    public static void main(String[] args) {
        A a =new c();
        a.move();


    }
    
    
}
