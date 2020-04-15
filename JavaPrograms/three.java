class three
{char a[];
void method(String s)
{

String ans="";
a=s.toCharArray();
int l=a.length;
int i,j,k,p,x;
for(i=0;i<3;i++)
{
p=0;
for(j=0;j<3;j++)
{
if(i!=j)
{
 p=3-(i+j);
ans=" "+a[i]+a[j]+a[p];
ans=ans.trim();
k=Integer.parseInt(ans);
System.out.println(k);
ans=" ";
}}}
}}