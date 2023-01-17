import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class น้มุ_13023 {
		static boolean[] visited;
		static ArrayList<Integer>[] graph;
		static boolean check;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n =Integer.valueOf(st.nextToken());
		int m =Integer.valueOf(st.nextToken());
		graph = new ArrayList[n];
		
		for(int i=0; i<n; i++) {
			graph[i]= new ArrayList<Integer>();
		}
		
		for (int i=0; i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.valueOf(st.nextToken());
			int e = Integer.valueOf(st.nextToken());
			graph[s].add(e);
			graph[e].add(s);
		}
		visited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			if(check) break;
			dfs(i,0);

			
		}
		if(check) System.out.println(1);
		else System.out.println(0);
	}
	
	static void dfs(int node,int depth) {
		if(depth==4||check) {
			check=true;
			return;
		}
		
			visited[node]=true;
			for(int i: graph[node]) {
				dfs(i,depth+1);
			}
		}
	}