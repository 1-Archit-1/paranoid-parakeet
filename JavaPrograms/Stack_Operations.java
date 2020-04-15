 
import java.util.*;
class Stack_Operations
{                               //class Stack_Operations begins
    Scanner sc=new Scanner (System.in);
    int []stk;int top;int size;
    Stack_Operations(int d)     // Parameterized constructor
    {                           //Constructir begins    
        size=d; 
        stk=new int[size];
        top=0;
    }                           //Constructor ends

    void main()
    {                           //main methods begins
        System.out.println("Please enter the number of elements in the stack.");
        size=sc.nextInt();
        Stack_Operations obj=new Stack_Operations(size);
        int choice=0;
        System.out.println("WELCOME TO THE WORLD OF STACK OPERATIONS!!");
        do
        {                       // do while looop begins
            System.out.println("Please enter the correct option with regards to the stack operation.");
            System.out.println("1 to push elements in the stack.");
            System.out.println("2 to pop elements from the stack.");
            System.out.println("3 to display the stack.");
            System.out.println("4 to exit.");
            choice=sc.nextInt();
            switch(choice)      // switch case construct begins
            {
                case 1: 
                System.out.println("Please enter the element to be pushed:");
                int n=sc.nextInt();
                obj.Push(n);        // calling method Push to insert a value in stack
                break;
                case 2:
                System.out.println("An element is being pop.....ped..");
                obj.Pop();          // calling method Pop to delete element from stack
                break;      
                case 3:
                obj.Display();      //calling method Display to print the stack
                break;
                case 4:
                System.out.println("THANK YOU FOR VISITING THE WORLD OF STACK OPERATIONS!!");
                System.out.println("HOPE TO SEE YOU SOON AGAIN!!");
                break;
                default:
                System.out.println("Sorry!!Invalid choice.");   // In case of wrong choice
            }                       // switch case cnstruct ends
        }while(choice!=4);          // do while loop ends
    }                               // main method ends

    void Push(int num)
    {                               // void Push begins
        if(top<size-1)
        {
            top++;
            stk[top]=num;           // inserting eleemnt in stack
        }
        else
            System.out.println("Stack Overflow!!!"); // if there is no more space left
    }                               // void Push ends

    void Pop()
    {                               // void Pop begins
        int temp=0;
        if(top>0)
        {
            temp=stk[top];          // deleting element from stack
            top=top-1;
            System.out.println("The popped value is: "+temp);
        }
        else
            System.out.println("Stack Underflow!!!");// if there are no elements in stack
    }                               // void Pop ends

    void Display()
    {                               //void Display begins
        if(top>=0)
        {
            System.out.println(" The elements of the stack are: ");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stk[i]); //Prinitng the stack
            }
        }
        else
            System.out.println("Stack Underflow!!!");   
    }                               //void Display ends
}                                   // class Stack_Operations ends