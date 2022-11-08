package classwork;
public class Q1individual {
	public static int isDivisible(int[] arr, int divisor) {
		int val = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor != 0) {
				val = 0;
				break;
			}		}
		return val;}
	public static void main(String[] args) {

		int a[] = { 3, 3, 6, 36 };
		int a1[] = { 4 };
		int a2[] = { 3, 4, 3, 6, 36 };
		int a3[] = { 6, 12, 24, 36 };
		int a4[] = {};

		int divisor = 3;
		int divisor1 = 2;
		int divisor2 = 3;
		int divisor3 = 12;
		int divisor4 = 25;


		// call for divider 3
		System.out.println("call for divider 3");
		System.out.println(isDivisible(a, divisor));

		// call for divider 2
		System.out.println("call for divider 2");
		System.out.println(isDivisible(a1, divisor1));

		// call for divider 3
		System.out.println("call for divider 3");
		System.out.println(isDivisible(a2, divisor2));

		// call for divider 12
		System.out.println("call for divider 12");
		System.out.println(isDivisible(a3, divisor3));
		
		// call for divider Anything
		System.out.println("call for divider Anything");
		System.out.println(isDivisible(a4, divisor4));

	}

}
