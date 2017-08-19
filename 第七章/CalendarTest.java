import java.util.Calendar;

public class CalendarTest{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//取出年
		System.out.println(c.get(Calendar.YEAR));
		//取出月份
		System.out.println(c.get(Calendar.MONTH));
		//取出日
		System.out.println(c.get(Calendar.DATE));
		//分别设置年月日时分秒
		c.set(2003, 10, 23, 12, 32, 23);//2003-11-23 12:32:23
		System.out.println(c.getTime());
		//将Calendar的年前推1年
		c.add(Calendar.YEAR, -1);//2002-11-23 12:32:23
		System.out.println(c.getTime());
		//将Calendar的月前推12个月
		c.roll(Calendar.MONTH, -13);//2002-10-23 12:32:23
		System.out.println(c.getTime());
	}
}