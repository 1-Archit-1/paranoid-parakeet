class Q39
{
    void main()
    {
        int count=0,count1=0;
        for(int i=0;i<=1679615;i++)
        {
            String p=Hexa(i); 
            int b;
            for(int a=1;a<=7;a++)
            {
                String r="";
                for(int j=0;j<8;j++)
                {
                    b=(a+j)%8;
                    r=r+p.charAt(b);
                }
                if(check(p,r)==1)
                {
                    count1++;
                }
            }
            if(count1==7)
            {
                System.out.println(p);
                count++;
            }
            count1=0;
        }
        System.out.println(count);
    }
    String Hexa(int n)//to generate 'N' length binary of n
    {
        String S="";int a[]=new int [8];
        int b=a.length-1;
        while(n>0)
        {
            a[b]=n%6;
            b--;
            n=n/6;
        }
        for(int i=0;i<a.length;i++)
        S=S+Integer.toString(a[i]);
        return S;
    }
    int check(String p, String r)
    {
        int par=0,lar=0;
        int initial=Integer.parseInt(p); int x=0;
        for(int i=initial;i>0;i=i/10)
        {
            lar=lar+(int)Math.pow(6,x)*(initial%10);
            x++;
        }
        int fina=Integer.parseInt(p); 
        x=0;
        for(int i=fina;i>0;i=i/10)
        {
            par=par+(int)Math.pow(6,x)*(fina%10);
            x++;
        }
        if(lar==0)
        return 0;
        if(par%lar==0)
        return 1;
        return 0;
    }
}