import java.util.WeakHashMap;

public class WeakHashMapTest{
	public static void main(String[] args){
		WeakHashMap whm = new WeakHashMap();
		//��WeakHashMap���������key-value��
		//����key���������ַ�������û���������ã�
		whm.put(new String("����"), new String("����"));
		whm.put(new String("��ѧ"), new String("����"));
		whm.put(new String("Ӣ��"), new String("�е�"));
		//��WeakHashMap�����һ��key-value��
		//��key��һ��ϵͳ������ַ�������
		whm.put("java", new String("�е�"));
		//���whm���󣬽�����4��key-value��
		System.out.println(whm);
		//֪ͨϵͳ����������������
		System.gc();
		System.runFinalization();
		//��ͨ������£���ֻ����һ��key-value��
		System.out.println(whm);
	}
}