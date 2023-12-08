package test.test2.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestSynechrone {

	public static void main(String[] args) {
		List<String> cardList = Arrays.asList("12345", "121212124584", "121212122467", "237896", "235", "45345",
				"356454564", "090", "64367");

		System.out.println(cardList);

		cardList = cardList.stream().filter(str -> str.length() > 3)
				.map(str -> str.substring(str.length() - 4).replaceAll("[0-9]", "*")).collect(Collectors.toList());

		System.out.println(cardList);
	}

}/*
	 * //Commit if m1(),m2(),m3() -- all success //Partial commit - commit only m3()
	 * if m1(), m2() failure void serveMe(){ m1(); m2(); m3(); } //class A{ // //
	 * private B obj = new B(); // // public static void main (String s[]) // { // B
	 * obj2 = new B(); // } //}
	 * 
	 * 
	 * Design
	 * a"GET LIST OF ACCOUNTS REST API with user id and grant type as input parameter"
	 * REST api for the below
	 * 
	 * scenario User(1)--->(n)Accounts--->(n)Grants
	 * 
	 * 
	 * @GetMappting("/accounts/{userId}") public List<Accounts>
	 * getAccounts(@PathVariable String grant, @pathparam userId ,@PathVariable
	 * String ){
	 * 
	 * validateUser(user);
	 * 
	 * 
	 * 
	 * }
	 */
