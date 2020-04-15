class DecimalRoman
{
char r[]={'I','V','X','L','C','D','M',' '};
int n[]={1,5,10,50,100,500,1000};
int  search(char c)
{
for(int i=0;i<r.length-1;i++)
{
if(r[i]==c)

return i;
}
return -1;
}
void RomanToDecimal(String s)
{
char ch[]=s.toCharArray();
int num=0,n1=0,n2=0,n3=0;
for(int i=0;i<ch.length;i++)
{
n1=n2=n3=-1;
n1=search(ch[i]);
if(i<ch.length-1)
n2=search(ch[i+1]);


if(n2>n1)
num-=n[n1];
else
num+=n[n1];
}
System.out.println(num);
}
}







