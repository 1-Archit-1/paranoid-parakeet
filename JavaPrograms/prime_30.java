class prime_30
{
void main()
{
int i,j=1;
int div=2,n=30;
int ar[]={2,0,0,0,0,0,0,0,0,0};
while(div<=n)
{
for(i=2;i<div;i++)
{
if(div%i==0)
break;
if(i==div-1)
ar[j++]=div;
}//for
div++;
}//while

for( i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
}}