class StringCompareTest{
	public static void main(String[] args){
		String s1 = new String("abcdefghijklmn");
		String s2 = new String("abcdefghij");
		String s3 = new String("abcdefghijalmn");
		System.out.println("s1.compareT(s2)��" + s1.compareTo(s2));//���س��Ȳ�
		
		System.out.println("s1.compareTo(s3)��" + s1.compareTo(s3));//����'k' - 'a'�Ĳ�
	}
}