import java.io.*;
class DayFrequency
{
int no=0;
int noOfDigits(int n)//to count the no of digits
{
int c=0;
while(n!=0)
{
++c;
n=n/10;
}
return c;
}
DayFrequency(String bb,int y,int n)
{
if(leap(y))
ds[1]=29;
else
ds[1]=28;
if((noOfDigits(y)!=4)||n<0||noOfDigits(n+y)>4)//checking validity of input
{
System.out.println("Wrong input");
System.exit(0);
}
for(int i=0;i<s.length;i++)
{
if(bb.equalsIgnoreCase(s[i]))
{no=i;
break;
}
if(i==s.length-1)
{
System.out.println("Wrong input");
System.exit(0);
}
}
}
String s[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int ds[]={31,28,31,30,31,30,31,31,30,31,30,31};
boolean leap(int y)//to check whether year is leap year
{
if(y%100==0)
{
if(y%400==0)
return true;
else
return false;
}
else
{
if(y%4==0)
return true;
else
return false;
}
}
int dayNo(int y,int d,int m)//to evaluate day of week for a date
{
if(leap(y))
ds[1]=29;
else
ds[1]=28;
int N=0;
int M=1;
while(true)
{
if(M!=m)
{
N+=ds[M-1];
}
else
{
N+=d;
break;
}
M++;
}
return(((N%7+no-1)>6)?(N%7+no-1)-7:(((N%7+no-1)<0)?(N%7+no-1+7):(N%7+no-1)));
}
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter year");
int y=Integer.parseInt(br.readLine());
System.out.println("enter the day of 1 Jan ");
String d=br.readLine(); 
System.out.println("Enter the value of n");
int n=Integer.parseInt(br.readLine());
int y2=y+n-1;
int f[]=new int[7];
DayFrequency obj=new DayFrequency(d,y,n);
for(int i=y;i<=y2;i++)
{
for(int j=1;j<=12;j++)
{
++f[obj.dayNo(i,13,j)];
if(j==12)
{obj.no=obj.dayNo(i,31,12)+1;
if(obj.no>7)
obj.no-=7;
}
}
}
for(int i=0;i<7;i++)
System.out.println(obj.s[i]+" "+f[i]);
}
}
/**       OUTPUT
 *Enter year
1900
enter the day of 1 Jan 
monday
Enter the value of n
20
Sunday 33
Monday 34
Tuesday 33
Wednesday 35
Thursday 35
Friday 34
Saturday 36
______________
Enter year
1900
enter the day of 1 Jan 
monday
Enter the value of n
400
Sunday 687
Monday 685
Tuesday 685
Wednesday 687
Thursday 684
Friday 688
Saturday 684

*/
