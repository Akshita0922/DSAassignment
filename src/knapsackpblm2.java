import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class knapsackpblm2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int n=sc.nextInt();
	int cap=sc.nextInt();
	
	Queue<Integer> pq=new PriorityQueue<>();
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++) {
		pq.add(sc.nextInt());
	}
	while (cap > 0 && !pq.isEmpty()) {
		int top=pq.peek();
	
	if(top<=cap) {
		int total=0;
	    total=total+top;
	}
	
	}
}
}
