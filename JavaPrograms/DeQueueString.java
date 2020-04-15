import java.io.*;
class DeQueueString
{
String Dque[];
int capacity;
int F;
int R;
DeQueueString(int nx)
{
capacity=nx;//fixing size of dequeue
F=-1;R=-1;
Dque=new String[capacity];
}
void pushAtRear(String s)
{
if(R+1<capacity)
{
Dque[++R]=s;
if(F==-1)//when dequeue is empty before pushing
F=0;
}
else
System.out.println("Dequeue overflow");

}
void pushAtFront(String s)
{
if(F-1>=0)
 {
     if(R==-1)
     R=0;
  Dque[--F]=s;
 } 
else
if(F==-1)
{
F=R=0;
Dque[F]=s;
}
else
System.out.println("Dequeue overflow");
}
String popFront()
{
if(F==-1)
{
System.out.println("Dequeue underflow");
return "empty ";
}
String r= Dque[F++];
if(F>R)//dequeue becomes empty
F=R=-1;
return r;
}
String popRear()
{
if(R==-1)
{
System.out.println("Dequeue underflow");
return "empty ";
}
String r=Dque[R--];
if(F>R)
F=R=-1;
return r;
}
void DequeueDisplay()
{
if(F==-1)
System.out.println(" empty");
else
for(int i=F;i<=R;i++)
{
System.out.print(Dque[i]+" ");
}
}
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter capacity of dequeue");
int c=Integer.parseInt(br.readLine());
DeQueueString obj=new DeQueueString(c);
int ch=0;
do
{
System.out.println("Enter 1 push at front ");
System.out.println("Enter 2 push at rear ");
System.out.println("Enter 3 pop from front ");
System.out.println("Enter 4 pop from rear");
ch=Integer.parseInt(br.readLine());
String s;
switch(ch)
{
case 1:
System.out.println("Enter word to push");
 s=br.readLine();
obj.pushAtFront(s);
System.out.print("Dequeue ");
obj.DequeueDisplay();
System.out.println();
break;
case 2:
System.out.println("Enter word to push");
 s=br.readLine();
obj.pushAtRear(s);
System.out.print("Dequeue ");
obj.DequeueDisplay();
System.out.println();
break;
case 3:
System.out.println("popped "+obj.popFront());
System.out.print("Dequeue ");
obj.DequeueDisplay();
System.out.println();
break;
case 4:
System.out.println("popped "+obj.popRear());
System.out.print("Dequeue ");
obj.DequeueDisplay();
System.out.println();
break;
}
System.out.println("Enter 1 to continue,2 to stop");
ch=Integer.parseInt(br.readLine());
}while(ch==1);
}
}
/**       OUTPUT
 * Enter capacity of dequeue
3
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
1
Enter word to push
e
Dequeue e 
Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
2
Enter word to push
d
Dequeue e d 
Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
2
Enter word to push
d
Dequeue e d d 
Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
3
popped e
Dequeue d d 
Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
1
Enter word to push
q
Dequeue q d d 
Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
3
popped q
Dequeue d d 
Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
4
popped d
Dequeue d 
Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
4
popped d
Dequeue  empty

Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
3
Dequeue underflow
popped empty 
Dequeue  empty

Enter 1 to continue,2 to stop
1
Enter 1 push at front 
Enter 2 push at rear 
Enter 3 pop from front 
Enter 4 pop from rear
1
Enter word to push
dfrg
Dequeue dfrg 
Enter 1 to continue,2 to stop
2

 */