package practice.java;

public class RecursiveDigitSum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str = "43589";
		
		StringBuffer sf = new StringBuffer(str);
		sf.append(str);
		
		System.out.println(sf);
		
		int num = sf.charAt(0);
		
		System.out.println(num);
	}

}
