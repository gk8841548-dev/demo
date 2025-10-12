import java.io.*;
interface inter1 {
final int a=1;
abstract void display();
}
interface inter2 {
final int b=1;
abstract void print();
}
class multi implements inter1,inter2
{
public void display()
{
System.out.println("method in the first interface");
}
public void print()
{
System.out.println("method in the second interface");
}
}
class multiin {
public static void main(String args[])
{
try
{
multi m1=new multi();
m1.display();
m1.print();
}
catch(Exception e1)
{
System.out.println("general exception");
e1.printStackTrace();
}
}
}


