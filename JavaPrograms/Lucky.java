class Lucky
{
    void main(int n)
    {
        int t[]=new int [n];
        int l=t.length,c=0,m=2;
        for(int i=0;i<n;i++)
            t[i]=i+1;
        for(int i=0;i<l;i++)
            System.out.print(t[i]+" ");
        System.out.println();
        while(l>m)
        {
            c=0;
            for(int j=0;j<l;j=j+m)
            {
                t[c]=t[j];
                c++;
            }
          
            for(int i=0;i<c;i++)
                System.out.print(t[i]+" ");
            System.out.println();
            m++;
            l=c;
        }
        System.out.println("The Lucky Numbers are:");
        for(int i=0;i<c;i++)
            System.out.println(t[i]);
    }
}