import java.util.*;
class selection_sort_using_rec

{
 int a[];Scanner sc=new Scanner(System.in);
  void main()
  {
      System.out.println("enter array length");
      int l=sc.nextInt();
      a=new int[l];
      for(int i=0;i<l;i++)
      {
          System.out.println("enter elements");
          a[i]=sc.nextInt();
        }
        recsort(a,0,1);display();
    }
    void recsort(int ar[],int i,int j)
    {
        if(i<a.length-1)
        {
        int pos=i;
        if(j<a.length)
        {
            if(ar[j]<ar[pos])
            pos=j;
            recsort(a,i,j+1);
        }
        int temp=ar[i];ar[i]=ar[pos];
        ar[pos]=temp;
        recsort(a,i+1,i+2);
    }
    }
    void display()
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}