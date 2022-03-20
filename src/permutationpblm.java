import java.util.Scanner;

public class permutationpblm {
	public static void main(String[] args) {
			    	Scanner s=new Scanner(System.in);
			    	int n =s.nextInt();
			        int arr[] = new int[n];
			        for(int i=0;i<arr.length;i++) {
			        	arr[i]=s.nextInt();
			        }
			        permutation(arr, 0, n - 1);
			    }
			    private static void permutation(int[] arr, int left, int right) {
			        if (left == right) {
			            for (int i = 0; i < arr.length; i++) {
			                System.out.print(arr[i] + " ");
			            }
			            System.out.println();
			            return;
			        }
 			        for (int i = left; i <= right; i++) {
			            swap(arr, left, i);
			            permutation(arr, left + 1, right);
			            swap(arr, left, i);
			        }
			    }
			    private static void swap(int arr[], int x, int y) {
			        int temp = arr[x];
			        arr[x] = arr[y];
			        arr[y] = temp;
			    }
			    
			  
			}
