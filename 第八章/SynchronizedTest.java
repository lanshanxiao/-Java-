import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class SynchronizedTest{
	public static void main(String[] args){
		//���洴����4���̰߳�ȫ�ļ��϶���
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
	}
}