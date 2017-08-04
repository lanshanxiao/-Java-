interface interfaceA{
	public static final int PROP_A = 5;
	public abstract void testA();
}

interface interfaceB{
	public static final int PROP_B = 6;
	public abstract void testB();
}

interface interfaceC extends interfaceA, interfaceB{
	public static final int PROP_C = 7;
	public abstract void testC();
}

public class InterfaceExtendsTest{
	public static void main(String[] args){
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
		System.out.println(interfaceC.PROP_C);
	}
}