
public class Entry5 {
	public static void main(String[] args) throws Exception {
		try {
			throw new Exception("ABC");
		} finally {
			System.out.println("XYZ");
		}
	}
}
