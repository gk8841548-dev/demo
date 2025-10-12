import java.io.*;
class ncr
{
static long facto(int n)
{
if((n==0)|| (n==1)) return(n);
else
return(n*facto(n-1));
}
public static void main(String args[])
{
try
{
int n,c,r,m;
String s;
long rf,nf,mf,ncr;
DataInputStream ds=new DataInputStream(System.in);
System.out.println("enter a no");
s=ds.readLine();
n=Integer.parseInt(s);
s=ds.readLine();
r=Integer.parseInt(s);
m=n-r;nf=facto(n);rf=facto(r);mf=facto(m);ncr=nf/(rf*mf);
System.out.println(n+"!="+nf);
System.out.println(r+"!="+rf);
System.out.println(m+"!="+mf);
System.out.println(ncr+"ncr value is!"+ncr);
}
catch(Exception e1)
{
System.out.println("error");
e1.printStackTrace();
}
}
}
