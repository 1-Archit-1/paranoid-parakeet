 /*insert,displpay,sort,delete,insert in given postion*/
import java.util.*;
class LinkedList
{                                                    // class begins
    Scanner sc=new Scanner(System.in);
    int data;
    LinkedList add;
    LinkedList ptr,start,point,copy;
    int c=0;
    LinkedList(int n)
    {                                                // Paramterized constructor
        data=n;
        add=null;
    }
    void insert(int k)
    {                                   // method void insert begins
        point=new LinkedList(k);
        if(start==null)
        {
            start=point;
            ptr=point; 
        }
        else
        {
            ptr.add=point;
            ptr=point;
        }
        c++;
    }                               //method void insert ends
    void display()
    {                               // method void display begins
        ptr=start;
        while(ptr!=null)
        {
           System.out.println("data="+ptr.data);
           ptr=ptr.add;
        }
    }                               // method void display ends
    void delete(int k)
    {
            ptr=start;
            if(start.data==k)
            {
                start=start.add;
            }
            else
            {
                point=ptr;
                ptr=ptr.add;
                while(ptr!=null)
                {
                    if(ptr.data==k)
                    {
                        copy=ptr.add;
                        point.add=copy;
                        break;
                    }
                    point=ptr;
                    ptr=ptr.add;
                }
            }
    }                               // method void display ends
    void sort_asc()
    {                               //method void sort_asc begins
        ptr=start;
        while(ptr!=null)
         {
           point=ptr.add;
           while(point!=null)
           {
               if(ptr.data>point.data)
               {
                   data=point.data;
                   point.data=ptr.data;
                   ptr.data=data;
                }
                point=point.add;
           }
            ptr=ptr.add;
        }   
    }                           // method void sort_asc ends
    void sort_desc()
    {                           // method void sort_desc begins
        ptr=start;
        while(ptr!=null)
         {
           point=ptr.add;
           while(point!=null)
           {
               if(ptr.data<point.data)
               {
                   data=point.data;
                   point.data=ptr.data;
                   ptr.data=data;
                }
                point=point.add;
           }
            ptr=ptr.add;
        }   
    }                       // method void sort_desc ends
    void sing_insert()
    {                           // method sing_insert begins
        LinkedList nexts;
        System.out.println("Please enter a position at which to insert the value.");
        int position=sc.nextInt();
        System.out.println("Please enter a value to insert.");
        int input=sc.nextInt();
        if(position>1 && position<c)
        {
            System.out.println("Sorry. Wrong choice.");
        }
        if(position==1)
        { 
            point.data=input;
            point.add=start;
            start=point;
        }
        else if (position==c)
        {
           point.data=input ;
           point.add=null ;
           ptr=start ;
           for(int i=1;i<=c;i++) 
           {
                ptr=ptr.add ;
           }
           ptr.add=point ;
        }
        else 
        {
            point = start ;
            for (int i=1;i<position;i++ )
            {
                point=point.add;
            }
            nexts=point.add ;
            ptr=point;
            point.data=input ;
            point.add=nexts ;
            ptr.add=point ;
        }
        c++;
    }                                   // method sing_insert ends
    void main()
    {                   // method void main begins
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE WORLD OF LINKED LISTS");
        int man=0;
        do
        {
            System.out.println("Please indicate your choice as per the guidlines given below");
            System.out.println("1 to create a linked list and insert elements in it.");
            System.out.println("2 to display the contents of the linked list ");
            System.out.println("3 to delete elements.");
            System.out.println("4 to insert an element in a particular poisition.");
            System.out.println("5 to exit.");
            int ch=sc.nextInt(); int t; int flag=0;int z;
            switch(ch)
            {
                case 1:
                System.out.println("Enter the number of elements in the linked list");
                int s=sc.nextInt(); 
                for(int i=1;i<=s;i++)
                {
                    System.out.println("Please enter a value for the linked list");
                    t=sc.nextInt();
                    insert(t);
                }
                break;
                case 2:
                do
                {
                   System.out.println("Please enter 1 to display in ascending order.");
                   System.out.println("Please enter 2 to display in descending order.");
                   System.out.println("Please enter 3 to exit to menu menu");
                   int ch1=sc.nextInt();
                   switch(ch1)
                   {
                        case 1:
                        sort_asc();
                        display();
                        break;
                        case 2:
                        sort_desc();
                        display();
                        break;
                        case 3:
                        System.out.println("Returning to main menu...");
                        man=1;
                   }
                   if(man==1)
                   break;
                }while(true);
                break;
                case 3:
                System.out.println("Please enter a value to delete");
                t=sc.nextInt();
                delete(t);
                display();
                break;
                case 4:
                sing_insert();
                display();
                case 5:
                flag=1; 
                break;
                default:
                System.out.println("Sorry. Wrong choice.");
            }
            if(flag==1)
            {
                System.out.println("THANK YOU FOR VISITING THE WORLD OF LINKED LISTS");
                break;
            }
        }while(true);
    }                           // method void main ends
}                               // class ends