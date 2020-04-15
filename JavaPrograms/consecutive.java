import java.io.*;
public class consecutive
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException
    {
        String s,r;
        System.out.print("Enter string:");
        s=in.readLine();
        s=s.concat(" ");
        System.out.println("The consecutive nos. are:");
        char c,d,m,n;
        int p=0,q=0;
        c=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            d=s.charAt(i);
            if(c==d-1)
            {
                p=i-1;
                for(int j=i;j<s.length()-1;j++)
                {
                    m=s.charAt(j+1);
                    n=s.charAt(j);
                    if(n!=m-1)
                    {
                        q=j+1;
                        break;
                    }
                }
                i=q;
                r=s.substring(p,q);
                System.out.println(r);
            }
            else
                c=s.charAt(i);
        }
    }
}