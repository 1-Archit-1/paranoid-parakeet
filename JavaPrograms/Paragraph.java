 
import java.util.*;
class Paragraph //input para of 5 sentences
{                               //class Paragraph begins
    Scanner sc=new Scanner(System.in);
    void main()
    {                           // void main begins
        System.out.println(" PARAGRAPH   ");
        System.out.println(" Please enter a paragraph of 5 sentences ");
        String p=sc.nextLine();         //user input
        String t[];
        int k=0,k1=0;
        String a="",a2="";
        String s[]= p.split("[?.;!]");
        String temp="";
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i-1;j++)
            {
                if(s[j].length()>s[j+1].length())
                {                               //Comparing the lengths of two sentences
                    temp=s[j+1];
                    s[j+1]=s[j];
                    s[j]=temp;
                }
                if(s[j]==s[j+1])
                    if(s[j].compareTo(s[j+1]) >0)
                    {                       //If two sentences are equal in length
                        temp=s[j+1];
                        s[j+1]=s[j];
                        s[j]=temp;
                    }
            }       
        }
        for(int i=0;i<5;i++)
        {
            k=0;k=0; a="";
            t=s[i].split(" ");
            for(int j=0;j<t.length;j++)
            {
                if(t[j].length()>k)             //Finding the longest word in eahc sentence
                {
                    k=t[j].length(); 
                    a=t[j];
                }
            }
            System.out.println("The sentence is : " + s[i]);
            System.out.println("The longest word is:"+a);
            System.out.println("The no. of words is:" +t.length);
            if(k>k1)
            {
                k1=k;
                a2=a;
            }
        }
        System.out.println("The longest word in the paragraph is: "+a2); 
    }                                       // void main ends
}                                   // class Paragraph ends

/*
 * 
 * paragrap1.main()
 PARAGRAPH   
 Please enter a paragraph of 5 sentences 
The boy ate an apple.The apple came from a tree.The tree grew from a seed.The seed came from an apple.The apple was eaten by a boy.
The sentence is : The boy ate an apple
The longest word is:apple
The no. of words is:5
The sentence is : The tree grew from a seed
The longest word is:tree
The no. of words is:6
The sentence is : The apple came from a tree
The longest word is:apple
The no. of words is:6
The sentence is : The seed came from an apple
The longest word is:apple
The no. of words is:6
The sentence is : The apple was eaten by a boy
The longest word is:apple
The no. of words is:7
The longest word in the paragraph is: apple
*/
 