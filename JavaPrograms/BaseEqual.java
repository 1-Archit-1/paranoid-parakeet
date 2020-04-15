import java.io.*;
class BaseEqual
{
void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter two numbers");
String n1=br.readLine().toUpperCase();
String n2=br.readLine().toUpperCase();
String ch1[]=new String[n1.length()];
String ch2[]=new String[n2.length()];
int max1=0;
int max2=0;
//accepting two numbers in two string arrays
for(int i=0;i<n1.length();i++)
{
ch1[i]=""+n1.charAt(i);
}
for(int i=0;i<n2.length();i++)
{
ch2[i]=""+n2.charAt(i);
}
//finding minimum base of each number
for(int i=0;i<ch1.length;i++)
{
if(ch1[i].charAt(0)>=65&&ch1[i].charAt(0)<=90)
ch1[i]=""+((int)(ch1[i].charAt(0))-55);
if((Integer.parseInt(ch1[i]))>max1)
max1=(Integer.parseInt(ch1[i]));
}
for(int i=0;i<ch2.length;i++)
{
if(ch2[i].charAt(0)>=65&&ch2[i].charAt(0)<=90)
ch2[i]=""+((int)(ch2[i].charAt(0))-55);
if((Integer.parseInt(ch2[i]))>max2)
max2=(Integer.parseInt(ch2[i]));
}
int n=0,m=0;
++max1;++max2;
//checking whether numbers are equal at any base upto 20
for(int i=max1;i<=20;i++)
{
n=no(ch1,i);
for(int j=max2;j<=20;j++)
{
m=no(ch2,j);
if(m==n)
{
System.out.println(n1+" and "+n2+" are equal at base of " +n1 +" = "+i+" and base of "+n2+" = "+j);
System.exit(0);
}
}
}
System.out.println("nos not equal for any base upto 20");
}

int no(String ch[],int m)
//to convert number in ch[] to decimal
{
int r=0;
for(int i=0;i<ch.length;i++)
{
r+=(Integer.parseInt(ch[ch.length-1-i])*(int)Math.pow(m,i));
}
return r;
}
}
/**      OUTPUT
Enter two numbers
12
5
12 and 5 are equal at base of 12 = 3 and base of 5 = 6
Enter two numbers
10
A
10 and A are equal at base of 10 = 10 and base of A = 11
Enter two numbers
123
456
nos not equal for any base upto 20
Enter two numbers
42
36
42 and 36 are equal at base of 42 = 7 and base of 36 = 8

 */