import java.util.Calendar;

public class LazyTest{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		cal.set(2003, 7, 31);// 2003-08-31
		//���·���Ϊ9����9��31�ղ�����
		//�������޸ģ�ϵͳ����Ѳ����Զ�������10��1��
		cal.set(Calendar.MONTH, 8);
		//����������10��1��
		//System.out.println(cal.getTime());
		//����DATE�ֶ�Ϊ5
		cal.set(Calendar.DATE, 5);
		System.out.println(cal.getTime());
	}
}