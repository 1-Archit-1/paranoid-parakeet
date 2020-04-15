 
import java.util.*;
class Partition
{                               // class Partition begins
    Scanner sc=new Scanner(System.in);
    void main()
    {                           // void main begins
        System.out.println("PARTITIONS");
        System.out.println("Please enter a number to be partitioned.");
        int n=sc.nextInt();     // Accepting a nubmer from the user
        String s="";
        int flag=0;
        System.out.println(n);
        for(int i=n;i>0;i--)
        {                       //outer for loop begins
            for(int j=i;j>0;j--)
            {                   //inner for loop begins
                s="";flag=0;
                if((i+j)==n)
                {
                    s+=i+"  "+j;
                    flag=1;
                }
                else
                {
                    if((i+j)<n)
                    {
                        s+=i+"  "+j+"  ";
                        int m=i+j;
                        int l=1;
                        while(true)
                        {               // while loop begins
                            if((m+l)==n)    
                            {
                                s+=1;
                                flag=1;
                                break;
                            }
                            if((m+l)<n)
                            {
                                m+=1;
                                s+=1+"  ";
                                continue;
                            }
                            if((m+l)>n)
                                break;
                        }               // while loop ends
                    }
                    if(flag==1)
                        System.out.println(s);
                }
            }                       // inner for loop ends
        }                           // outer for loop ends
    }                               // void main ends       
}                                   // class Partition ends

/*
 * PARTITIONS
Please enter a number to be partitioned.
9
9
7  1  1
6  2  1
6  1  1  1
5  3  1
5  2  1  1
5  1  1  1  1
4  4  1
4  3  1  1
4  2  1  1  1
4  1  1  1  1  1
3  3  1  1  1
3  2  1  1  1  1
3  1  1  1  1  1  1
2  2  1  1  1  1  1
2  1  1  1  1  1  1  1
1  1  1  1  1  1  1  1  1
*/
