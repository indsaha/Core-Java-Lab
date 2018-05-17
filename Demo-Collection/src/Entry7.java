import java.util.HashMap;

public class Entry7 {
	public static void main(String[] args) {
		
		HashMap<Long, String> entries;
		entries = new HashMap<>();
		
//		byte b = 127;
		
		entries.put(9890012345L,"AirTel");
		entries.put(null,"JIO");
		entries.put(null,"JIO");
		
		String oldValue = entries.put(9822098220L,"Idea");
		System.out.println(oldValue);
		oldValue = entries.put(9822098220L,"Vodafone");
		System.out.println(oldValue);
		
		
		
		System.out.println(entries.size());
		
		
		
	}
}
