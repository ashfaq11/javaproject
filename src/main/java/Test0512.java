import java.util.stream.IntStream;

//abc,acd,bac,bca,cab,cba
//input abc
public class Test0512 {

	public static void main(String[] args) {
		String str = "abcdddcba";
	//	permute(str, "");

		//pallindrome.
		
		boolean result = IntStream.range(0, str.length()/2).allMatch(i-> str.charAt(i)==str.charAt(str.length()-1-i));
		
		System.out.println(result);
	}

	private static void permute(String str, String result) {

		if (str==null||str.isEmpty()) {
			System.out.println(result);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String rest = str.substring(0, i) + str.substring(i + 1);
			permute(rest, result + ch);
		}

	}

}
