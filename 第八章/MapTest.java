import java.util.Map;
import java.util.HashMap;

public class MapTest{
	public static void main(String[] args){
		Map map = new HashMap();
		//�ɶԷ�����key-value��
		map.put("���Java����", 109);
		map.put("���iOS����", 10);
		map.put("���Ajax����", 79);
		//��η����key-value����value�����ظ�
		map.put("������Java EE��ҵӦ��ʵս", 99);
		//�����ظ���keyʱ���µ�value�Ḳ��ԭ�е�value
		//���µ�value������ԭ�е�value���÷������ر����ǵ�value
		System.out.println(map.put("���iOS����", 99));
		System.out.println(map);
		//�ж��Ƿ����ָ����key
		System.out.println("�Ƿ����ֵΪ ���iOS���� key��" + map.containsKey("���iOS����"));
		//�ж��Ƿ����ָ����value
		System.out.println("�Ƿ����ֵΪ 99 value��" + map.containsValue(99));
		//��ȡMap���ϵ�����key��ɵļ��ϣ�ͨ������key��ʵ�ֱ������е�key-value��
		for(Object key : map.keySet()){
			//map.get(key)������ȡָ����key��Ӧ��value
			System.out.println(key + "-->" + map.get(key));
		}
		map.remove("���Ajax����");
		System.out.println(map);
	}
}