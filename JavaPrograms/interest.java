  class interest
  {
    public static void main(String args[])
    {
      int p=40000,r=0,t=2;
      double si;
      if(p<=50000)
      r=6;
    else
      if(p<=100000)
      r=7;
    else
      if(p<=250000)
      r=9;
      si=(p*t*r)/100;
      System.out.println("simple interest="+si);
      }
      }