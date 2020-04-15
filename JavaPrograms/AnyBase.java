 

import java.util.*;
class AnyBase
{                                        // class begins
    long num;
    int base;
    AnyBase(long nu, int ba)            // Parameterized constructor
    {
        num = nu;
        base = ba;
    }
    boolean isCompatible()
    {                                   // method isCompatible begins
        long copy = num;
        int dig=0;
        while(dig<base && copy>0)
        {
            dig = (int) copy%10;
            copy/=10;
        }
        return copy==0?true:false;       // returning if the input number is compatible with input base
    }                                   // method isComaptible ends
    void display() 
    {                                   // method display begins
        System.out.print(num+" (Base "+base+")");
    }                                  //method display ends
    AnyBase toBase10()
    {                                  // method toBase10 begins
        long copy = num;
        int  dig=0, cnt=0;
        AnyBase base10 = new AnyBase(0, 10);
        while(copy>0)
        {
            dig = (int)copy%10;
            copy/=10;
            base10.num+=dig*Math.pow(base, cnt++);
        }
        return base10;                  // returning the input number converted to decimal equivalent
    }                                   // method toBase10 ends
    AnyBase toBaseX(int baseX)
    {                                   // method toBaseX begins   
        long copy=toBase10().num;
        int rem=0, cnt=0;
        AnyBase decBase = new AnyBase(0, baseX);
        while(copy>0)
        {
            rem = (int)copy%baseX;
            copy/=baseX; 
            decBase.num += rem * Math.pow(10, cnt++);
        }
        return decBase;                 // returning the input number in any base
    }                                   // method toBaseX ends
    void showConversion(int baseX)
    {                                   // method showConversion begins
        AnyBase obj = new AnyBase(toBaseX(baseX).num, baseX);
        if(isCompatible())
        {
            System.out.println("\n\nConversion shown BELOW: ");
            display();
            System.out.print(" = ");
            obj.display();
        }
        else
            System.out.println("The BASE is not found COMPATIBLE with the number!");
    }                               // method showConversion ends
    void main()
    {                               // method void main begins
        Scanner sc=new Scanner (System.in);
        long num; 
        int base, toBase;

        System.out.print("Enter the number (in any base): ");
        num = sc.nextLong();  
        System.out.print("Enter the base (of the previous number entered): ");
        base = sc.nextInt();
        System.out.print("Enter the base (to convert into): ");
        toBase = sc.nextInt();
        AnyBase obj = new AnyBase(num, base);
        obj.showConversion(toBase);
        for(int i=0;i<5;i++)
        System.out.println();
    }                           // method void main ends
}                               //class ends

