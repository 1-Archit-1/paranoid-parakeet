public class recur_palin1
{
int s=0;
 void main(int a)
  { 
   int m=back(a,0);
   System.out.println(m);
        if(m==a)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");
    }
    int back(int n,int s)
    {       
            if(n==0)
            return s;
            else
           { s=(s*10)+n%10;
             return back(n/10,s);}
           
            
        }
          

    }
