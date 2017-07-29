import static java.lang.System.*;
import static java.lang.Math.*;
//import和import static的区别
//import可以省略写包名
//import static 连类名都省略
//import static java.lang.System.*;//导入指定类的全部静态变量成员和静态方法，这里导入了System类下所有静态成员变量和静态方法
//import static java.lang.System.out;//导入指定类的单个静态成员变量和静态方法，这里导入了out静态成员变量

public class StaticImportTest{
	public static void main(String[] args){
		//out是java.lang.System类的静态成员变量，代表标准输出
		//PI是java.lang.Math类的静态成员变量，表示圆周率常量
		out.println(PI);
		//直接调用Math类的sqrt静态方法
		out.println(sqrt(256));
	}
}