import java.util.*;
interface Bank{
    int x=4; //This variable is implicity public , final and static means it is constant
    //This interface only has only constant data member
    
    default void print(){
        System.out.println("Printing inside the interface"+x);
    }
    public double InterestAmout();
}

class SBI implements Bank{
     
    public double InterestAmout()
    {
        return 23.5;
    }
  void Print()
  {
    System.out.println("The value of x is "+x);
  }
}
public class InterfaceExample {
    public static void main(String args[])
    {
        SBI s=new SBI();
        s.Print();

    }

    
}
