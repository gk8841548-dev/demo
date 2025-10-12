import java.io.*;
import java.applet.*;
import java.awt.*;
/*<applet code="applet1.class"height="500"width="500"></applet>*/
public void paint(Graphics g)
{
g.setcolor(colour.red);
g.drawString("this is paint method",100,100);
}
public void stop()
{
System.out.println("stop method");
}



