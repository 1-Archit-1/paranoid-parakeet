import java.io.*;
import java.util.*;
class Encryption
{
void encode(String a[])
{
for(int i=0;i<a.length;i=i+2)
{
String r="";
StringTokenizer pm=new StringTokenizer(a[i], " .");
for(int j=0;j<=pm.countTokens()+2;j++)
r=r+change(pm.nextToken())+" ";
a[i]=r;
}
for(int i=1;i<a.length;i=i+2)
{
String r="";
StringTokenizer pm=new StringTokenizer(a[i]," .");
for(int j=0;j<=pm.countTokens()+2;j++)
r=pm.nextToken()+" "+r;
a[i]=r;
}
for(int i=0;i<a.length;i++)
System.out.println(a[i].trim()+".");
}
void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=0;
try
{
System.out.println("Enter the number of sentences");
n=Integer.parseInt(br.readLine());
if(n<1||n>10)
{
System.out.print("Wrong Input");
}
}
catch(Exception e)
{
System.out.print("Wrong Input");
}
String a[]=new String [n];
for(int i=0;i<n;i++)
{
System.out.println("Enter a sentence");
a[i]=br.readLine();
}
encode(a);
}
String change(String S)
{
int b;String r="";
for(int i=0;i<S.length();i++)
{
b=(int)S.charAt(i);
b=b+2;
if(!((b>=65&&b<=90)||(b>=97&&b<=122)))
b=b-26;
r=r+(char)b;
}
return r;
}
}