import java.util.*;
class Rectangle extends Shape
{
    double length,width;
    double Area;

  void input()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length and width of the rectangle");
      length=sc.nextDouble();
      width=sc.nextDouble();
  }    
  public void calculateArea()
  {
      Area=length*width;
  }    
  public void display()
  {
        System.out.println("Length=" + length +" , Width=" +width + "\nArea="+Area);
  }
     public static void main(String args[])
  {
     Rectangle obj = new Rectangle();
     obj.input();
     obj.calculateArea();
     obj.display();
  }
}
