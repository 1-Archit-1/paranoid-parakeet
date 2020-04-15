import java.io.*;
import java.util.Scanner;
/**
 * @author Jeet Dutta
 *@version 1.0.3
 */
public class magic {
    Scanner sc=new Scanner(System.in);
	int n;
	int num[];
	public magic()
	{n=0;
	}
	public magic(int nx)
	{
		n=nx;
		num=new int[n];
	}
	public void input_numbers()throws IOException
	{
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
	}
	public void find_print_magic()
	{
		int i,flag=0,nx=0,dig=0;
		for(i=0;i<n;i++)
		{
			nx=num[i];
			while(nx/10>0)
			{
				//n=0;
				while(nx!=0)
				{
					dig+=nx%10;
					nx/=10;
				}
				nx=dig;
				dig=0;					
			}
			if(nx==1)
			{
				System.out.print(num[i]+",");
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("There are no magic no.s");
		else
			System.out.println("These are the magic no.s");
	}
	public  void main()throws IOException
	{   
		System.out.print("Enter the size of the array: ");
		int nx=sc.nextInt();
		magic obj=new magic(nx);
		obj.input_numbers();
		obj.find_print_magic();
	}
	
}
