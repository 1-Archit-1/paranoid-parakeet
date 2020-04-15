class saddle
{
    static void m(int a[][])
    {

        int r=a.length; int col=0;
        int c=a[0].length;
        int min=0, max =0;
        int j=0, flag=0;
        System.out.println("printing the array");
        for(int i=0; i<r; i++)
        {
            for( j=0; j<c; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<r; i++)
        {
            max=a[i][0];
            for( j=0;j<c;j++)
            {
                if(a[i][j]>max)
                {
                    max = a[i][j];
                    col=j;
                }//if
            }
            min=a[0][col];
            for(int k=0; k<r; k++)
            {
                if(a[k][col]<min)
                    min= a[i][col];
            }
            if(max==min)
            {
                System.out.println("the saddle point element is"+min);
                System.out.println("found in"+i+"col"+col);
                flag=1;
                break;
            }//if
        }
        if(flag==0)
            System.out.println("No saddle-pt. found");
    }

}

