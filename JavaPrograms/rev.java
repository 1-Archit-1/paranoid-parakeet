class rev
{
int s=0,r=0;
void main(int n)
{
int p=n,d;
d=rever(p);
System.out.println(d);
if(d==n)
System.out.println("pallindrome");
else
System.out.println("not pallindrome");
}
int rever(int n)
{
if(n==0)
return s;
else
{
s=(s*10)+n%10;
return rever(n/10);
}
}
}