import java.util.*;
class bestfour extends iscscores
{
    void bestsubjects()
    {
        int tot=0,x=0;
        for(int i=0;i<6;i++)
        {
            x=point(no[i][0]);
            tot+=x;//computing the total number of points obtained
        }
        System.out.println("Total points of candidate:---> "+tot);
        
        int arr1[]=new int[6];
        int arr2[]=new int[6];
        int p=0,q=0;
        for(int i=0;i<6;i++)
        {
            arr1[p]=no[i][0];
            p++;//storing the marks in a 1-D array
        }
        
        for(int j=0;j<6;j++)
        {
            arr2[q]=no[j][1];
            q++;//storing the codes in a 1-D array
        }
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1.length-1-i;j++)
            {
                if(arr1[j]<arr1[j+1])//bubble sort in descending order
                {
                    int t1=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=t1;
                    
                    int t2=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=t2;
                }
            }
        }
        
        System.out.println("The marks of the best four subjects and their codes are respectively as follows:--->");
        System.out.println("MARKS      CODE");
        for(int i=0;i<4;i++)
        {
            System.out.print(arr1[i]+"         "+arr2[i]);//printing the best 4 subjects' marks and the codes
            System.out.println();
        }
        System.out.println();
    }
        void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of candidates:--->");
        int n=sc.nextInt();
        bestfour bf[]=new bestfour[n];//creating an array of objects
        for(int i=0;i<n;i++)
        {
            bf[i]=new bestfour();
            bf[i].inputscores();
            bf[i].bestsubjects();//invoking above methods
        }
    }
}