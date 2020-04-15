class Q29
{
int phi(int n)
{
int S=0;
for(int i=1;i<=n;i++)
{
if(gcd(n,i)==1)
S++;
}
return S;
}
int divisors(int n)
{
int S=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
S++;
}
return S;
}
void main()
{
int p=1, S=0;
for(int i=1;i<=4999;i=i+2)
{
p=divisors(i)*phi(i);
if(p%i==0)
{System.out.println(i);
S+=i;
}
}
System.out.print(S);
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
}