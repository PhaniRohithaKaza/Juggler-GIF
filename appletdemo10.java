import java.awt.*;
import java.applet.*;
import java.net.*;
/*
<applet code="appletdemo10" width="300" height="300">
</applet>
*/
public class appletdemo10 extends Applet implements Runnable
{
Thread t=null;
String st[]={"juggler1.gif","juggler2.gif","juggler3.gif","jugglet4.gif"};
Image image=null;
URL url=null;

public void start()
{
url=getCodeBase();
//image=getImage(url,"juggler0.gif");
t=new Thread(this);
t.start();
}
public void run()
{
try
{
for(;;)
{
for(int i=0;i<4;i++)
{
image=getImage(url,st[i]);
repaint();
Thread.sleep(100);
}
}
}catch(InterruptedException ex)
{
System.out.println(ex.toString());
}
}
public void paint(Graphics g)
{
g.drawImage(image,200,100,this);
}
}
