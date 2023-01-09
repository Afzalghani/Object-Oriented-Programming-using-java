import java.util.*;
abstract class Person{
    String name;
    String address;

    Person(String name, String address)
    {
        this.name=name;
        this.address=address;

    }

}

class Human extends Person{
 
    Human(String name, String address)
    {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Human ["+super.name+",\n "+super.address +"]";
    }

    
}

 public class AbstractionPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Human h=new Human("Afzal", "Mayur Bihar Extension");
        System.out.println(h);
        
    }
    
}
