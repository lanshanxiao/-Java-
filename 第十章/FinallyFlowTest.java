public class FinallyFlowTest{
	public static void main(String[] args) throws Exception {
		boolean a = test();
		System.out.println(a);
	}
	
	public static boolean test(){
		try{
			//��Ϊfinally���а�����return���
			//���������return���ʧȥ������
			return true;
		}finally{
			return false;
		}
	}
}