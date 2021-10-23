package hello;

public class StringBuilderNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder sb = new StringBuilder("678");
		
		StringBuilder s = new StringBuilder();
		
		int ch = sb.charAt(0) - '0';
		
		System.out.println(ch);
		
		s.insert(0,ch);
		
		System.out.println(s);
		
		s.insert(0,'2');
		
		
		System.out.println(s);
	}

}
