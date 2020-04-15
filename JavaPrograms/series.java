  class series
  {
    public static void main(String args[])
    {
      int s=0,j,i,z=0;
      {
        for(i=1;i<=5;i++)
        {
          for(j=1;j<=i;j++)
          {
            s=s+j;
          }
          z=z+s;
          s=0;
        }
       System.out.print("sum="+s);
       }
       }
       }