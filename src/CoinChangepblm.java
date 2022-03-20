import java.util.Scanner;

public class CoinChangepblm {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//int n=4;//length of array
		int m=s.nextInt();//coin value
		int arr[]=new int[];
		for(int i=0;i<m;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(count(arr,n,m));
	}

	private static int count(int[] arr, int n, int m) {
		//if m is 0 the only one solution
		if(n==0) {
			return 1;
		}
		//if m is less than 0 then there is no solution
		if(n<0) {
			return 0;
			
		}
		if (m <= 0 && n >= 1) {
	        return 0;
		}
		return count(arr,m-1,n)+count(arr,m,n-arr[m-1]);
		
	}


}
