package erp;

public class Str {

	public static void main(String[] args) {
		String a= "goodday";
		String b=  "";
		
		for (int i=a.length()-1; i>=0; i--)
		{
			String c = b + a.charAt(i);
			System.out.print("" + c);	
		}
		
	}

}
