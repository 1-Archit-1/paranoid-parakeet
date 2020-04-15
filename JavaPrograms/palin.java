class palin
{
void p(int s,int t)
{
if(s==0)
System.out.print("finished");
else
{
t=t*10+s%10;
p(s/10,t);
System.out.print(t+" ");
}
}}