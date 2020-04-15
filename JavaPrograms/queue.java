 
import java.util.*;
class Queue
{                                       //class Queue begins
    int ch, size=10;    
    int[]q=new int[size];               // creating the array for the queue
    int rear=-1,front=-1;
    int flag=0;
    Scanner sc=new Scanner (System.in);

    void insert_queue()
    {                                   // void insert_queue begins
        System.out.println("\nPlease Input elements");
        ch=sc.nextInt();                // accepting values from user
        if(rear<(size-1))
        {
            rear++;                     // pushing index forward
            q[rear]=ch;
            if(front==-1)
                front=0;               // in case of an empty array
        }
        else
            System.out.println("\nQueue Overflow"); // for full array
    }                                   // void insert_queue ends

    void delete_queue()
    {                                   // void delete_queue begins
        if(front==-1)
        {
            System.out.println("\nQueue Underflow"); // for empty array
            return;
        }
        else
        {
            ch=q[front];                    // popping the element
            System.out.println("Element deleted"+ch);
        }
        if(front==rear)
        {
            rear=-1;front=-1;        // if front becomes equal to rear
        }
        else
        {
            q[front]=0;
            front=front+1;          // moving the index forward 
        }
    }                               // void delete_queue ends

    void display()
    {                               // void display begins
        System.out.println("The queue is:");
        if(front==-1)
            return;               // for empty array
        for(int i=front;i<=rear;i++)
            System.out.println(q[i]+" ");
    }                             // void display ends

    void main()
    {                             // void main begins
        System.out.println("NORMAL QUEUE OPERATIONS");
        int k=0;
        System.out.println("Please choose your desired queue operation:");
        System.out.println("Press 1 to insert elements in the queue.");
        System.out.println("Press 2 to delete elements from the queue.");
        System.out.println("Press 3 to exit from the program.");
        do
        {                           //do-while loop begins
            System.out.print("Your desired choice is.....");
            k=sc.nextInt();             // Accepting the user's choice
            switch(k)
            {                           //switch-case begins
                case 1:
                insert_queue();
                display();
                break;
                case 2:
                delete_queue();
                display();
                break;
                case 3:
                System.out.println("Thank you");
                System.exit(0);
                break;
            }                           //switch-case ends
        }while(true);                   //do-while loop ends
    }                                   //void main ends
}                                       //class Queue ends