import java.util.*;
class Columnsort
{
void main()
{Scanner sc=new Scanner(System.in);
System.out.println("Enter no of rows");
int m=sc.nextInt();
System.out.println("Enter no columns ");
int n=sc.nextInt();
int a[][]=new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("Enter value");
a[i][j]=sc.nextInt();
}
}
int t=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
for(int k=0;k<m-1-j;k++)
{
if(a[k][i]<a[k+1][i])
{
t=a[k][i];
a[k][i]=a[k+1][i];
a[k+1][i]=t;
}
}
}
}
for(int i=0;i<m;i++)
{for (int j=0;j<n;j++)
{System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
} 