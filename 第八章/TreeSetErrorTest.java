import java.util.TreeSet;

class Err{}
public class TreeSetErrorTest{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();
		//��TreeSet�������������Err����
		ts.add(new Err());
		ts.add(new Err());
	}
}