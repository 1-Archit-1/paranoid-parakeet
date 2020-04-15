import java.io.*;
import java.util.*;
class EncodeDecode
{
void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter string");
String s=br.readLine();
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i)))  
{
decode(s);
return;
}
}
encode(s);
}
void encode(String w)//easier -send each word
{
w=w.toLowerCase();
StringTokenizer sc=new StringTokenizer(w);
int n=sc.countTokens();
StringBuffer s[]=new StringBuffer [n];
StringBuffer r=new StringBuffer();
for(int i=0;i<n;i++)////easier -send each word ,strknzer in main
{
s[i]=new StringBuffer(sc.nextToken());//array of objects 

int a[]=new int[s[i].length()];
 for(int j=1;j<=a.length;j++)
 {
 a[j-1]=j;
 }
 int t=0;
 char temp=0;
for(int j=0;j<s[i].length();j++) 
{
for(int k=0;k<s[i].length()-1-j;k++)
{
if(s[i].charAt(k)>s[i].charAt(k+1))
{

temp=s[i].charAt(k);
s[i].setCharAt(k,s[i].charAt(k+1)); 
s[i].setCharAt(k+1,temp); //interchange char in sbuffr in this way
t=a[k];
a[k]=a[k+1];
a[k+1]=t;
}
}
}
r.append(s[i]);
for(int j=0;j<s[i].length();j++)
{
r.append(a[j]);
}
r.append(" ");
}
System.out.println(r);
}
void decode(String w)
{
StringTokenizer sc=new StringTokenizer(w);
int N=sc.countTokens();
StringBuffer s[]=new StringBuffer [N];
StringBuffer r=new StringBuffer();
for(int i=0;i<N;i++)
{
 int t=0;
 char temp=0;
s[i]=new StringBuffer(sc.nextToken());
int n=s[i].length()/2;
String se=s[i].substring(0,n);
int no=Integer.parseInt(s[i].substring(n));
int a[]=new int[n];
for(int j=0;j<n;j++)
{
a[n-j-1]=no%10;
no/=10;
}
for(int j=0;j<n;j++) 
{
for(int k=0;k<n-1-j;k++)
{
if(a[k]>a[k+1])
{
temp=s[i].charAt(k);
s[i].setCharAt(k,s[i].charAt(k+1)); 
s[i].setCharAt(k+1,temp); //interchange char in sbuffr in this way
t=a[k];
a[k]=a[k+1];
a[k+1]=t;
}
}
}
r.append(s[i].substring(0,n)+" ");
}
System.out.println(r);
}
}
/**
enter string
we are going ouT
ew21 aer132 ggino15342 otu132 
enter string
ew21 aer132 ggino15342 otu132 
we are going out 

 */