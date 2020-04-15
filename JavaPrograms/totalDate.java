import java.io.*;
class totalDate
{
static int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
static String mm[]={"Jan","Feb","March","April","May","June","July","August","Sept","Oct","Nov","Dec"};
static int t,yy;

static int leap(int y)
{
int flag=0;
if(y%100==0)
{
if(y%400==0)
flag=1;
else 
flag=0;
}
else
if(y%4==0)
flag=1;
else flag=0;
return flag;
}

public static void main(String args[])throws IOException
{
int ext,nod=0,pos=0;
totalDate df=null;
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(reader);
System.out.println("enter no of days");
t=Integer.parseInt(in.readLine());

System.out.println("enter year");
yy=Integer.parseInt(in.readLine());

if(df.leap(yy)==1)
df.days[1]=29;
for(int i=0;i<12;i++)
{
t=t-days[i];
pos=i;
if(t<0 || t==0)
{
nod=(t+days[pos]);
break;}
}
System.out.println(nod+"days of the month"+mm[pos]+yy);
}
}

