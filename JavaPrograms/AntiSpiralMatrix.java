class AntiSpiralMatrix
{
int nD(int n)
{int c=0;
while(n!=0)
{
n=n/10;c++;
}
return c;
}
void main(int n)
{int a[][]=new int[n][n];
int a1=1,b1=n;
int a2=2,b2=n;
int a3=1,b3=n-1;
int a4=2,b4=n-1;
int c=1;
int k=0;
while(c<=n*n)
{
for(int i=a1;i<=b1;i++)
{a[k][i-1]=n*n+1-c++;
}
++a1;--b1;
for(int i=a2;i<=b2;i++)
{a[i-1][n-1-k]=n*n+1-c++;
}
++a2;--b2;
for(int i=b3;i>=a3;i--)
{a[n-1-k][i-1]=n*n+1-c++;
}
++a3;--b3;
for(int i=b4;i>=a4;i--)
{a[i-1][k]=n*n+1-c++;
}
++a4;--b4;
++k;
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+((nD(a[i][j])==2)?" ":"  "));
}
System.out.println();
}
}
}