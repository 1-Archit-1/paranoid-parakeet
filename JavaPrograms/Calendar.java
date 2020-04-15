import java.io.*;
class Calendar
{
int n=0;
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
Calendar(int yy,String bb,int d,int m,int y)
{
if(leap(y))
ds[1]=29;
if((yy!=y)||(noOfDigits(yy)!=4)||(m>12)||(m<1)||(d>ds[m-1])||(d<1))
{
System.out.println("Wrong input");
System.exit(0);
}
for(int i=0;i<s.length;i++)
{
if(bb.equalsIgnoreCase(s[i]))
{n=i;
break;
}
if(i==s.length-1)
{
System.out.println("Wrong input");
System.exit(0);
}
}
}
static String mn[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
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
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter year");
int yy=Integer.parseInt(br.readLine());
System.out.println("Enter first day of year");
String bb=br.readLine();
System.out.println("Enter month");
int m=-1;
String acc=br.readLine();
for(int i=0;i<mn.length;i++)
{
if(acc.equalsIgnoreCase(mn[i]))
{m=i+1;//m stores month number
break;
}
}
if(m==-1)
{
System.out.println("Wrong input");
System.exit(0);
}
int d=1;
int y=yy; 
Calendar obj=new Calendar(yy,bb,d,m,y);
int N=0;
int M=1;
while(true)
{
if(M!=m)
{
N+=obj.ds[M-1];
}
else
{
N+=d;
break;
}
M++;
}
int no=((N%7+obj.n-1)>6)?(N%7+obj.n-1)-7:(((N%7+obj.n-1)<0)?(N%7+obj.n-1+7):(N%7+obj.n-1))+1;
String arr[][]=new String[5][7];
int dt=1-no;
for(int i=0;i<5;i++)
{
for(int j=0;j<7;j++)
{
++dt;
if(dt>0)
arr[i][j]=Integer.toString(dt);
else
arr[i][j]=" ";
if(dt+1>obj.ds[m-1])
dt=-100;
}
}
for(int i=0;i<7;i++)
{
System.out.print(obj.s[i].charAt(0)+"   ");
}
System.out.println();
for(int i=0;i<5;i++)
{
for(int j=0;j<7;j++)
{
System.out.print(arr[i][j]+" "+((arr[i][j].length())==2?" ":"  "));
}
System.out.println();
}
}
}
/**                          OUTPUT
 * Enter year
2012
Enter first day of year
SUNDAY
Enter month
JUNE
S   M   T   W   T   F   S   
                    1   2   
3   4   5   6   7   8   9   
10  11  12  13  14  15  16  
17  18  19  20  21  22  23  
24  25  26  27  28  29  30  

 */