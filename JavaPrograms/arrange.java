import java.util.*;
public class arrange
{
public static void main ()
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter a sentence");
String s=sc.nextLine();
s=s+" ";
int c=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
c++;
}
//c=c+1;
int p=0;
String temp;
int t;
int d=0;
String str[]=new String[c];
int a[]=new int [c];
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
str[d]=s.substring(p,i);
p=i+1;
d++;
}
}
for(int i=0;i<c;i++)
{
a[i]=str[i].length();
}
for(int i=0;i<c-1;i++)
{
for(int j=i+1;j<c;j++)
{
if(a[i]<a[j])
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
t=a[i];
a[i]=a[j];
a[j]=t;
}
else if(a[i]==a[j])
{
if(str[i].compareTo(str[j])<0||str[i].compareTo(str[j])==0)
continue;
else
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
}
for(int i=0;i<c;i++)
{
System.out.print(str[i]+" ");
}
}
}
