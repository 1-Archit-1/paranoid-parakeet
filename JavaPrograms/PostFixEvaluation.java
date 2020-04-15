import java.io.*;
import java.util.*;
class PostFixEvaluation
{
String a[];
int c;
PostFixEvaluation(int n)
{
a=new String[n];
c=-1;
}
void push(String n)
{
if((c+1)<a.length)
a[++c]=n;
else
System.out.println("Stack overflow");
}
String pop()
{
if(c>=0)
{c--;
return (a[c+1]);
}
else
{System.out.println("Stack underflow");
return "-1";}
}
boolean isOperator1(String ch)
{
if(ch.equalsIgnoreCase("NOT"))
return true;
else
return
false;
}
boolean isOperator(String ch)
{
if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/")||ch.equals("AND")||ch.equals("OR"))
return true;
else
return
false;
}
String evaluate(String s)
{
if(s.equalsIgnoreCase("true"))
return "false";
else
if(s.equalsIgnoreCase("false"))
return "true";
else
{
System.out.println("Wrong input");
System.exit(0);
return "false";
}
}
String evaluate(String op1,String op,String op2)
{
if(op.equals("+"))
   return ""+(Integer.parseInt(op1)+Integer.parseInt(op2));
else
if(op.equals("-"))
   return ""+(Integer.parseInt(op1)-Integer.parseInt(op2));
else
if(op.equals("*"))
   return ""+(Integer.parseInt(op1)*Integer.parseInt(op2));
else
if(op.equals("/"))
   return ""+(Integer.parseInt(op1)/Integer.parseInt(op2));
else
if(op.equals("%"))
   return ""+(Integer.parseInt(op1)%Integer.parseInt(op2));
else
if(op.equalsIgnoreCase("AND"))
   {
   if(op1.equalsIgnoreCase("true")&&op2.equalsIgnoreCase("true"))
     return "true";
   else
     if(op1.equalsIgnoreCase("true")&&op2.equalsIgnoreCase("false"))
   return "false";
     else
   if(op1.equalsIgnoreCase("false")&&op2.equalsIgnoreCase("true"))
     return "false";
   else
   if(op1.equalsIgnoreCase("false")&&op2.equalsIgnoreCase("false"))
     return "false";
   else
{
System.out.println("Wrong input");
System.exit(0);
return "false";
}
}
else
if(op.equalsIgnoreCase("OR"))
{
if(op1.equalsIgnoreCase("true")&&op2.equalsIgnoreCase("true"))
return "true";
else
if(op1.equalsIgnoreCase("true")&&op2.equalsIgnoreCase("false"))
return "true";
else
if(op1.equalsIgnoreCase("false")&&op2.equalsIgnoreCase("true"))
return "true";
else
if(op1.equalsIgnoreCase("false")&&op2.equalsIgnoreCase("false"))
return "false";
else
{
System.out.println("Wrong input");
System.exit(0);
return "false";
}
}
else
{
System.out.println("Wrong input");
System.exit(0);
return "false";
}
}


public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter expression with operators and operands separated by space");
String acc=br.readLine();
StringTokenizer st=new StringTokenizer(acc);
int l=st.countTokens();
String c,op1,op2;
PostFixEvaluation obj=new PostFixEvaluation(l);
for(int i=0;i<l;i++)
{
c=st.nextToken();
if(obj.isOperator(c))
{op1=obj.pop();
op2=obj.pop();
obj.push(obj.evaluate(op1,c,op2));
}
else
if(obj.isOperator1(c))
{op1=obj.pop();
obj.push(obj.evaluate(op1));
}
else
if(!(obj.isOperator(c)||obj.isOperator1(c)))
obj.push(c);
else
{
System.out.println("Exit");
}
System.out.println(obj.pop());
}
}
}


