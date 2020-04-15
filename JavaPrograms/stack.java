class stack
{
int a[]=new int[10];
int ctr=0;


void push(int n)
{
if(ctr<9)
a[ctr++]=n;

}

void pop()
{
if(ctr<=9)
System.out.println(a[ctr--]);

}
void display()
{
for(int i=ctr-1;i>=0;i--)
{
System.out.println("value="+a[i]);
}
}
void main()
{
for(int i=0;i<6;i++)
{
push(1);
push(2);
push(3);
push(4);
push(5);
}
display();
pop();
pop();
display();
}
}
