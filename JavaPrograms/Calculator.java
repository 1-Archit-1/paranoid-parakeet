

import java.util.*;
class Calculator
{
Scanner sc=new Scanner(System.in);
void main ()
{
int a,b,ch;
System.out.println("1 to add");
System.out.println("2 to subtract");
System.out.println("3 to multiply");
System.out.println("4 to divide");
System.out.println("Enter your choice");
ch=sc.nextInt();
System.out.println("Enter 1st value");
a=sc.nextInt();
System.out.println("Enter 2nd value");
b=sc.nextInt();

switch(ch)
{
case 1:
System.out.println("sum of two values"+(a+b));
break;

case 2 :
System.out.println("difference of two values="+(a-b));
break;

case 3 :
System.out.println("product of two values="+(a*b));
break;

case 4 :
System.out.println("Quotient of two values="+(a/b));
break;

default:
System.out.println("wrong choice");
}
}
}



