public class SalException extends Exception{
	public SalException(){}
	public SalException(String msg){
		super(msg);
	}
	
	//����һ�����Խ���Throwable�����Ĺ�����
	public SalException(Throwable t){
		super(t);
	}
}