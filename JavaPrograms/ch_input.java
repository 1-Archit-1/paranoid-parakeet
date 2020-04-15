import java.io.*;
class ch_input
{
InputStreamReader reader= new InputStreamReader(System.in);
BufferedReader in =new BufferedReader(reader);

int ch;
String cc;
void method(int n[])
{
int l=n.length,ans=0;
for(int i=0;i<l-1;i++)
{
for(int j=i+1;j<l;j++)
{
if(n[i]==n[j])
{
l=l-1;
for(int k=j;k<l;k++)
{
n[k]=n[k+1];
j=j+1;
ans=1;
}
}}}
if(ans==1)
{
System.out.println("you have entered a duplicate character");
System.out.println("continue entering value");}
}

int accept() throws IOException
{
cc=in.readLine();
ch=Integer.parseInt(cc);
return ch;
}

void main()throws IOException
{
int p,q;
String p1,q1;
System.out.println("enter no of elements of the array");
p1=in.readLine();
p=Integer.parseInt(p1);
int x[]=new int[p+1];
System.out.println("enter value one by one");
x[0]=accept();
for(int i=1;i<x.length;i++)
{
x[i]=accept();
method(x);
}}
}