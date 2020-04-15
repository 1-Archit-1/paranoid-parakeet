import java.io.*;

class CoordinateSystem
/* NOTE: W.A.M to generate a graph using a 2D array.then accept the coordinates
of a point. translate it using suitable algorithm.extract column no. and row
no. from this method.use these values to translate point, find equation of line,
find ratio of line components, slope of line, y and x intercepts etc */
  
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(reader);

int x;
int y;

CoordinateSystem(int a,int b)
{x=a;
y=b;}

//part one of program-printing of graph
void initial(int xa,int ya)throws IOException
{char graph[][]=new char[x][y];
int x0=(x-1)/2;
int y0=(y-1)/2;

int colV=(xa+y0);
int rowV=(x0-ya);

for(int i=0;i<x;i++)
{for(int j=0;j<y;j++)
{if(i==rowV && j==colV)
graph[i][j]='*';
else
if(i==x0 || j==y0)
graph[i][j]='.';
else
graph[i][j]=' ';
System.out.print(graph[i][j]+" ");}
System.out.println("");}

System.out.println("");
System.out.println("");
System.out.println("###################################################################################");
System.out.println("");}

//part two of program-printing of graph with two points
void initial(int xa,int ya,int xb,int yb)throws IOException
{char graph[][]=new char[x][y];
int x0=(x-1)/2;
int y0=(y-1)/2;

int colV1=(xa+y0);
int rowV1=(x0-ya);
int colV=(xb+y0);
int rowV=(x0-yb);


for(int i=0;i<x;i++)
{for(int j=0;j<y;j++)
{
if(i==x0 || j==y0 ) 
graph[i][j]='.';
else
graph[i][j]=' ';}}
graph[rowV][colV]='*';
graph[rowV1][colV1]='*';

for(int i=0;i<x;i++)
{for(int j=0;j<y;j++)
{System.out.print(graph[i][j]+" ");}
System.out.println("");}

System.out.println("");
System.out.println("");
System.out.println("###################################################################################");
System.out.println("");}

//part three of program-reflection
void reflection()throws IOException
{int xb=0,yb=0;
System.out.println("input your x coordinate");
String a=in.readLine();
int xa=Integer.parseInt(a);
System.out.println("input ur y coordinate");
String b=in.readLine();
int ya=Integer.parseInt(b);
initial(xa,ya);

System.out.println("Enter 1 to reflect along line x=m");
System.out.println("Enter 2 to reflect along line y=m");
String c=in.readLine();
int ch=Integer.parseInt(c);

System.out.println("Enter value of m");
String M=in.readLine();
int m=Integer.parseInt(M);
switch(ch)
{case 1:
xb=(2*m-xa);
yb=ya;
break;

case 2:
yb=(2*m-ya);
xb=xa;
break;
}

initial(xa,ya,xb,yb);
}

//part four of program-equation of a line
void equation()throws IOException
{
System.out.println("Input your x1 and x2:");
String X1=in.readLine();
String X2=in.readLine();
int x1=Integer.parseInt(X1);
int x2=Integer.parseInt(X2);
System.out.println("Enter your y1 and y2:");
String Y1=in.readLine();
String Y2=in.readLine();
int y1=Integer.parseInt(Y1);
int y2=Integer.parseInt(Y2);

initial(x1,y1,x2,y2);//printing points

double m=(y2-y1)/(x2-x1);
double c=y1-(m*x1);
System.out.println("The Equation of the line passing through "+x1+","+y1+" and "+x2+","+y2+" is");
System.out.println("y = "+m+"x "+"+ "+ c);
}

//part five of program-section formula


