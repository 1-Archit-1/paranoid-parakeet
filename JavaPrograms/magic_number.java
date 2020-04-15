
class magic_number
{
    int method1(int x)
    {
        int s=0,c=0,b,k;
        while(x!=0)
        {
            k=x%10;
            s=s+k;
            x=x/10;
        }
        return s;
    }

    void magic(int p)
    {
        int pp,t;
        t=method1(p);
        while(t/10!=0)
        {
            t=method1(t);
        }
        if(t==1)
        System.out.println(p+" is a magic number");
        else
        System.out.println(p+"is not a magic number");
    }
}
