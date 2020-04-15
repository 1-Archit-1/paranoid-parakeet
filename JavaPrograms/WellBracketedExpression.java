import java.io.*;
class WellBracketedExpression
{
void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter expression");
StringBuffer sb=new StringBuffer(br.readLine());
char ch1,ch2;
StringBuffer s=new StringBuffer(sb.length());
for(int i=0;i<sb.length();i++)
{
if((sb.charAt(i)>=65&&sb.charAt(i)<=90)||(sb.charAt(i)>=97&&sb.charAt(i)<=122))
{//expression must contain only alphabets
if(Character.isUpperCase(sb.charAt(i)))
{s.append(sb.charAt(i));
}
}
else
{
System.out.println("Wrong input");
System.exit(0);
}
}
int n=s.length();
int r=0;
int b=0;
//checking whether expression is well bracketed or not 
for(int i='A';i<='Z';i++)
{
for(int j=n-1;j>=0;j--)
{b=0;
if(s.charAt(j)==i)
{
ch1=s.charAt(j);
for(int k=j;k<n;k++)
{
ch2=s.charAt(k);
if(((ch1+ch2)==155))
{
if((ch1<ch2)&&(b==0))
{
b=1;
r=1;
s.setCharAt(k,'a');
}
}
else
{
if((k==n-1)&&b!=1)
{r=0;
}
}
}
}
}
}
//displaying result
if(r==1)
System.out.println("Well bracketed expression");
else
System.out.println("Not well bracketed expression");
}
}
/**      OUTPUT
 Enter expression
AfZfBjBggYhghYhAhBkuCXjYmZmnhfAgkBjhCjhXhgYjhZ
Well bracketed expression
 */