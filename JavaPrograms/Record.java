class Record
{
void Con(int n,int a)
{
if(n==0)
System.out.print("");
else
Con(n/2, n%2);
System.out.print(a);
}
}
