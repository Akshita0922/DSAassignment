
import java.util.*;
class travellingSalesManpblm{
		static int travellingSalesMan(int[][] graph, boolean[] ver,int currPosition, int n,int count, int cost, int res)
		{
			if (count == n && graph[currPosition][0] > 0)
			{
				res = Math.min(res, cost + graph[currPosition][0]);
				return res;
			}
			for (int i = 0; i < n; i++)
			{
				if (ver[i] == false && graph[currPosition][i] > 0)
				{
					ver[i] = true;
					res = travellingSalesMan(graph, ver, i, n, count + 1,cost + graph[currPosition][i], res);
					ver[i] = false;
				}
			}
		return res;
	}
public static void main(String args[])
{
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
//    int graph[][] = new int[n][n];
//    for(int i=0;i<n;i++) {
//    	graph[i][i]=sc.nextInt();
//    }
	
	int n = 4; 
    int[][] graph = {{0, 16, 11, 6}, {8, 0, 3, 16},{ 4 ,7, 0, 9} ,{5, 12, 2, 0}};
    boolean[] ver = new boolean[n];
    ver[0] = true;
    int res = Integer.MAX_VALUE;
    res = travellingSalesMan(graph, ver, 0, n, 1, 0, res);
   System.out.println(res);
}
}