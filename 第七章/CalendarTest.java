import java.util.Calendar;

public class CalendarTest{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//ȡ����
		System.out.println(c.get(Calendar.YEAR));
		//ȡ���·�
		System.out.println(c.get(Calendar.MONTH));
		//ȡ����
		System.out.println(c.get(Calendar.DATE));
		//�ֱ�����������ʱ����
		c.set(2003, 10, 23, 12, 32, 23);//2003-11-23 12:32:23
		System.out.println(c.getTime());
		//��Calendar����ǰ��1��
		c.add(Calendar.YEAR, -1);//2002-11-23 12:32:23
		System.out.println(c.getTime());
		//��Calendar����ǰ��12����
		c.roll(Calendar.MONTH, -13);//2002-10-23 12:32:23
		System.out.println(c.getTime());
	}
}