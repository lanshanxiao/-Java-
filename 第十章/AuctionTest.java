public class AuctionTest{
	private double initPrice = 30.0;
	//��Ϊ�÷�������ʽ�׳���AuctionException�쳣
	//���Դ˴���Ҫ�����׳�AuctionException�쳣
	public void bid(String bidPrice) throws AuctionException{
		double d = 0.0;
		try{
			d = Double.parseDouble(bidPrice);
		}catch(Exception e){
			//�˴���ɱ������п��Զ��쳣ִ�е��޸�����
			//�˴��������ڿ���̨��ӡ�쳣�ĸ���ջ��Ϣ
			e.printStackTrace();
			//�ٴ��׳��Զ����쳣
			throw new AuctionException("���ļ۱�������ֵ��" + "���ܰ��������ַ���");
		}
		
		if(initPrice > d){
			throw new AuctionException("���ļ۱����ļ۵ף�" + "�������ģ�");
		}
		
		initPrice = d;
	}
	
	public static void main(String[] args){
		AuctionTest at = new AuctionTest();
		try{
			at.bid("df");
		}catch(AuctionException ae){
			//�ٴβ���bid()�����е��쳣�����Ը��쳣���д���
			System.out.println(ae.getMessage());
		}
	}
}