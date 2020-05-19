import java.math.BigInteger;
public class six {
	public static void main(String[] args) {
		System.out.println("p\t2^p-1");
		BigInteger x=BigInteger.ONE;
		for (int p = 1; p <= 100; p++) {
			x=x.multiply(new BigInteger("2"));
			BigInteger y=x.subtract(new BigInteger("1"));
			if(y.isProbablePrime(100))
			{
				System.out.println(p+"\t"+y);
			}
		}
	}
}