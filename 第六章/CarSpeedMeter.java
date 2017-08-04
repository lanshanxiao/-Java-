abstract class SpeedMeter{
	//ת��
	private double turnRate;
	public SpeedMeter(){}
	//�ѷ��س��ְ뾶�ķ�������ɳ��󷽷�
	public abstract double getRadius();
	public void setTurnRate(double turnRate){
		this.turnRate = turnRate;
	}
	//��������ٶȵ�ͨ���㷨
	public double getSpeed(){
		//�ٶȵ��� ���ְ뾶 * 2 * PI * ת��
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}

public class CarSpeedMeter extends SpeedMeter{
	public double getRadius(){
		return 0.28;
	}
	
	public static void main(String[] args){
		CarSpeedMeter csm = new CarSpeedMeter();
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
}