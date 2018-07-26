import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet
{
public void init()
{
System.out.println("init");
}
public void start()
{
System.out.println("started");
}
public void stop()
{
System.out.println("stoped");
}
public void paint(Graphics g)
{
g.drawString("welcome to applets",100,100);
g.drawLine(190,170,190,220);
g.drawOval(100,100,200,200);
g.drawOval(230,150,30,30);
g.drawOval(130,150,30,30);
g.drawArc(100,100,230,130,230,200);
}
}
