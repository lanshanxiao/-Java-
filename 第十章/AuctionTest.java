public class AuctionTest{
	private double initPrice = 30.0;
	//因为该方法中显式抛出了AuctionException异常
	//所以此处需要声明抛出AuctionException异常
	public void bid(String bidPrice) throws AuctionException{
		double d = 0.0;
		try{
			d = Double.parseDouble(bidPrice);
		}catch(Exception e){
			//此处完成本方法中可以对异常执行的修复处理
			//此处仅仅是在控制台打印异常的跟踪栈信息
			e.printStackTrace();
			//再次抛出自定义异常
			throw new AuctionException("竞拍价必须是数值，" + "不能包含其他字符！");
		}
		
		if(initPrice > d){
			throw new AuctionException("竞拍价比起拍价底，" + "不允许竞拍！");
		}
		
		initPrice = d;
	}
	
	public static void main(String[] args){
		AuctionTest at = new AuctionTest();
		try{
			at.bid("df");
		}catch(AuctionException ae){
			//再次捕获到bid()方法中的异常，并对该异常进行处理
			System.out.println(ae.getMessage());
		}
	}
}