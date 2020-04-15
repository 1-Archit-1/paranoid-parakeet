import java.io.*;
class spiralMatrix
{
int nD(int n)
{int c=0;
while(n!=0)
{
n=n/10;c++;
}
return c;
}
void main()throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the order of the matrix");///accepting order of spiralmatrix
int n =Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
int a1=1,b1=n;
int a2=2,b2=n;
int a3=1,b3=n-1;
int a4=2,b4=n-1;
int c=1;
int k=0;
//filling numbers in array
while(c<=n*n)
{
for(int i=a1;i<=b1;i++)
{a[k][i-1]=c++;
}
++a1;--b1;
for(int i=a2;i<=b2;i++)
{a[i-1][n-1-k]=c++;
}
++a2;--b2;
for(int i=b3;i>=a3;i--)
{a[n-1-k][i-1]=c++;
}
++a3;--b3;
for(int i=b4;i>=a4;i--)
{a[i-1][k]=c++;
}
++a4;--b4;
++k;
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+((nD(a[i][j])==2)?" ":"  "));//printing the spiral matrix
}
System.out.println();
}
}
}         
/**                                       OUTPUT
 * Enter the order of the matrix
   9

   1  2  3  4  5  6  7  8  9  
   32 33 34 35 36 37 38 39 10 
   31 56 57 58 59 60 61 40 11 
   30 55 72 73 74 75 62 41 12 
   29 54 71 80 81 76 63 42 13 
   28 53 70 79 78 77 64 43 14 
   27 52 69 68 67 66 65 44 15 
   26 51 50 49 48 47 46 45 16 
   25 24 23 22 21 20 19 18 17 

 */                                  