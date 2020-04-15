 

import java.util.*;
class Factorial_Rangeproof
{                                   //class begins
    Scanner sc=new Scanner(System.in);
    /* The following method is to demonstrate the multiplication of a 
     * String containing numbers with an integer.   */ 
    String multiply(String s,int n)
    {                               //method String mutliply begins
        int prod,carry=0;
        String answer="";
        for(int i=s.length()-1;i>=0;i--)    // loop to multiply
        {
            prod=Integer.parseInt(s.substring(i,i+1))*n;
            prod+=carry;
            answer=Integer.toString(prod%10)+answer;
            carry=prod/10;
        }
        if(carry!=0)
        answer=Integer.toString(carry)+answer;
        return answer;
    }                               //method String mutliply ends
    
    void fact()
    {                               //method void fact begins
        System.out.println("RANGEPROOF FACTORIAL");
        System.out.print("Please enter the number:-  ");
        long n=sc.nextLong();
        String fact="1";
        for(int i=1;i<=n;i++)   // loop to find the rangeproof factorial 
        {
            fact=multiply(fact,i);
        }
        System.out.println("The factorial of the number "+n+" is: "+fact);
        for(int i=0;i<5;i++)
        System.out.println();
    }                           //method void fact begins
}                              //class ends