void Section_form()throws IOException
{System.out.println("Input your two x coordinates");
String X1=in.readLine();
int x1=Integer.parseInt(X1);
String X2=in.readLine();
int x2=Integer.parseInt(X2);
System.out.println("Enter your two y coordinates");
String Y1=in.readLine();
int y1=Integer.parseInt(Y1);
String Y2=in.readLine();
int y2=Integer.parseInt(Y2);

System.out.println("Enter ratio to get point dividing line in inputted ratio");

System.out.println("Enter m");
String M1=in.readLine();
int m=Integer.parseInt(M1);
System.out.println("Enter n"); 
String N1=in.readLine();
int n=Integer.parseInt(N1);
int Px=m*x2+n*x1/(m+n);
int Py=m*y2+n*y1/(m+n);
System.out.println("The coordinates of the point dividing the given line in the ratio "+m+":"+n+" are: ("+Px+","+Py+")");
}

//part six of program:Distance formula

void distance_Formula()throws IOException
{System.out.println("Input your two x coordinates.");
String X1=in.readLine();
String X2=in.readLine();
int x1=Integer.parseInt(X1);
int x2=Integer.parseInt(X2);

System.out.println("Input your two y coordinates.");
String Y1=in.readLine();
String Y2=in.readLine();
int y1=Integer.parseInt(Y1);
int y2=Integer.parseInt(Y2);
int difAb=(x2-x1)*(x2-x1);
int difOr=(y2-y1)*(y2-y1);
int sum=(difAb+difOr);
double Distance=Math.sqrt(sum);

System.out.println("The distance between the two given points is: "+Distance);
}

//part seven of program-switch menu

void switch_menu()throws IOException
{System.out.println("To begin program, type y");
String check=in.readLine();
do{
System.out.println("Enter 1 to just print one point according to it's coordinates");
System.out.println("Enter 2 to just print two points according to their coordinates"); 
System.out.println("Enter 3 to reflect a point and print it");
System.out.println("Enter 4 to get the equation of a line by entering two points on it");
System.out.println("Enter 5 to get the section formula of a line divide by a point");
System.out.println("Enter 6 to get the distance between two points");
String c=in.readLine();
int ch=Integer.parseInt(c);

switch(ch)
{case 1:
System.out.println("Enter your x coordinate");
String xR=in.readLine();
int xa=Integer.parseInt(xR);
System.out.println("Enter your y coordinate");
String yR=in.readLine();
int ya=Integer.parseInt(yR);

initial(xa,ya);
System.out.println("To begin program, type y");
System.out.println("To terminate program, type n");
check=in.readLine();
break;

case 2:

System.out.println("Enter your two x coordinates");
String xR1=in.readLine();
int xa1=Integer.parseInt(xR1);
String xR2=in.readLine();
int xa2=Integer.parseInt(xR2);
System.out.println("Enter your two y coordinates");
String yR1=in.readLine();
int ya1=Integer.parseInt(yR1);
String yR2=in.readLine();
int ya2=Integer.parseInt(yR2);

initial(xa1,ya1,xa2,ya2);
System.out.println("To begin program, type y");
System.out.println("To terminate program, type n");
check=in.readLine();
break;

case 3:
reflection();
System.out.println("To begin program, type y");
System.out.println("To terminate program, type n");
check=in.readLine();
break;

case 4:
equation();
System.out.println("To begin program, type y");
System.out.println("To terminate program, type n");
check=in.readLine();
break;

case 5:
Section_form();
System.out.println("To begin program, type y");
System.out.println("To terminate program, type n");
check=in.readLine();

case 6:
distance_Formula();
System.out.println("To begin program, type y");
System.out.println("To terminate program, type n");
check=in.readLine();
break;

default:
System.out.println("Your entered option is not valid.Would you like to try again?");
System.out.println("If yes, type y");
System.out.println("If no,type n");
check=in.readLine();}}while(check.equalsIgnoreCase("y"));

System.out.println("");
System.out.println("****************************************************************************************************************************************************************");
System.out.println("Thank you for using this program.");
System.out.println("I hope it helped you in your venture");
System.out.println();
System.out.println("Author:Shamreen Iram");
System.out.println("Class:X Section:(i)");


}
}
