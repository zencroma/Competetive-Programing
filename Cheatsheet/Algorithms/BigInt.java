package Algorithms;

// Java program to demonstrate how 
// to use gcd method of BigInteger class 

import java.math.BigInteger; 

public class BigInt { 
	public static int gcd(int a, int b) 
	{ 
		BigInteger b1 = BigInteger.valueOf(a); 
		BigInteger b2 = BigInteger.valueOf(b); 
		BigInteger gcd = b1.gcd(b2); 
		return gcd.intValue(); 
	} 

	public static long gcd(long a, long b) 
	{ 
		BigInteger b1 = BigInteger.valueOf(a); 
		BigInteger b2 = BigInteger.valueOf(b); 
		BigInteger gcd = b1.gcd(b2); 
		return gcd.longValue(); 
	} 

	// cek bilangan prima
	public static boolean isPrime (long a, long b) 
	{ 
		return BigInteger.valueOf(123).isProbablePrime(1); 
	} 

	// pangkat 2
	static boolean isPowerOfTwo (int x) { 
		return x!=0 && ((x&(x-1)) == 0);	 
	} 


	public static void main(String[] args) 
	{ 
		System.out.println(gcd(5, 7)); 
		System.out.println(gcd(123456789L, 555555555L)); 

		// jumlah digit
		int numDigit = Math.floor(Math.log10(N)) + 1;
	} 
}

