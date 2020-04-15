import java.io.*;
class MergeSort
{
static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter capacity of 2 String arrays");
int l1=Integer.parseInt(br.readLine());
int l2=Integer.parseInt(br.readLine());
String s1[]=new String[l1];
String s2[]=new String[l2];
for(int i=0;i<l1;i++)
{
System.out.println("Enter element of first array");
s1[i]=br.readLine();
for(int j=0;j<i;j++)
{
if(s1[i]==s1[j])
{
System.out.println("Wrong input");
i--;
}
}
}
for(int i=0;i<l2;i++)
{
System.out.println("Enter element of second array");
s2[i]=br.readLine();
for(int j=0;j<i;j++)
{
if(s2[i]==s2[j])
{
System.out.println("Wrong input");
i--;
}
}
}
String  s3[]=new String [l1+l2];
int k=0,a=0,b=0;
while(a<l1&&b<l2)
{
if(s1[a].compareToIgnoreCase(s2[b])>0)
{
s3[k++]=s2[b++];
}
else
if(s1[a].compareToIgnoreCase(s2[b])<0)
{
s3[k++]=s1[a++];
}
else
if(s1[a].compareToIgnoreCase(s2[b])==0)
{
s3[k++]=s1[a++];b++;
}
}
boolean m=(a==l1);
for(int i=(m?b:a);i<(m?l2:l1);i++)
{
s3[k++]=m?(s2[b++]):(s1[a++]);
}
for(int i=0;i<k;i++)
System.out.println(s3[i]);
}
}

