public class ArrayErr{
	public static void main(String[] args){
		//����һ��Integer����
		Integer[] ia = new Integer[5];
		//���԰�һ��Integer[]���鸳��Number[]����
		Number[] na = ia;
		//����������������������ʱ������ArrayStoreException�쳣
		//��Ϊ0.5������Integer
		na[0] = 1;
		na[1] = 0.5;
	}
}