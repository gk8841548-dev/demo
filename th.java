import java.io.*;
class thread1 extends Thread
{
public void start()
{
int i;
for(i=1;i<=10;i++)
System.out.println(i);
}
}
class thread2 extends Thread
{
public void start()
{
int i;
for(i=1;i<=10;i++)
System.out.println(i);
}
}
class th 
{
public static void main(String args[])
{
try
{
thread1 t1=new thread1();
thread2 t2=new thread2();
t1.start();
t2.start();
}
catch(Exception e1)
{
System.out.println(" error");
}
}
}
