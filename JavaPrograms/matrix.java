import java.io.*;
public class matrix
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    int m,n;
    int a[][];
    matrix(int g,int f)
    {
        m=g;
        n=f;
        a=new int[m][n];
    }
    void inp()throws IOException
    {
        int t;
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("");
                t=Integer.parseInt(in.readLine());
                a[i][j]=t;
            }
        }
    }
    void swap(int b,int c,int d)
    {
        for(int i=0;i<n-1;i++)
        {
            if(a[0][i]<d)
            {
                a[b][c]=a[0][i];
                a[0][i]=d;
                d=a[b][c];
            }
        }
        for(int i=0;i<m-1;i++)
        {
            if(a[i][n-1]<d)
            {
                a[b][c]=a[i][n-1];
                a[i][n-1]=d;
                d=a[b][c];
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[m-1][i]<d)
            {
                a[b][c]=a[m-1][i];
                a[m-1][i]=d;
                d=a[b][c];
            }
        }
        for(int i=m-1;i>=0;i--)
        {
            if(a[i][0]<d)
            {
                a[b][c]=a[i][0];
                a[i][0]=d;
                d=a[b][c];
            }
        }
    }
    void main()throws IOException
    {
        int p,q;
        System.out.print("No. of rows:");
        p=Integer.parseInt(in.readLine());
        System.out.print("No. of columns:");
        q=Integer.parseInt(in.readLine());
        matrix mx=new matrix(p,q);
        mx.inp();
        for(int i=0;i<n-1;i++)
            mx.swap(0,i,a[0][i]);
        for(int i=0;i<m-1;i++)
            mx.swap(i,n-1,a[i][n-1]);
        for(int i=n-1;i>=0;i--)
            mx.swap(m-1,i,a[m-1][i]);
        for(int i=m-1;i>=0;i--)
            mx.swap(i,0,a[i][0]);
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}