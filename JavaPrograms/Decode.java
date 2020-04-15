import java.io.*;
class Decode
{
void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println ("Enter no");
String sb=br.readLine();
StringBuffer s=new StringBuffer(sb);
int l=s.length();
int a=0;
StringBuffer w=new StringBuffer();
StringBuffer p=new StringBuffer();
char ch=' ';
for(int i=0;i<l-1;i++)
{
a=Integer.parseInt(s.substring(i,i+2));i++;
if((a>=65&&a<=90)||(a>=97&&a<=99)||(a==32))
{
w=w.append((char)a);
}
else
if(a==10||a==11||a==12)
{
a=a*10+Integer.parseInt(""+s.charAt(++i));
if(a<122)
{
w=w.append((char)a);
}
else
i=i-2;
}
else
i--;
}
w.insert(0," ");
for(int i=1;i<w.length();i++)
{
ch=w.charAt(i);
if(w.charAt(i-1)==' '&&ch!=' ')
{
if(Character.isLowerCase(ch))
ch=Character.toUpperCase(ch);
p.append(ch);
}
else
if(w.charAt(i-1)!=' '&&ch!=' ')
{
if(Character.isUpperCase(ch))
ch=Character.toLowerCase(ch);
p.append(ch);
}
else
if(ch==' ')
{
if(w.charAt(i-1)!=' ')
{
p.append(ch);
}
}

}
System.out.println(p);
}
}