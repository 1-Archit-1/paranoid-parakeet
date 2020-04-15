class happy
{
    int d,s;
    int check(int n)
    {int k;
        if(n/10==0)
            return n;
        else
        {k=n;s=0;
            while(k!=0)
            {
                s=s+k%10;
                k=k/10;
            }
            return check(s);
        }
    }

    void main(int n)
    {
        int p=check(n);
        if(p==1)
            System.out.println("Happy no");
        else
            System.out.println("not a happy no");
    }}
