package classwork;
public class Q4IndividualDaphne {	
	public static int isDaphne(int[] arr) {
		int val;
		if(arr[0]%2==0) {
			val=0;
		}else {
			val=1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=arr[i]*(-1);
				}
			
			int check=arr[i]%2;
			
			if(check!=val) {
				return 0;
			}	
			
		}
		return 1;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,2};
		System.out.println(isDaphne(arr));
		int arr1[]= {1,3,17,-5};
		System.out.println(isDaphne(arr1));
		int arr2[]= {3,2,5};
		System.out.println(isDaphne(arr2));}
}
