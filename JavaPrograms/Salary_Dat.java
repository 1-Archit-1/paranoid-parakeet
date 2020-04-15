/*Employee database*/
import java.io.*;
import java.util.Scanner;
public class Salary_Dat
{
	String name;
	String code;
	double bsal;
	private String fileName="allowance.dat";
	
	public void input()
	{
		try{
			FileOutputStream out=new FileOutputStream(fileName);
	        DataOutputStream fout=new DataOutputStream(out);
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the name of the emplyee: ");
			name=sc.next();
			fout.writeUTF(name);
			System.out.print("Enter the code of the employee: ");
			code=sc.next();			
			fout.writeUTF(code);
			System.out.print("Enter the basic salary of the emplyee: ");
			bsal=sc.nextDouble();
			fout.writeDouble(bsal);
			System.out.println("Successfully inserted \nall the details of the employee");
			out.close();fout.close();
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
	public void inputX()
	{
		try{
			FileOutputStream out=new FileOutputStream(fileName,true);
			DataOutputStream fout=new DataOutputStream(out);
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the name of the emplyee: ");
			name=sc.next();
			fout.writeUTF(name);
			System.out.print("Enter the code of the employee: ");
			code=sc.next();
			
			fout.writeUTF(code);
			System.out.print("Enter the basic salary of the emplyee: ");
			bsal=sc.nextDouble();
			fout.writeDouble(bsal);
			System.out.println("Successfully inserted \nall the details of the employee");
			out.close();fout.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
	}	
	public void append()
	{
		try{
			FileOutputStream out=new FileOutputStream(fileName,true);
			DataOutputStream fout=new DataOutputStream(out);
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the name of the emplyee: ");
			name=sc.next();
			fout.writeUTF(name);
			System.out.print("Enter the code of the employee: ");
			code=sc.next();
			fout.writeUTF(code);
			System.out.print("Enter the basic salary of the emplyee: ");
			bsal=sc.nextDouble();
			fout.writeDouble(bsal);
			System.out.println("Successfully inserted \nall the details of the employee");
			out.close();fout.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}	
	public double HRA(double bs)
	{
		return 0.3*bs;
	}
	public double DA(double bs)
	{
		return 0.4*bs;
	}
	public double calcSal(double bs)
	{
		double hra=HRA(bs), da=DA(bs),sal;
		sal=bs+hra+da;
		return sal;
	}
	public double tSal(double bs,long c)
	{
		double sal=calcSal(bs), al,tsal = 0;
		if(c<=15)
		{
			if(sal<=15000)
			{
				al=0.2*sal;
				if(al<=2500)
					tsal=sal+al;
				else
					tsal=sal+2500;
			
			}
		}
		else
			tsal=sal+1000;
		return tsal;
	}
	public void displaySal()
	{
		try
		{
			FileInputStream in=new FileInputStream(fileName);
			DataInputStream inp=new DataInputStream(in);
			String n,m;
			double bs;
			long c=0L;;
	        boolean eof=false;
	        int k=0;
	        while(!eof)
	        {
	            k++;
	            try
	            {
	            	n=inp.readUTF();
	            	m=inp.readUTF();
	            	bs=inp.readDouble();
	            	//c=inp.readLong();
	               System.out.println(k+"\t"+n+"\t"+c+"\t"+bs+"\t"+DA(bs)+"\t"+HRA(bs)+"\t"+calcSal(bs)+"\t"+(tSal(bs,c)-calcSal(bs))+"\t"+tSal(bs,c));
	            }
	            catch(EOFException e)
	            {
	                eof=true;
	                break;
	            }
	        }
	        inp.close();
			in.close();
		}
		catch(FileNotFoundException e)
		{
			System.err.print(e);
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
	}
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String ans="";int k=0;
		Salary_Dat obj=new Salary_Dat();
		do
		{
			String a="";
			System.out.print("1.Input Employee Details\n2.Append more Employee Details\n3.Exit Program\nEnter your choice: ");
			int ch=sc.nextInt();
			do
			{
				k++;				
				switch(ch)
				{
				case 1:if(k==1)
					obj.input();
				else
				{
					System.out.print("1.Rewrite all previous written datas\n2.Add new datas at the end\nEnter your choice: ");
					int ch1=sc.nextInt();
					switch(ch1)
					{
					case 1:obj.input();
					break;
					case 2:obj.inputX();
					break;
					default:System.out.println("Invalid Input");
					}
				}
				break;
				case 2:obj.append();
				break;
				case 3:System.out.println("Program terminated");
				System.exit(0);
				break;
				default:System.out.println("Invalid Input");
				}
				System.out.print("Do you want to continue entering the details of the employees?(y/n): ");
				a=sc.next();
			}while(a.equalsIgnoreCase("y"));
			System.out.println("SL NO.\tName\tCode\tBasic Pay\tDA\tHRA\tSalary\tAllowance\tTotal Salary");
			obj.displaySal();
			System.out.println("Do you want to continue(y/n): ");
			ans=sc.next();
		}while(ans.equalsIgnoreCase("y"));
	}
}