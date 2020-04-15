import java.util.*;
class token
{
void main(String s)
{
int l=0;
StringTokenizer t=new StringTokenizer(s,".!?");
l=t.countTokens();
for(int i=0;i<l;i++)
{
System.out.println(t.nextToken());
}
System.out.println("total no. of sentences are="+l);
}}