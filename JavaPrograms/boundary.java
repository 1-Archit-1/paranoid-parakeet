import java.io.*;
public class boundary
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        int m,n,t;
        System.out.print("Enter no. of rows:");
        m=Integer.parseInt(in.readLine());
        System.out.print("Enter no. of columns:");
        n=Integer.parseInt(in.readLine());
        int a[][]=new int[m][n];
        System.out.print("Enter nos.:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              t=Integer.parseInt(in.readLine());
                a[i][j]=t;
            }
        }
        
          // printing original array
        System.out.println("printing the original array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {if(a[i][j]%10 !=0)
            System.out.print(a[i][j]+"   ");
            else
                System.out.print(a[i][j]+" ");
                }
                System.out.println();
                }
          System.out.println();      
        //sorting begins
      int len=(n*2)+(m-2)*2;
        int b[]=new int[len];
        int r=0,c=0,x=0,y=n-1,f=0;
        for (int i=0;i<n;i++)
        {
        b[c]=a[r][i];
        c++;
        }
        for(int i=1;i<m;i++)
        {b[c]=a[i][n-1];
        c++;
        }
        for(int i=n-2;i>=0;i--)
        {
        b[c]=a[m-1][i];
        c++;
        }
        for(int i=m-2;i>0;i--)
        {
        b[c]=a[i][0];
        c++;
        }
        //sorting of b array
        for(int i=0;i<c-1;i++)
        {
        for(int j=i+1;j<c;j++)
        {
        if(b[i]>b[j])
        {
        x=b[j];
        b[j]=b[i];
        b[i]=x;
        }}}
        //returning sorted value to the main array
        
       for (int i=0;i<n;i++)
        {
        a[r][i]=b[f];
        f++;
        }
        for(int i=1;i<m;i++)
        {a[i][n-1]=b[f];
        f++;
        }
        for(int i=n-2;i>=0;i--)
        {
        a[m-1][i]=b[f];
        f++;
        }
        for(int i=m-2;i>0;i--)
        {
        a[i][0]=b[f];
        f++;
        } 
        
        // printing changed array
      System.out.println("printing the changed array");  
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(a[i][j]%10 !=0)
            System.out.print(a[i][j]+"   ");
            else
            System.out.print(a[i][j]+" ");
                }
                System.out.println();
                }
    System.out.println("printing the boundary elements");  
      //printing the boundary elements
       x=0;int s=0;
      for(int i=0;i<n;i++)
      {
      s=s+a[x][i];
      System.out.print(a[x][i]+" ");//first line
      }
      System.out.println();
      //printing middle
      for(int i=1;i<m-1;i++)
      {
      for(int j=0;j<n;j++)
      {
      if(j==0 || j==(n-1))
      {
      s=s+a[i][j];
      System.out.print(a[i][j]+" ");//middle elements
      }
      else
      System.out.print(" "+" ");
      }
      System.out.println();
      }//i closed
      //printing last
      for(int i=0;i<n;i++)
      {
      s=s+a[m-1][i];
      System.out.print(a[m-1][i]+" ");//last line
      }
      System.out.println();
      System.out.println("sum of the outer boundary="+s);
      }
      }
      
