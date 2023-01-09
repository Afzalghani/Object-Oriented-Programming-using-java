import java.util.*;

class Book{
  String name;
  int number_Of_Page;
  Book(String name, int Number_Of_Pages)
  {
    this.name=name;
    this.number_Of_Page=Number_Of_Pages;

  }
  Page p1=new Page(number_Of_Page);

}
class Page{
   int Number_Of_Pages;
   Page(int Number_Of_Pages)
   {
    this.Number_Of_Pages=Number_Of_Pages;
   }

}
public class Composition {
    public static void main(String[] args) {

        Book b1=new Book("Wings of desire", 200);
        System.out.println(b1.p1);
        
    }
    
}
