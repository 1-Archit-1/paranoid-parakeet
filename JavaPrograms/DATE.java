import java.io.*;
class DATE
{
int ds[]={31,28,31,30,31,30,31,31,30,31,30,31};
String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
//storing no of days and month names in arrays
static int dt=0,mn=0,yer=0;
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
DATE(int d,int y)//constructor
{
if(d<1||d>360)
{
System.out.println("Wrong value of days");
System.exit(0);
}
if(noOfDigits(y)!=4||d<0)
{
System.out.println("Wrong value of year");
}
if(leap(y))
ds[1]=29;
}

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
public static void main()throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Day no ");
int d=Integer.parseInt(br.readLine());
System.out.println("Year");
int y=Integer.parseInt(br.readLine());
System.out.println("Date after");
int N=Integer.parseInt(br.readLine());
if(N<0)
{
System.out.println("Wrong value of N");
System.exit(0);
}
DATE obj=new DATE(d,y);//creating object of class DATE
System.out.println("Output");
obj.out_date(d,0,1,y);
System.out.print("Date after "+N+" days:");
obj.out_date(N,dt,mn,yer);
}
void out_date(int N,int d,int m,int y)
{
int i=1;
while(true)
{
if(i==1)
{
i=2;
if(N<=(ds[m-1]-d))
{
d=d+N;
break;
}
N=N-(ds[m-1]-d);++m;
if(m>12)
{
m-=12;
ds[1]=(leap(++y))?29:28;
}
}
else
{
if(N<=(ds[m-1]))
{
d=N;
break;
}
else
{

N=N-(ds[m-1]);
++m;
if(m>12)
{
m-=12;
ds[1]=(leap(++y)?29:28);
}
}
}
}
dt=d;mn=m;yer=y;
System.out.println(dt+" "+month[mn-1]+" "+yer);
}
}
/**                        OUTPUT
 * Day no 
233
Year
2008
Date after
17
Output
20 August 2008
Date after 17 days:6 September 2008
*/