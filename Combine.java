import java.util.*;
interface bank{
    public double interestRate(double rate);
    
}
class StateBank implements bank{
    String name;
    double amount;
    //double rate;

    StateBank(String name, double amount)
    {
        this.name=name;
        this.amount=amount;
        //this.rate=rate;
    }
    public double interestRate(double rate)
    {
      return   (this.amount*rate)/100;
    }
}
public class Combine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("Enter the custome name");
         String name=input.next();

         System.out.println("Enter the payment amount");
         double amout=input.nextDouble();

         bank b=new StateBank(name, amout);
         System.out.println(b.interestRate(5));

    }

    
}