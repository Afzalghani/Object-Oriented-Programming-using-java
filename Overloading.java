import java.util.*;
class Arithmatic{
    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
public class Overloading {
    public static void main(String args[])
    {
    Arithmatic a=new Arithmatic();
    System.out.println(a.add(2,3,4));
    System.out.println(a.add(3,4,5));
    }
    
}
