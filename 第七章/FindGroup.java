import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindGroup{
	public static void main(String[] args){
		//ʹ���ַ���ģ��������ϵõ�����ҳԴ��
		String str = "�������뱾�����Java���塷��������ϵ��13500006666" + "�����ѣ��绰������13611125565" + "���۶��ֵ��ԣ���ϵ��ʽ15899903312";
		//����һ��Pattern���󣬲���������һ��Matcher����
		//��������ʽֻץȡ13X��15X�ε��ֻ���
		//ʵ��Ҫץȡ��Щ�绰���룬ֻҪ�޸�������ʽ����
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		//�����з���������ʽ�Ĵ����绰���룩ȫ�����
		while(m.find()){
			System.out.println(m.group());
		}
	}
}