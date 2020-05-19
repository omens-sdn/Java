import java.math.*;
public class five {
	public static void main(String[] args) {
		BigInteger x = new BigInteger("9223372036854775807");
		int count = 0;
		while (count < 5) {
			/*
			 * BigInteger i=BigInteger.TWO; while(x.subtract(i)!=BigInteger.ZERO) {
			 * if(x.mod(i)==BigInteger.ZERO) break; }
			 */
			if (x.isProbablePrime(10)) {
				count++;
				System.out.println(x);
			}
			x=x.nextProbablePrime();
		}
	}
}