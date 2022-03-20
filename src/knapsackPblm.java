import java.util.Scanner;

public class knapsackPblm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the number of profits(values):");
		int val[]=new int[n];//values
		for(int i=0;i<n;i++) {
		val[i]=sc.nextInt();//weight elements		
		}
		System.out.println("Enter the number of weights:");
		int wt[]=new int[n];//weights
		for(int i=0;i<n;i++) {
			wt[i]=sc.nextInt();	//weight values
			}
		System.out.println("Enter capacity of bag:");
		int W=sc.nextInt();//capacity of bag
		
		knapSack(val,wt,n,W);
	}

	public static void knapSack(int[] val, int[] wt, int n, int W) {
		    int []dp = new int[W + 1];
		    for (int i = 1; i < n + 1; i++) {
		      for (int j = W; j >= 0; j--) {
		  
		        if (wt[i - 1] <= j)
		          dp[j] = Math.max(dp[j],dp[j - wt[i - 1]] + val[i - 1]);
		      }
		
		
	}
		    System.out.println(dp[W]);
		  
	}
}
