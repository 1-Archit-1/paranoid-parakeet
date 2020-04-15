import java.io.*;
class ch_pub
{
InputStreamReader reader= new InputStreamReader(System.in);
BufferedReader in =new BufferedReader(reader);
int a,b,c,d;
String s,s1,s2;
void abar()throws IOException
{
System.out.println("enter no of elements of array");
s=in.readLine();
a=Integer.parseInt(s);
int x[]=new int[a];
System.out.println("enter value one by one");
s2=in.readLine();
x[0]=Integer.parseInt(s2);
for(int i=1;i<x.length;i++)
{
s1=in.readLine();
x[i]=Integer.parseInt(s1);
for(int j=0;j<x.length;j++)
{
if(x[i]==x[j])
{
System.out.println("you have entered a repeated character");
x[i]=0;
}
}
i=i-1;
}
}
}

