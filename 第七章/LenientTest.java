import java.util.Calendar;

public class LenientTest{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		//�����YEAR�ֶμ�1��MONTH�ֶ�Ϊ1��2�£�
		cal.set(Calendar.MONTH, 13);
		System.out.println(cal.getTime());
		//�ر��ݴ���
		cal.setLenient(false);
		//����ʱ�����쳣
		cal.set(Calendar.MONTH, 13);
		System.out.println(cal.getTime());
	}
}