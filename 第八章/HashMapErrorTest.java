import java.util.HashMap;
import java.util.Iterator;

class A{
	int count;
	public A(int count){
		this.count = count;
	}
	//����count��ֵ���ж����������Ƿ����
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(obj != null && obj.getClass() == A.class){
			A a = (A) obj;
			return this.count == a.count;
		}
		return false;
	}
	
	//����count������hashCodeֵ
	public int hashCode(){
		return this.count;
	}
}

public class HashMapErrorTest{
	public static void main(String[] args){
		HashMap ht = new HashMap();
		//�˴�A����ǰһ�������A����ͬһ����
		ht.put(new A(60000), "���Java����");
		ht.put(new A(87563), "������Java EE��ҵӦ��ʵս");
		//���Hashtable��key Set���϶�Ӧ��Iterator������
		Iterator it =  ht.keySet().iterator();
		//ȡ��Map�е�һ��key�����޸�����countֵ
		A first = (A) it.next();
		first.count = 87563;
		System.out.println(ht);
		//ֻ���޸�û�б��޸Ĺ���key���ж�Ӧ��key-value��
		ht.remove(new A(87563));
		System.out.println(ht);
		//�޷���ȡʣ�µ�value���������д��붼�����null
		System.out.println(ht.get(new A(87563)));
		System.out.println(ht.get(new A(60000)));
	}
}