import java.util.ArrayList;
import java.util.Collections;

public class SearchTest{
	public static void main(String[] args){
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		System.out.println(Collections.max(nums));//������Ԫ�أ������3
		System.out.println(Collections.min(nums));//�����СԪ�أ������-5
		Collections.replaceAll(nums, 0, 1);//��nums�е�0ʹ��1������
		System.out.println(nums);
		//�ж�-5��List�����г��ֵĴ���������1
		System.out.println(Collections.frequency(nums, -5));
		Collections.sort(nums);//��nums��������
		System.out.println(nums);//�����[-5, 1, 2, 3]
		//ֻ��������List���ϲſ��ö��ַ���ѯ�����3
		System.out.println(Collections.binarySearch(nums, 3));
	}
}