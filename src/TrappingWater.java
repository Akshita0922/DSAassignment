import java.util.Scanner;

public class TrappingWater {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] height=new int[n];
		for(int i=0;i<n;i++) {
			height[i]=sc.nextInt();
		}
		System.out.println(totalWater(height,n));
	}

	private static int totalWater(int[] height, int n) {
		int [] left=new int[n];
		int [] right=new int[n];
		int water=0;
		int i;
		left[0]=height[0];
		for( i=1;i<n;i++) {
			left[i]=Math.max(left[i-1], height[i]);
		}
		right[n-1]=height[n-1];
		for( i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], height[i]);
		}
		for(i=0;i<n;i++) {
		water += Math.min(left[i], right[i])-height[i];}
		// TODO Auto-generated method stub
		return water;
	}

}
