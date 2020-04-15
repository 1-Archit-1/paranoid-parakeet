 

import java.util.*;
class Merge_Linked
{                                       //class begins
    Merge_Linked link;int data;
    Scanner s1=new Scanner(System.in);
   
    void enter()
    {                                   // void insert begins
        Merge_Linked nptr,ptr,start;
        System.out.println("Enter 1st no. for first link list");
        int n = s1.nextInt();           //Starting node for first linked list
        nptr=new Merge_Linked();
        nptr.data=n;
        nptr.link=null;
        ptr=nptr;
        start=nptr;
        Merge_Linked nptr1,ptr1,start1;
        System.out.println("Enter 1st no. for second link list");
        int q = s1.nextInt();           // Starting node for second linked list
        nptr1=new Merge_Linked();
        nptr1.data=q;
        nptr1.link=null;
        ptr1=nptr1;
        start1=nptr1;
        int y;
        int x;
        while(true)
        {
            System.out.println("Enter elements for first linked list");
            x = s1.nextInt();
            if(x==0)                    // Condition for ending user inputs in the first linked list
            break;
            nptr=new Merge_Linked();
            nptr.link=null;
            nptr.data=x;
            ptr.link=nptr;
            ptr=nptr;
            
            System.out.println("Enter elements for second linked list");
            y=s1.nextInt();
            if(y==0)                    // Condition for ending user inputs in the first linked list
            break;
            nptr1=new Merge_Linked();
            nptr1.link=null;
            nptr1.data=y;
            ptr1.link=nptr1;
            ptr1=nptr1;
        }
        System.out.println("The first linked list is:");
        ptr=start;
        while(ptr!=null)
        {
            System.out.println("data="+ptr.data);
            ptr=ptr.link;
        }
        System.out.println("The second linked list is:");
        ptr=start1;
        while(ptr!=null)
        {
            System.out.println("data="+ptr.data);
            ptr=ptr.link;
        }
        nptr.link=start1;
        nptr=start;                     // Merging the last node of the first list with the first node of the second.
        while(nptr!=null)
        {
            System.out.println(nptr.data);
            nptr=nptr.link;
        }
    }                                       //void main ends
}                                           // class ends