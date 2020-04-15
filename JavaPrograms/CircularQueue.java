import java.io.*;
class CircularQueue 
{
String Queue[];
int capacity;
int front,rear;
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
CircularQueue obj=new CircularQueue();
int N=0;
do
{
System.out.println("Enter 1 to push, 2 to pop ,3 to exit");
N=Integer.parseInt(br.readLine());
switch(N)
{
case 1 : System.out.println("Enter name to push");
         String s=br.readLine();
         obj.push(s);
         obj.display();
         break;
case 2 : obj.pop();
         obj.display();
         break;
default: obj.display();
       
}
}while(N==1||N==2);
}


CircularQueue()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter capacity of queue ");
int N=Integer.parseInt(br.readLine());
Queue=new String[N];
capacity=N;
front=-1;
rear=-1;
}
void push(String s) //to push an element into queue
{
     if(front==-1&&rear==-1)//Queue is empty
        {
         front=0;
         rear++;
         Queue[rear]=s;
        }
   else
      if((front==0&&rear==capacity-1)||(front==rear+1))//Queue is full
      System.out.println("Overflow");
   else
      if(rear==capacity-1)
        {
            rear=0;
            Queue[rear]=s;
        }  
    else
      {++rear;
       Queue[rear]=s;
      }
}


void pop()//to pop an element
{
      if(front==-1)//Queue is empty
       {
       System.out.println("Underflow");
       }
    else
       {
       System.out.println("Popped "+Queue[front]);
       if(front==rear)
       front=rear=-1;
       else
       if(front==capacity-1)
       front=0;
       else
       front++;
    }
    
}


void display()// to display Queue
{
if(front==-1&&rear==-1)
     {System.out.println("Queue empty");
      return;
     }
System.out.print("Queue    ");
if(front <=rear)
{
for(int i=front;i<=rear;i++)
{
System.out.print(Queue[i]+" ");
}
}
else
{
for(int i=front ;i<Queue.length;i++)
System.out.print(Queue[i]+" ");
for(int i=0;i<=rear;i++)
System.out.print(Queue[i]+" ");
}
System.out.println();
}
}
/**   OUTPUT
 Enter capacity of queue 
3
Enter 1 to push, 2 to pop ,3 to exit
1
Enter name to push
w
Queue    w 
Enter 1 to push, 2 to pop ,3 to exit
2
Popped w
Queue empty
Enter 1 to push, 2 to pop ,3 to exit
1
Enter name to push
c
Queue    c 
Enter 1 to push, 2 to pop ,3 to exit
1
Enter name to push
c
Queue    c c 
Enter 1 to push, 2 to pop ,3 to exit
1
Enter name to push
c
Queue    c c c 
Enter 1 to push, 2 to pop ,3 to exit
1
Enter name to push
c
Overflow
Queue    c c c 
Enter 1 to push, 2 to pop ,3 to exit
2
Popped c
Queue    c c 
Enter 1 to push, 2 to pop ,3 to exit
2
Popped c
Queue    c 
Enter 1 to push, 2 to pop ,3 to exit
1
Enter name to push
e
Queue    c e 
Enter 1 to push, 2 to pop ,3 to exit
1
Enter name to push
e
Queue    c e e 
Enter 1 to push, 2 to pop ,3 to exit
1
Enter name to push
e
Overflow
Queue    c e e 
Enter 1 to push, 2 to pop ,3 to exit
3
Queue    c e e 

*/



           