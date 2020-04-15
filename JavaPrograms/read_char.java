import java.io.*;
class read_char
{
InputStreamReader reader= new InputStreamReader(System.in);
BufferedReader in =new BufferedReader(reader);

char ch[][]=new char[4][6];
char c=' ';
void method()throws IOException
{
for(char i=0;i<3;i++)
{
System.out.println("enter 5 character");
for(int j=0;j<5;j++)
{
c=(char)in.read();
ch[i][j]=c;
System.out.print(c);
c=' ';
}}
//printing the array
for(int i=0;i<3;i++)
{
for(int j=0;j<5;j++)
{
System.out.print(ch[i][j]+" ");
}
System.out.println();
}
}}