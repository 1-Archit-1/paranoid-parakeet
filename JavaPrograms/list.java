import java.util.*;
class list
{Scanner sc=new Scanner(System.in);
    int data;
    list link;
    list start,nptr,ptr,start2,save,copy;
    list(int d,list l)
    {data=d;
        link=l;
    }

    list()
    {data=0;link=null;
    }

    void insert(int n)
    {nptr=new list(n,null);
        if(start==null)
        {start=nptr;
            ptr=start;}
        else
        {if(n<start.data)
            {ptr=start;
                start=nptr;
                start.link=ptr;
            }else
            {save=start;
                ptr=start.link;
                while(ptr!=null)
                {if(n>save.data && n<ptr.data)
                    {copy=save.link;
                        save.link=nptr;
                        nptr.link=copy;
                        break;
                    }else
                    {save=ptr;
                        ptr=ptr.link;
                    }}
                save.link=nptr;
            }}}

    void display()
    {ptr=start;
        while(ptr!=null)
        {System.out.println(ptr.data);
            ptr=ptr.link;
        }}

    void delete(int n)
    {ptr=start;
        nptr=ptr;
        if(start.data==n)
        {start=start.link;
            ptr=start;
            nptr=ptr;}
        else
        {while(ptr!=null)
            {if(ptr.data==n)
                    nptr.link=ptr.link;
                nptr=ptr;
                ptr=ptr.link;
            }}}

    void split(int loc)
    {ptr=start;
        for(int i=1;i<=loc;i++)
        {save=ptr;
            ptr=ptr.link;
        }save.link=null;
        start2=ptr;
        System.out.println("printing the first part");
        display();
        System.out.println("display the second part");
        while(start2!=null)
        {System.out.println(start2.data);
            start2=start2.link;
        }}

    void reverse()
    {
        ptr=start;
        int c=0,tmp;
        list fp=start,lp=null;
        while(ptr!=null)
        {c++;
            ptr=ptr.link;
        }
        System.out.println("no of nodes="+c);
        for(int i=0;i<c/2;i++)
        {
            save=start;
            ptr=start;
            while(ptr!=lp)
            {
                save=ptr;
                ptr=ptr.link;
            }
            lp=save;
            tmp=fp.data;
            fp.data=lp.data;
            lp.data=tmp;
            fp=fp.link;
        }
    }

    void search(int n)
    {int flag=0,c=0;
        ptr=start;
        while(ptr!=null)
        {c++;
            if(ptr.data==n)
            {flag=1;
                System.out.println("search successful");
                System.out.println("found in "+(c)+"position");
                break;
            }
            ptr=ptr.link;
        }//while
        if(flag==0)
            System.out.println("not successful");
    }

    void main(int n)
    {int d,p;
        for(int i=1;i<=n;i++)
        {System.out.println("enter a value");
            d=sc.nextInt();
            insert(d);
        }display();
        System.out.println("enter a value to delete");
        d=sc.nextInt();
        delete(d);
        display();
        System.out.println("enter a value to search");
        d=sc.nextInt();
        search(d);
        System.out.println("spliting the list into two");
        System.out.println("enter a position to split");
        p=sc.nextInt();
        split(p);
}}