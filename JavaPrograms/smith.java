class smith
{
int sumOfDigits(int n)
{
int c=0;
while(n!=0)
{
c+=n%10;
n=n/10;
}
return c;
}
void main(int n)
{
int s=0;int no=n;int k=n/2;
for(int  i=2;i<=k;i++)
{
while(n%i==0)
{s=s+sumOfDigits(i);
n=n/i;
}
}
if(sumOfDigits(no)==s)
System.out.println("Smith number");
else
System.out.println("Not a smith number");
}
}
