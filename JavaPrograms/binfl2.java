
import java.io.*;

class binfl2
{
  int rrno;
  String pname;
  double perc;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   void readprint() throws IOException
    {  FileInputStream  std=new  FileInputStream("stud.dat");
        DataInputStream mat=new DataInputStream (std);
        boolean eof=false;
        while(!eof)
        {
             try
             {
                  pname=mat.readUTF();
                  rrno=mat.readInt();
                  perc=mat.readDouble();
                  System.out.println("name="+pname);
                   System.out.println("rollno="+rrno);
                   System.out.println("percentage marks="+perc);
                }catch(EOFException e)
                {
                    System.out.println("this is end of file");
                    eof=true;
                }
            }
        }
    
        void append()throws IOException
        {
             String snt;
             int ans;
             FileOutputStream std=new FileOutputStream("stud.dat",true);
            DataOutputStream mat=new  DataOutputStream(std);
            System.out.println("enter the total no. of records  to be added");
             int num=Integer.parseInt(br.readLine());
             for (int i=1;i<=num;i++)
             {
                  System.out.println("enter roll no,name,marks");
      int  rno=Integer.parseInt(br.readLine());
      String name=br.readLine();
       double per=Double.parseDouble(br.readLine());
    
       //writing in the file
       mat.writeUTF(name);
       mat.writeInt(rno);
       mat.writeDouble(per);
      }
     std.close();
     mat.close();
       }
             
    void del()throws IOException
    {
       FileInputStream in=new  FileInputStream("stud.dat");
        DataInputStream mat=new DataInputStream (in);
         FileOutputStream out=new FileOutputStream("temp.dat");
            DataOutputStream std=new  DataOutputStream(out);
            boolean eof=false;
            while(!eof)
            {
                 try
                 { pname=mat.readUTF();
                  rrno=mat.readInt();
                  perc=mat.readDouble();
                  if (perc>95)
                 { std.writeUTF(pname);
                  std.writeInt(rrno);
                  std.writeDouble(perc);
                }
            }
            catch(EOFException e)
            {
                 System.out.println("this is the end of file");
                 eof=true;
                }
            }
            mat.close();
            std.close();
            File fl=new File("stud.dat");
            fl.delete();
            File f2=new File("temp.dat");
            boolean Rename =f2.renameTo(fl);
            if (!Rename)
            {
                 System.out.println("The file cannot be renamed successfully");
                 //System.exit(0);
                }
                else
                {
                     System.out.println("the file is renamed successfully");
                    
                    }    
                }
            
            void modifl()throws IOException
    
            { FileInputStream in=new  FileInputStream("stud.dat");
        DataInputStream mat=new DataInputStream (in);
         FileOutputStream out=new FileOutputStream("temp.dat");
            DataOutputStream std=new  DataOutputStream(out);
            boolean eof=false;
            while(!eof)
            {
                 try
                 { pname=mat.readUTF();
                  rrno=mat.readInt();
                  perc=mat.readDouble();
                 pname=pname.toUpperCase();
                 
             std.writeUTF(pname);
                  std.writeInt(rrno);
                  std.writeDouble(perc);
                }
            catch(EOFException e)
            {
                 System.out.println("this is the end of file");
                 eof=true;
                }
            }
            mat.close();
            std.close();
            File fl=new File("stud.dat");
            fl.delete();
            File f2=new File("temp.dat");
            //boolean Rename =
            f2.renameTo(fl);
            //if (!Rename)
            {
                 System.out.println("The file cannot be renamed successfully");
                 //System.exit(0);
                }
                //else
                {
                     System.out.println("the file is renamed successfully");
                    
                    }    
                }
                
            }