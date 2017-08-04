public interface Output{
	//�ӿ��ﶨ��ĳ�Ա����ֻ���ǳ���
	public static final int MAX_CACHE_LINE = 50;
	//�ӿ��ﶨ�����ͨ����ֻ����public�ĳ��󷽷�
	public abstract void out();
	public abstract void getData(String msg);
	//�ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void print(String... msgs){
		for(String msg : msgs){
			System.out.println(msg);
		}
	}
	//�ڽӿ��ж���Ĭ�Ϸ���Ҫʹ��default����
	default void test(){
		System.out.println("Ĭ�ϵ�test()����");
	}
	//�ڽӿ��ж����෽������Ҫʹ��static����
	static String staticTest(){
		return "�ӿ�����෽��";
	}
}