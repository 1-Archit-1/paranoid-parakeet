class count
{
int x,y;
void main(int m, int p)//m=Slope, p=x coordinate of the point
{
x=p;
y=m*p;
System.out.print(counter(0,0));//Means calculating under the line joining (0,0) and (p, mp). 
if(counter(0,0)==Conjecture(m,p))
System.out.print("Success");
}
int counter(int a,int b)
{
int flag1=0,flag2=0;
while(true)
{
if(a+1<=x && ((double)b/(double)(a+1))<=(double)y/(double)x)
flag1++;
if(b+1<=y && ((double)(b+1)/(double)a)<=(double)y/(double)x)
flag2++;
if(a==x && b==y)
break;
if(flag1==1 && flag2==1)
break;
else
{
if(flag1==1)
a=a+1;
else
b=b+1;
flag1=0;flag2=0;
}
}

if(a==x && b==y)
return 1;
else 
return counter(a+1,b)+counter(a,b+1);
}
int Conjecture(int m, int n)
{
int c=(int)(fact((m+1)*n)/(fact(n)*fact(m*n)*(m*n+1)));
return c;
}
long fact(int n)
{
long f=1;
for(int i=1;i<=n;i++)
f=f*i;
return f;
}
}