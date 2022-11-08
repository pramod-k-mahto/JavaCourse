package classwork;
public class Q3IndividualZeroBalanced {
	public static int posNegCheck(int[] arr) {
		boolean visited[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==((-1)*arr[j]))&&(visited[j]==false)){
					visited[i]=true;
					visited[j]=true;
				}
			}
		}
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				return 0;
			}	}
		return 1;
	}
	public static int zeroBalance(int[] arr) {
		if(arr.length==0) {return 0;}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];	}
		int val= posNegCheck(arr);
		if(sum==0 && val==1) {
			return 1;
		}
		return 0;}
	public static void main(String[] args) {
		int arr[]= {1, 2, -2, -1};
		System.out.println(zeroBalance(arr));
		int arr2[]={-3, 1, 2, -2, -1, 3};
		System.out.println(zeroBalance(arr2));
		int arr3[]={3, 4, -2, -3, -2};
		System.out.println(zeroBalance(arr3));
		int arr4[]= {0, 0, 0, 0, 0,0};
		System.out.println(zeroBalance(arr4));
		int arr5[]= {3, -3, -3};
		System.out.println(zeroBalance(arr5));
		int arr6[]={3};
		System.out.println(zeroBalance(arr6));
		int arr7[]= {};
		System.out.println(zeroBalance(arr7));
	}
}






