import java.applet.*;
import java.awt.*;
public class FontEx extends Applet
{
public void paint(Graphics g)
{
Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,27);
g.setFont(f1);
g.drawString("Welcome to JAVA Applet",350,320);
}}