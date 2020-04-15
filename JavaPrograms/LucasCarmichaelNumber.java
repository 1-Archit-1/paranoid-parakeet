import java.io.*;
class LucasCarmichaelNumber
{
boolean prime(int n)
//to check whether n is prime or not
{
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
++c;
}
if(c==2)
return true ;
else
return false;
}
void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int no=Integer.parseInt(br.readLine());
boolean flag=false;
int n=0;
for(int i=3;i<no;i++)
{
if(no%2==0)//checking whether n is odd number or not
break;
if(prime(i))
{
//checking necessary condition for Lucas Carmichael number
if((no%i==0)&&((no+1)%(i+1)==0))
{
n=1;
}
else
if((no%i==0)&&((no+1)%(i+1)!=0))
{
flag=false;
n=0;
break;
}
}
}
if(n==1)
flag=true;
if(flag)
System.out.println(no+" is a Lucas Carmichael Number");
else
System.out.println(no+" is not a Lucas Carmichael Number");
}
}
/** OUTPUT
Enter a number
8855
8855 is a Lucas Carmichael Number

 */
