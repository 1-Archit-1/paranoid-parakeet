class lcm
{//int h;
int check(int big,int sm,int h)
{
if(big%sm==0)
return big;
else return check((big+h),sm,h);
}

void main(int a, int b)
{
int big,small,copy;
if(a>b)
{
big=a;
small=b;
}
else
{
big=b;
small=a;
}
copy=check(big,small,big);
System.out.println(copy);
}
}
