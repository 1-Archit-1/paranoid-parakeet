class debo
{
void main()
{
for(int i=1;i<=10;i++)
{
if(Mystery(i)==1)
System.out.print(i);
}
}
int Mystery(int n)
{
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
c++;
}
if(c%2==1)
return 1;
return 0;
}
}