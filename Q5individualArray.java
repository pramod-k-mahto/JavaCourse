package classwork;
public class Q5individualArray {
	public static int balanced(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int index=i%2;
			int val=arr[i]%2;
			
			if(index!=val) {
				return 0;		
				 }
		}
		return 1;
	}
	public static void main(String[] args) {
		int arr[]= {2, 3, 6, 7};
		System.out.println(balanced(arr));
		int arr1[]={6, 7, 2, 3, 12};
		System.out.println(balanced(arr1));
		int arr2[]={7, 15, 2, 3};
		System.out.println(balanced(arr2));
		int arr3[]={16, 6, 2, 3};
		System.out.println(balanced(arr3));
		}
}
