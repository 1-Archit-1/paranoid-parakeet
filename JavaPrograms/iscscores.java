import java.util.*;
class iscscores
{
    int rno;
    int no[][]=new int[6][2];
    
    void inputscores()//to accept the roll numbermarks and subject code for 6 subjects
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll number of the candidate:--->");
        rno=sc.nextInt();
        System.out.println("Enter the marks for the 6 subjects:--->");
        for(int i=0;i<6;i++)
        no[i][0]=sc.nextInt();
        System.out.println("Enter the codes for the 6 subjects:--->");
        for(int j=0;j<6;j++)
        no[j][1]=sc.nextInt();
    }
    
    int point(int num)//to return the point corresponding to the marks
    {
        if(num>=90&&num<=100)
        return 1;
        else if(num>=80&&num<90)
        return 2;
        else if(num>=70&&num<80)
        return 3;
        else if(num>=60&&num<70)
        return 4;
        else if(num>=50&&num<60)
        return 5;
        else if(num>=40&&num<50)
        return 6;
        else if(num>=30&&num<40)
        return 7;
        else if(num>=20&&num<30)
        return 8;
        else if(num>=10&&num<20)
        return 9;
        else if(num>=0&&num<10)
        return 10;
        else 
        return -1;
    }
}