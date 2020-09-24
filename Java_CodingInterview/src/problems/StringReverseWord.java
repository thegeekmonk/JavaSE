package problems;

public class StringReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am going home";
		
		String str1[] = str.split("/s");
		
		int len = str1.length;
		
		while(len >= 0)
			System.out.println(str1[len--]);
		
	}

}
