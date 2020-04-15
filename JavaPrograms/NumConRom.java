import javax.swing.*;
class NumConRom{
String a1[]={"I","II","III","IV","V","VI","VII","VIII","IX"};
String a2[]={"X","XX","XXX","XXXX","L","LX","LXX","LXXX","LXXXX"};
String a3[]={"C","CC","CCC","CCCC","D","DC","DCC","DCCC","DCCCC"};
String a4[]={"M"};
public static void main(final String args[])
{
NumConRom ncr=new NumConRom();String ans;ans="";
do{
int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number to be converted"));
if(n>1999){
JOptionPane.showMessageDialog(null,"Range out of bounds","Error",JOptionPane.ERROR_MESSAGE);
ans=(String)(JOptionPane.showInputDialog(null,"Do you want to continue?(y/n)"));
continue;
}
String s=ncr.convert(n);
JOptionPane.showMessageDialog(null,"The converted roman equivalent is: "+s);
ans=(String)(JOptionPane.showInputDialog(null,"Do you want to continue?(y/n)"));
if(ans.equalsIgnoreCase("y")==false)
JOptionPane.showMessageDialog(null,"Thank you for using this conversin engine");
}while(ans.equalsIgnoreCase("y"));
}
public String convert(int n){
int c=0,d,num=n;String s;s="";
while(n!=0)
{
c++;
if(c==1)
{
d=n%10;
if(d!=0)
{
s=a1[d-1]+" "+s;
}
n=n/10;
}
else if(c==2)
{
d=n%10;
if(d!=0)
{
s=a2[d-1]+" "+s;
}
n=n/10;
}
else if(c==3)
{
d=n%10;
if(d!=0)
{
s=a3[d-1]+" "+s;
}
n=n/10;
}
else 
{
d=n%10;
if(d!=0)
{
s=a4[0]+" "+s;
}
n=n/10;
}
}
return s;
}
}