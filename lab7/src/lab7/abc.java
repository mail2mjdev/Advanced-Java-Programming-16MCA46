package lab7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
@SuppressWarnings("serial")
public class abc extends Applet
{
@Override
public void paint(Graphics g)
{
setBackground(Color.pink);
setForeground(Color.black);
g.drawString("Welcome JSP-Applet",100,100);
}
}
