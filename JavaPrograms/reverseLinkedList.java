import java.util.*;
class reverseLinkedList
{
int data;
reverseLinkedList link,fp,lp;
reverseLinkedList ptr,start,nptr,copy;
reverseLinkedList()
{
data=0;
link=null;
}
reverseLinkedList(int p)
{
data=p;
link=null;
}

void insert(int k)
{
nptr=new reverseLinkedList(k);
if(start==null)
{start=nptr;
ptr=nptr;
}
else
{ptr.link=nptr;
ptr=nptr;
}
}
void display()
{
ptr=start;
while(ptr!=null)
{
System.out.println("data="+ptr.data);
ptr=ptr.link;
}
}
int count()
{
int c=1;
ptr=start;
while(ptr.link!=null)
{
ptr=ptr.link;
c++;
}
return c;
}
void reverseLinkedList()
{
int no=count();
int N=0;
if(no%2==0)
N=no/2;
else
N=(no+1)/2;
fp=start;
lp=null;
int t=0;
for(int i=1;i<=N;i++)
{
ptr=start;
 nptr=start.link;
 while(nptr!=lp)
 {
     ptr=ptr.link ;
     nptr=nptr.link;
    }
    lp=ptr;
    t=lp.data;
    lp.data=fp.data;
    fp.data=t;
    fp=fp.link;
    
}


}
}