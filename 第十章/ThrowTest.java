public class ThrowTest{
	public static void main(String[] args){
		try{
			//���������׳�checked�쳣�ķ�����Ҫô��ʾ������쳣
			//Ҫô��main�������ٴ������׳�
			throwChecked(-3);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		//���������׳�Runtime�쳣�ķ����ȿ�����ʾ������쳣
		//Ҳ���Բ������쳣
		throwRunTime(3);
	}
	
	public static void throwChecked(int a) throws Exception{
		if(a > 0){
			//�����׳�Exception
			//�ô�����봦��try������ڴ�throws�����ķ�����
			throw new Exception("a��ֵ����0��������Ҫ��");
		}
	}
	
	public static void throwRunTime(int a){
		if(a > 0){
			//�����׳�RuntimeException�쳣���ȿ�����ʾ������쳣
			//Ҳ����ȫ�������쳣���Ѹ��쳣�����÷��������ߴ���
			throw new RuntimeException("a��ֵ����0��������Ҫ��");
		}
	}
}