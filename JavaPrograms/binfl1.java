import java.io.*;
class binfl1
{
  int rno;
  String name;
  double per;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input() throws IOException
  {
       FileOutputStream std=new   FileOutputStream("stud.dat");
       DataOutputStream mat=new  DataOutputStream(std);
       System.out.println("enter the no. of students");
        int n=Integer.parseInt(br.readLine());
        for (int i=1;i<=n;i++)
        {
       System.out.println("enter roll no,name,marks");
       rno=Integer.parseInt(br.readLine());
       name=br.readLine();
       per=Double.parseDouble(br.readLine());
    
       //writing in the file
       mat.writeUTF(name);
       mat.writeInt(rno);
       mat.writeDouble(per);
      }
     std.close();
     mat.close();
       }
    }    
        