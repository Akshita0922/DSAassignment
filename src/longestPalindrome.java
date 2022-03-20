import java.util.Scanner;

public class longestPalindrome {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
  		System.out.print(longestPalindrome(str));
	}

	private static int longestPalindrome(String str) {
		int n=str.length();
		if(n<2) {
			return n ;
		}
		int maxLen=1;
		int start=0;
		        int low, high;
		        for (int i1 = 0; i1 < n; i1++) {
		            low = i1 - 1;
		            high = i1 + 1;
		            while ( high < n && str.charAt(high) == str.charAt(i1)) //increment 'high'                                  
		                high++;
		       
		            while ( low >= 0 && str.charAt(low) == str.charAt(i1)) // decrement 'low'                   
		                low--;
		       
		            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high) ){
		                  low--;
		                high++;
		        }
		 
		        int len = high - low - 1;
		        if (maxLen < len){
		            maxLen = len;
		            start=low+1;
		        }
		    }   
		    System.out.print("Longest palindrome substring is: ");
		    System.out.println(str.substring(start, start + maxLen ));
		    return maxLen;
		}
		
		
	}

