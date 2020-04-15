import java.io.*;
class ManagementCollegeProject
{
static boolean leap(int n)
{boolean t=false;
if(n%100==0)
{
if(n%400==0)
{
t=true;
}
else
{
t=false;
}
}
else
{
if(n%4==0)
{
t=true;
}
else
{
t=false;
}
}
return t;
}
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input:PROJECT ALLOTMENT DATE");
int dd,mm,yy;
System.out.print("Day:");
dd=Integer.parseInt(br.readLine());
System.out.print("Month:");
mm=Integer.parseInt(br.readLine());
System.out.print("Year:");
yy=Integer.parseInt(br.readLine());
System.out.print("No of days:");
int n=Integer.parseInt(br.readLine());
System.out.println();
System.out.println("Output:PROJECT SUBMISSION DATE");
int d=0,m=mm,y=yy;
int ar[]={31,(leap(y)?29:28),31,30,31,30,31,31,30,31,30,31};
int i=1;
while(true)
{
if(i==1)
{
i=2;
if(n<=(ar[mm-1]-dd))
{
d=dd+n;
break;
}
++m;n=n-(ar[mm-1]-dd);
if(m>12)
{
m-=12;
ar[1]=(leap(++y))?29:28;
}
}
else
{
if(n<=(ar[m-1]))
{
d=n;
break;
}
else
{
n=n-ar[m-1];
++m;
if(m>12)
{
m-=12;
ar[1]=(leap(++y)?29:28);
}
}
}
}
System.out.println("Day:"+d);
System.out.println("Month:"+m);
System.out.println("Year:"+y);
}
}
