import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> citis = new ArrayList();
		citis.addAll(Arrays.asList(new String[] {"Paris", "London", "Chisinau"}));
		citis.stream().filter(s->s.length()>=6).forEach(s->System.out.println(s));
		
		

	}
	
	
}

