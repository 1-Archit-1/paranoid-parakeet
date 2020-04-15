class insSort
{
void insSort()
{
int a[]={12,9,4,99,120,1,3,10};
int l=a.length;
for(int i=1;i<l;i++)
{
int j=i;
int b=a[i];
while((j>0)&&(a[j-1]>b))
{
a[j]=a[j-1];
j--;
}
a[j]=b;
}

for(int i=0;i<l;i++)
{
System.out.println(a[i]);
}
}
}