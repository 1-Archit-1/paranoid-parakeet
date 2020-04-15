import java.util.*;
class insertion_sort_using_rec
{
      int a[],temp=0;
      void main()
      {
          Scanner sc=new Scanner(System.in);//declaring scanner object
          System.out.println("enter the capacity of array");//entering the capacity of array from user
          int l=sc.nextInt();//accepting the length
          a=new int[l];
          for(int i=0;i<l;i++)
          {
              System.out.println("enter the elements");
              a[i]=sc.nextInt();
            }
            for(int i=0;i<l;i++)
            System.out.print(a[i]+" ");System.out.println();
          insersort(a,1);//calling recursive method insersort
          display();//calling display
        }
    public  void insersort(int[] a, int index)
    {
        if(index < a.length){
        int j = index;
        int B = a[index];
        while ((j > 0) && (a[j-1] > B)){
            a[j] = a[j-1];
            j--;
        }
        a[j] = B;
        insersort(a, index + 1);
    }
}
        void display()
        {
            System.out.println("sorted array");
            for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        }
    }
/*
enter the capacity of array
4
enter the elements
6
enter the elements
56
enter the elements
34
enter the elements
3
6 56 34 3 
sorted array
3 6 34 56 
 */