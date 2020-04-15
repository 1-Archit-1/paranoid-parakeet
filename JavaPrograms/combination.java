class combination
{char a[];
    void method(String s)
    { a=s.toCharArray();
        int i,j,k,p,x;
        for(i=0;i<4;i++)
        {
            p=0;
            for(j=0;j<4;j++)
            {
                if(i!=j)
                {
                    for(k=0;k<4;k++)
                    {
                        if((i!=j) && (j!=k) && (i!=k))
                        {   
                            p=6-(i+j+k);
                            System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[p]);
                        }// 2nd if closed
                    }// k closed
                }// 1st if closed
            }// j closed
        }// i closed
    }//method closed
}//class closed