import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class advancePermutation {
	public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int n =s.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++) {
        	nums[i]=s.nextInt();
        	Arrays.toString(nums);
        	System.out.println(nums[i]);
        }
        //permutation(nums, 0, n - 1);
    }

//	private static void permutation(int[] nums, int i, int j) {
//		List<Integer> li=new ArrayList<>();
//		for(int i=0;i<)
//		
//	}

}
