import java.io.*;
class FloridaElection
{
void addVote(int n,int a[],int i)//to add votes from binary digits
{
if(n!=0)
{
a[i]+=n%2;
n=n/2;
addVote(n,a,i+1);
}
else return;
}
void perCent(int a[],int i)//to calculate percentage of votes
{
System.out.print(((a[i]*100.00)/(a[0]+a[1]+a[2]+a[3]))+"   ");
}

void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int vote[]=new int[4];
int Vote=0;
do
{
System.out.println("Enter number less than 16 to vote, enter -1 to quit");
Vote=Integer.parseInt(br.readLine());
if(Vote>=16)//Vote must be 4 digit number in binary system
{
System.out.println("Wrong input");
continue;
}
if(Vote>0)
addVote(Vote,vote,0);
perCent(vote,0);perCent(vote,1);perCent(vote,2);perCent(vote,3);//printing percentages
System.out.println();
}
while(Vote!=-1);
System.out.println("Total number of votes = "+(vote[0]+vote[1]+vote[2]+vote[3]));
for(int i=0;i<4;i++)
{
System.out.print(vote[i]+" ");
}
}
}
/**    OUTPUT
Enter number less than 16 to vote, enter -1 to quit
1
100.0   0.0   0.0   0.0   
Enter number less than 16 to vote, enter -1 to quit
14
25.0   25.0   25.0   25.0   
Enter number less than 16 to vote, enter -1 to quit
7
28.571428571428573   28.571428571428573   28.571428571428573   14.285714285714286   
Enter number less than 16 to vote, enter -1 to quit
8
25.0   25.0   25.0   25.0   
Enter number less than 16 to vote, enter -1 to quit
-1
25.0   25.0   25.0   25.0   
Total number of votes = 8
2 2 2 2 
 */

