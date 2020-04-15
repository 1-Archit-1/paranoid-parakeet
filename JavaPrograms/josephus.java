class josephus
{
void main(int n)
    {
        int a[]=new int[n];
        for(int i=1;i<=n;i++)//loop to fill elements in the array. 
        a[i-1]=i;
        int p=2,i=1,flag=0,k,m;
        
        do
        {
            if(n%2==0)
            m=n/2;
            else
            m=(n/2)+1;
       
            for(k=i;k<m;k++)//loop to shift the elements
            {
               a[k]=a[p];
             System.out.print(a[k]+" "); 
              p=p+2;
            }
            System.out.println();
            if(a[k-1]==a[n-1])
            {
                i=0;
                p=1;
            }
            else
            {
                 i=1;
                 p=2;
            }
                n=n-(n/2);
            }
             while(n>1);
        System.out.println();
        System.out.println("The safe spot is "+a[0]);
        }
    }