 
import java.io.*;
class Text_File
{                               // class Text_File begins
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void main()throws IOException 
    {                           // void main begins
        System.out.println(" TEXT FILE ");
        String sent; String roll; String c="";
        FileWriter std=new FileWriter("data.txt");  // Object for FileWriter
        BufferedWriter mat=new BufferedWriter(std); // Object for BufferedWriter
        PrintWriter obj=new PrintWriter(mat);       // Object for PrintWriter
        char x='Y';
        while(x=='Y')
        {                               // while loop begins
            System.out.println("Enter name");
            sent=br.readLine();         
            System.out.println("Enter roll number");
            roll=br.readLine();
            System.out.println("Enter class");
            c=br.readLine();
            obj.println(sent);
            obj.println(c);
            obj.println(roll);
            System.out.println("To eneter again press Y else press any other character");
            x=br.readLine().charAt(0);  // For continuation
        }                               // while loop ends
        System.out.println("Thank you");
        obj.close();
    }                                       // void main ends
}                                          // class Text_File ends

/*
 * text_Fil1.main()
 TEXT FILE 
Enter name
aaron
Enter roll number
31
Enter class
12
To enter again press Y else press any other character
Y
Enter name
Sharon
Enter roll number
33
Enter class
12
To enter again press Y else press any other character
N
Thank you

 */