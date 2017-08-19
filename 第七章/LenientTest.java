import java.util.Calendar;

public class LenientTest{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		//结果是YEAR字段加1，MONTH字段为1（2月）
		cal.set(Calendar.MONTH, 13);
		System.out.println(cal.getTime());
		//关闭容错性
		cal.setLenient(false);
		//运行时导致异常
		cal.set(Calendar.MONTH, 13);
		System.out.println(cal.getTime());
	}
}