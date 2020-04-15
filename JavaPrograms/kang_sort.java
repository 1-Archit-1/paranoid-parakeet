class kang_sort
{
void main(int a[])
{
int l=a.length;
int s=0;
int b[]=new int[a.length];
int m=10000000,n=l/2;
int c=l/2,p=l/2+1;;
for(int i=0;i<l;i++)
{
s=a[0];
for(int j=0;j<l;j++)
{
if(a[j]>s && a[j]<m)
s=a[j];


}
if(i%2==0)
{
b[c]=s;
c=c-1;

}
else
{
b[p]=s;
p=p+1;

}
m=s;
}
for(int k=0;k<l;k++)
{
System.out.print(b[k]+" ");
}
}
}