import java.io.*;
import java.util.*;
class TimeToWords extends noWord 
{
static int h,m;//variables to store hour and minutes
TimeToWords()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter time ");
String  p=br.readLine();//accepting time as hour,minutes
StringTokenizer s=new StringTokenizer(p,",");
h=Integer.parseInt(s.nextToken());//extracting hour
m=Integer.parseInt(s.nextToken());//extracting minutes
if(h<0||h>12||m<0||m>=60)
{
System.out.println("Wrong input");
System.exit(0);
}
}
public static void main()throws IOException
{
noWord  obj=new noWord();//inheriting a class to print a number in words
TimeToWords ob=new TimeToWords();
if(m==0)
System.out.println(obj.print(h)+"o'clock");
else
if(m==15)
System.out.println("Quarter past "+obj.print(h));
else
if(m==30)
System.out.println("Half past "+obj.print(h));
else
if(m==45)
System.out.println("Quarter to "+obj.print(((h<12)?(h+1):1)));
else
if(m<30)
System.out.println(obj.print(m)+"minutes past " +obj.print(h));
else
System.out.println(obj.print(60-m)+"minutes to "+obj.print(((h<12)?(h+1):1)));
}
}
class noWord//class to print a number in form of words
{
String  print(int n)
{String a[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight",
          "Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
          "Sixteen","Seventeen","Eighteen","Nineteen"};
String b[]={" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy",
"Eighty","Ninety"};
 int no=noOfDigits(n);
String s="";
switch(no)

{
case 1:s+=a[n]+" ";
break;
case 2:
if(n<20)
s=s+a[n]+" ";
else
{
s=s+b[n/10]+" ";
if((n%10)!=0)
s=s+a[n%10]+" ";
}
break;
}
return s;}
int noOfDigits(int n)
{
int c=0;
while(n!=0)
{
++c;
n=n/10;
}
return c;
}
}
/**                                OUTPUT
 * Enter time 
1,0
One o'clock
Enter time 
3,15
Quarter past Three 
Enter time 
4,23
Twenty Three minutes past Four 
Enter time 
5,30
Half past Five 
Enter time 
6,45
Quarter to Seven 
Enter time 
4,56
Four minutes to Five 
Enter time 
12,50
Ten minutes to One 

 */