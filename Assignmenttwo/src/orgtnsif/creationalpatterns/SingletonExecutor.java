package orgtnsif.creationalpatterns;

//driver class
import orgtnsif.creationalpatterns.Singleton;
public class SingletonExecutor {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
	}

}