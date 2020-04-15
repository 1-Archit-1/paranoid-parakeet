
   public class compare
   {
   void demo()
   {
   String a[]={"zorro","zer","abc","anc","zbncerr"};
   String t="";
   for(int i=0;i<4;i++)
   {
   for(int j=(i+1);j<5;j++)
   {
   if((a[i]).compareTo(a[j])>0)
   {
   t=a[i];
   a[i]=a[j];
   a[j]=t;
   }
   }
   }
   System.out.println("the names are arranged..");
   for(int k=0;k<5;k++)
   {
   System.out.print(a[k]+"\t");
   }
   }
   }
