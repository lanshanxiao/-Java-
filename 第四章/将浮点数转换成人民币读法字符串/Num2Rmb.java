import java.util.Arrays;

public class Num2Rmb{
	private String[] hanArr = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
	
	private String[] unitArr = {"ʮ", "��", "ǧ"};
	
	/**
	*��һ���������ֽ���������ֺ�С�������ַ���
	*@param num ��Ҫ���ֽ�ĸ�����
	*@return �ֽ�������������ֺ�С�����֡���һ������Ԫ�����������֣��ڶ���������С������
	*/
	private String[] divide(double num){
		
		//��һ��������ǰֵ����ת��Ϊlong�ͣ����õ�������������
		long zheng = (long) num;
		
		//��������ȥ�������֣��õ�С�����֣�С�����ֳ���100����ȡ���õ���λС��
		int xiao = (int) ((num - zheng) * 100);
		
		//�����������ַ�����֤��ת��Ϊ�ַ���
		return new String[] {zheng + "", String.valueOf(xiao)};
	}
	
	/**
	*��һ����λ�������ַ�����ɺ����ַ���
	*@param numStr ��Ҫ��ת������λ�������ַ���
	*@return ��λ�������ַ�����ת���ɺ����ַ���
	*/
	private String toHanStr(String numStr){
		String result = "";
		
		//��ֹnumStr�����ַ�����ͷΪ0���Ȱ���ת��Ϊ���ͣ���ת��Ϊ�����ַ���
		int numInt = Integer.parseInt(numStr);
		numStr = numInt + "";
		
		int numLen = numStr.length();
		
		//�ҳ��������� �� �������λ��
		int minimumNot0 = 0;
		while((!numStr.equals("0")) && numStr.charAt(numLen - 1 - minimumNot0) == '0'){
			minimumNot0++;
		}
		
		//���α��������ַ�����ÿһλ���֣����������� �� �������֣�,
		for(int i = 0; i < (numLen - minimumNot0); i++){
			
			//��char������ת����int�����֣���Ϊ���ǵ�ASCII��ֵǡ�����48
			//��˰�char�����ּ�ȥ48�õ�int�����֣�����'4'��ת����4
			int num = numStr.charAt(i) - 48;
			
			//����������һλ���֣��������ֲ����㣬����Ҫ��ӵ�λ��ǧ���١�ʮ��
			if( i != numLen - 1 && num != 0){
				result += hanArr[num] + unitArr[numLen - 2 - i];
			}else{
				
				//����Ҫ��ӵ�λ
				result += hanArr[num];
				
				//�ж������ַ����м��м�����
				while((i != (numLen - 1)) && (numStr.charAt(i + 1) == '0')){
					i++;
				}
			}
		}
		result += "Ԫ";
		return result;
	}
	
	public static void main(String[] args){
		Num2Rmb nr = new Num2Rmb();
		
		//���԰�һ���������ֽ���������ֺ�С������
		System.out.println(Arrays.toString(nr.divide(236711125.129)));
		
		//���԰�һ����λ�������ַ�����ɺ����ַ���
		System.out.println(nr.toHanStr("0000"));
		System.out.println(nr.toHanStr("0001"));
		System.out.println(nr.toHanStr("0010"));
		System.out.println(nr.toHanStr("0011"));
		System.out.println(nr.toHanStr("0100"));
		System.out.println(nr.toHanStr("0101"));
		System.out.println(nr.toHanStr("0110"));
		System.out.println(nr.toHanStr("0111"));
		System.out.println(nr.toHanStr("1000"));
		System.out.println(nr.toHanStr("1001"));
		System.out.println(nr.toHanStr("1010"));
		System.out.println(nr.toHanStr("1011"));
		System.out.println(nr.toHanStr("1100"));
		System.out.println(nr.toHanStr("1101"));
		System.out.println(nr.toHanStr("1110"));
		System.out.println(nr.toHanStr("1111"));
	}
}