import java.util.*;
class Triangle extends Shape
{
    double base,height;
    double Area;

  void input()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the base and height of the rectangle");
      base=sc.nextDouble();
      height=sc.nextDouble();
  }    
  public void calculateArea()
  {
      Area=0.5*base*height;
  }    
  public void display()
  {
        System.out.println("base=" + base +" , height=" +height + "\nArea="+Area);
  }
     public static void main(String args[])
  {
     Triangle obj = new Triangle();
     obj.input();
     obj.calculateArea();
     obj.display();
  }
}
