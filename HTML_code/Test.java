import java.awt.*;
import java.applet.*;
public class Test extends Applet //�̳�Appelet�࣬����Applet Java������ص�
{
	public void paint(Graphics g)
	{
		people zhang;
		zhang=new people();
		zhang.setname("Robot");
		zhang.setage(12);
		g.drawString(zhang.talk(),5,35);
	}
}
class people
{
	private String name ;
	private int age ;
	String talk()
	{
		return "����"+name+";����"+age+"��";
	}
	public void setname(String str)
	{
		name = str ;
	}
	public void setage(int a)
	{
		if(a>0)
		age = a ;
		else age=-a;
	}
	public String getname()
	{
		return name ;
	}
	public int getage()
	{
		return age ;
	}
}