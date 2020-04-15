class insertion
{
    public static void insertion_srt(int array[])
    {
        int n=array.length;
        for (int i = 1; i < n; i++)
        {
            int j = i;
            int B = array[j];
            while (j>0 && array[j-1] > B)
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = B;
        }
        for(int i=0;i<n;i++)
            System.out.print(array[i]+"  ");
    }                                                                                                                                                                          

    public static void insert(int array[])
    {
        int n=array.length;
        for (int i = 1; i < n; i++)
        {
            int j;
            int B = array[i]; 
            for(j=i-1;j>=0 && array[j]<B;j--)
                array[j+1]=array[j];
            array[j+1]=B;
        }//i closed
        for(int i=0;i<n;i++)
            System.out.print(array[i]+"  ");     
    }
}