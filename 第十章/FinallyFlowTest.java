public class FinallyFlowTest{
	public static void main(String[] args) throws Exception {
		boolean a = test();
		System.out.println(a);
	}
	
	public static boolean test(){
		try{
			//因为finally块中包含了return语句
			//所以下面的return语句失去了作用
			return true;
		}finally{
			return false;
		}
	}
}