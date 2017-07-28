import java.util.Arrays;

public class Num2Rmb{
	private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
	
	private String[] unitArr = {"十", "百", "千"};
	
	/**
	*把一个浮点数分解成整数部分和小数部分字符串
	*@param num 需要被分解的浮点数
	*@return 分解出来的整数部分和小数部分。第一个数组元素是整数部分，第二个数组是小数部分
	*/
	private String[] divide(double num){
		
		//将一个浮点数前值类型转换为long型，即得到它的整数部分
		long zheng = (long) num;
		
		//浮点数减去整数部分，得到小数部分，小数部分乘以100后再取整得到两位小数
		int xiao = (int) ((num - zheng) * 100);
		
		//下面用了两种方法把证书转换为字符串
		return new String[] {zheng + "", String.valueOf(xiao)};
	}
	
	/**
	*把一个四位的数字字符串变成汉字字符串
	*@param numStr 需要被转换的四位的数字字符串
	*@return 四位的数字字符串被转换成汉字字符串
	*/
	private String toHanStr(String numStr){
		String result = "";
		
		//防止numStr数字字符串开头为0，先把其转换为整型，再转换为数字字符串
		int numInt = Integer.parseInt(numStr);
		numStr = numInt + "";
		
		int numLen = numStr.length();
		
		//找出从右往左 数 不是零的位置
		int minimumNot0 = 0;
		while((!numStr.equals("0")) && numStr.charAt(numLen - 1 - minimumNot0) == '0'){
			minimumNot0++;
		}
		
		//依次遍历数字字符串的每一位数字（除从右往左 数 是零数字）,
		for(int i = 0; i < (numLen - minimumNot0); i++){
			
			//把char型数字转换成int型数字，因为它们的ASCII码值恰好相差48
			//因此把char型数字减去48得到int型数字，例如'4'被转换成4
			int num = numStr.charAt(i) - 48;
			
			//如果不是最后一位数字，而且数字不是零，则需要添加单位（千、百、十）
			if( i != numLen - 1 && num != 0){
				result += hanArr[num] + unitArr[numLen - 2 - i];
			}else{
				
				//否则不要添加单位
				result += hanArr[num];
				
				//判断数字字符串中间有几个零
				while((i != (numLen - 1)) && (numStr.charAt(i + 1) == '0')){
					i++;
				}
			}
		}
		result += "元";
		return result;
	}
	
	public static void main(String[] args){
		Num2Rmb nr = new Num2Rmb();
		
		//测试把一个浮点数分解成整数部分和小数部分
		System.out.println(Arrays.toString(nr.divide(236711125.129)));
		
		//测试把一个四位的数字字符串变成汉字字符串
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