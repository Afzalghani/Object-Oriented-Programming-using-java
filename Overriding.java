import java.util.*;
class car{
    String name;
    car(String name)
    {
        this.name=name;
    }
public void moving()
    {
        System.out.println("Car is moving");
     }    
}
class Bike extends car{
    String name;
    Bike(String name1, String name2)
    {
        super(name1);
        this.name=name2;
    }
 
    @Override
    public void moving()
    {
        System.out.println("Bike is moving");
    }
    
}
public class Overriding {
    public static void main(String[] args) {
       car c1=new Bike("Maruti", "Suziki");
       c1.moving();
    }
    
}
