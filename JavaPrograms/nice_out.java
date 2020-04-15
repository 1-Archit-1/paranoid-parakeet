class nice_out
{
void main()
{
int n=5;
while(true)
{
int c=0,b,x=0;
while(Math.pow(2,x)<n)
{
b=n-(int)Math.pow(2,x);
if(prime(b)==1)
c++;
x++;
}
if(c==0)
{
System.out.println(n);
break;
}
n=n+2;
}
}
int prime(int n)
{
int c=0;
for(int i=2;i<(n/2);i++)
{
if(n%i==0)
c++;
}
if(c==0)
return 1;
return 0;
}
}