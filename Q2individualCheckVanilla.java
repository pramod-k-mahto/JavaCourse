package classwork;
public class Q2individualCheckVanilla {	
	public static int isVanilla(int[] a) {
		if(a.length==0) {
			return 1;
		}
		int z = a[0] % 10;
		int k = 1;
			
		for (int i = 0; i < a.length; i++) {
			if(a[i]<0){
				a[i]=-1*a[i];
			}
			int y = a[i];
			while (y > 0) {
				y = y % 10;

				if (y != z) {
					k = 0;
					break;
				}		
				y=y/10;
			}		
		}
		return k;
	}
	public static void main(String[] args) {
		int array1[] = { 1 };
		int array2[]= {11,22,13,34,125};
		int array3[]= {9,999,9999,-9999};
		int array4[]= {};
		System.out.println(isVanilla(array1));
		System.out.println(isVanilla(array2));
		System.out.println(isVanilla(array3));
		System.out.println(isVanilla(array4));
	}

}


