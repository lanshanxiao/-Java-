import java.util.Collection;
import java.util.ArrayList;

public class GeneicErrorInstanceof{
	public static void main(String[] args){
		Collection<String> cs = new ArrayList<>();
		if(cs instanceof ArrayList){ }
		if(cs instanceof ArrayList<String>){ }
	}
}