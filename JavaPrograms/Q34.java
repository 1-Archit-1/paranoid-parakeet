class Q34
{
double sum(int n)
{
int S=0;
for(int i=1;i<=n;i++)
{
if(gcd(n,i)==1)
S+=i*i;
}
double b=(double)S/(n*n);
return b;
}
int gcd(int a,int b)
{
int hcf=0,min;
min=(a<b)?a:b;
for(int i=1;i<=min;i++)
{
if(a%i==0 &&b%i==0)
hcf=i;
}
return hcf;
}
void main()
{
double S=0.0;
for(int i=1;i<=2013;i++)
{
if(2013%i==0)
S=S+sum(i);
}
System.out.print((int)S);
}
}