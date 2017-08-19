import java.util.EnumSet;

enum Season{
	SPRING, SUMMER, FALL, WINTER
}

public class EnumSetTest{
	public static void main(String[] args){
		//����һ��EnumSet���ϣ�����Ԫ�ؾ���Seasonö�����ȫ��ö��ֵ
		EnumSet es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
		//����һ��EnumSet�ռ��ϣ�ָ���伯��Ԫ��ʱSeason���ö��ֵ
		EnumSet es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
		//�ֶ��������Ԫ��
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);
		//��ָ��ö��ֵ����EnumSet����
		EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
		System.out.println(es3);
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
		//�´�����EnumSet����Ԫ�غ�es4����Ԫ������ͬ������
		//es5����Ԫ�� + es4����Ԫ�� = Seasonö�����ȫ��ö��ֵ
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}
}