   class design_round
{
    void spiral(int n)
    {
        int s[][]=new int[n][n];
        int b=n-1,c=1,a=1,d=0,g=n-1;int ch=n*n+1;
        while(c!=(n*n+1))
        {
            for(int i=d;i<=b;i++)
            s[d][i]=c++;
            for(int j=a;j<=b;j++)
            s[j][b]=c++;
            b--;
            for(int k=b;k>=d;k--)
            s[g][k]=c++;
            for(int m=b;m>=a;m--)
            s[m][d]=c++;
            d++;
            a++;
            g--;
        }//while closed
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ch-s[i][j]<10)
                System.out.print(ch-s[i][j]+"  ");
                else
                System.out.print(ch-s[i][j]+" ");
            }//j closed
            System.out.println();
        }//i closed
    }//method closed
}//class closed