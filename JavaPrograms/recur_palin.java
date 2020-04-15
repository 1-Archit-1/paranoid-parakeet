public class recur_palin
{
    void main(int a)
    {
        int r=0;
        int m=palin(a,r);
        if(m==a)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");
    }
    int palin(int s,int t)
    {
        
        if(s==0)
            return(t);
        else
        {
            t=(t*10)+(s%10);
            return palin(s/10,t);

        }
       
    }
}