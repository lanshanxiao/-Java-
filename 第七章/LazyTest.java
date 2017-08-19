import java.util.Calendar;

public class LazyTest{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		cal.set(2003, 7, 31);// 2003-08-31
		//将月份设为9，但9月31日不存在
		//若立即修改，系统将会把查了自动调整到10月1日
		cal.set(Calendar.MONTH, 8);
		//下面代码输出10月1日
		//System.out.println(cal.getTime());
		//设置DATE字段为5
		cal.set(Calendar.DATE, 5);
		System.out.println(cal.getTime());
	}
}