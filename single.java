import java.io.*;
class par
{
public int a=1;
public void display()
{
System.out.println("this is a parent class");
System.out.println("a="+a);
}
}
class child extends par
{
public int b=1;
public void print()
{
System.out.println("this is a child class");
System.out.println("b="+b);
System.out.println("super class variable "+super.a);
}
}
class single
{
public static void main(String args[])
{
try
{
System.out.println("parent class");
par p1=new par();
p1.display();
System.out.println("child class");
child c1=new child();
c1.print();
}
catch(Exception e1)
{
System.out.println("error");
e1.printStackTrace();
}
}
}


