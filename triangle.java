import java.io.*;
public class triangle {
    public static void main(String[] args)throws IOException
 {
DataInputStream ds=new DataInputStream(System.in);
int n,j,i,k;
String s;
System.out.println("enter a number");
s=ds.readLine();
n=Integer.parseInt(s);

        for (i = 1; i <= n; i++) {
            
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

