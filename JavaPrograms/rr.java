
/* String Manipulation*/
class rr
{ 
    void f(String S, int n, int b)
    { 
        String r=""; int l=S.length();
        for(int j=n;j>=1;j--)
        {
            int flag=0;
            for(int i=n-j;i<l;)
            {
                r=r+S.charAt(i);
                if(j>1 && flag==0)
                {
                    i=i+2*j-2;
                    flag=1;
                }
                else if(j>1 && flag==1 && j<n)
                {
                    i=i+2*n-2*j;
                    flag=1;
                }
                else
                    i=i+2*n-2;
            } 
        }
        System.out.print(r);
    }}