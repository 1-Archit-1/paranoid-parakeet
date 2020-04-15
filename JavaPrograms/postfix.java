import java.io.*;
class postfix
{
void main(String p)
{
int l=p.length();
Stack obj=new Stack(l);
String s="";
char ch,ch1;
for(int i=0;i<l;i++)
{
ch=p.charAt(i);
if(brck(ch)==1)
obj.push(ch);
else
if(brck(ch)==2)
{
inner:
while(true)
{
ch1=obj.pop();
if(ch1==' '||ch1=='(')
break inner;
else
s=s+(ch1);
}
}
else
{
if(isOperator(ch))
obj.push(ch);
else
s=s+(ch);
}

}
System.out.println(s);
}

boolean isOperator(char ch)
{
if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'||ch=='^')
return true ;
else
return false;
}
int brck(char ch)
{
if(ch=='(')
return 1;
else
if(ch==')')
return 2;
else
 return 3;
}
}
class Stack
{
char a[];
int c;
Stack(int n)
{
a=new char[n];
c=-1;
}
void push(char n)
{
if((c+1)<a.length)
a[++c]=n;
}
char pop()
{char x;
if(c>=0)
{ x=a[c];c--;}
else
return ' ';
return x;
}
}
