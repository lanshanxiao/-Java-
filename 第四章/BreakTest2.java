public class BreakTest2{
	public static void main(String[] args){
		//���ѭ����outer��Ϊ��ʶ��
		int j = 1;
		outer:
		
		for(int i = 0; i < 5; i++){
			//�ڲ�ѭ��
			for(; j < 3; j++){
				System.out.println("i��ֵΪ��" + i + " j��ֵΪ��" + j);
				if(j == 1){
					//����outer��ǩ����ʶ��ѭ��
					break outer;
				}
			}
		}
	}
}