package day10;

public class Array6_6 {

	public static void main(String[] args) {
		int[] evens = {2,4,6,8,10};
		int primes[] = {2,3,5,7,9,11,13};
		int evenSum = sum(evens);
		System.out.println(evenSum);
		int primesSum = sum(primes);
		System.out.println(primesSum);

	}
	public static int sum(int even[]) {
		int sum = 0;
		for(int i = 0; i < even.length; i++) {
			sum += even[i];
		}
		return sum;
	}
}
