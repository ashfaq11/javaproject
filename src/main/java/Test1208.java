import java.math.BigInteger;

//1,2,2,4,8,32,..
public class Test1208 {
	
	public static void main(String[] args) {
		
		BigInteger n1= new BigInteger("1");
		BigInteger n2= new BigInteger("2");
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=10;i++) {
			
			BigInteger n3 = n1.multiply(n2);
			n1 = n2;
			n2 = n3;
			System.out.print(n3+" ");
			
		}
		
	}
	
}
