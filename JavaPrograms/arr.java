import java.util.*;
class arr
{
public void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("no.of element");
int c=sc.nextInt();
int a[]=new int[c];int i,j;
for(i=0;i<c;i++)
{
System.out.println("Enter a number");
a[i]=sc.nextInt();
}
System.out.println("no.of elements");
int m=sc.nextInt();
int b[]=new int[m];
for(i=0;i<m;i++)
{
System.out.println("Enter a number");
b[i]=sc.nextInt();
}
int t[]=new int[m+c];
int d=0,n=0;
for(i=0;i<m;i++)
{
for(j=d;j<c;j++)
{
if(a[j]<b[i])
{
t[n]=a[j];n++;d=j+1;
}
}
t[n]=b[i];n++;
}
for(i=0;i<n;i++)
{
System.out.println(t[i]+"   ");
}
}
}