import java.io.*;
public class sorting_2D
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
                System.out.print("");
                t=Integer.parseInt(in.readLine());
                a[i][j]=t;
            }
        }
        
        //sorting begins
        int g,h;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                g=a[i][j];
                for(int k=0;k<m;k++)
                {
                    for(int l=0;l<n;l++)
                    {
                        if(g<a[k][l])
                        {
                            h=a[k][l];
                            a[k][l]=a[i][j];
                            a[i][j]=h;
                            g=a[i][j];
                        }
                    }
                }
            }
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}
/*Enter no. of rows:5
Enter no. of columns:6
Enter nos.:5
5
6
7
89
8
8
5
4
3
9
5
9
3
5
6
7
7
8
8
8
8
8
8
8
8
8
8
8
8
Sorted array is:
3	3	4	5	5	5	
5	5	6	6	7	7	
7	8	8	8	8	8	
8	8	8	8	8	8	
8	8	8	9	9	89
*/