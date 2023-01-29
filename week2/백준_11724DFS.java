package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class น้มุ_11724DFS {
		static boolean[] visited;
		static ArrayList<Integer>[] graph;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n =Integer.valueOf(st.nextToken());
		int m =Integer.valueOf(st.nextToken());
		graph = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i=1; i<n+1; i++) {
			graph[i]= new ArrayList<Integer>();
		}
		
		for (int i=0; i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.valueOf(st.nextToken());
			int e = Integer.valueOf(st.nextToken());
			graph[s].add(e);
			graph[e].add(s);
		}
		int answer=0;
		for(int i=1; i<n+1; i++) {
			
			if(!visited[i]) {
				answer++;
				dfs(i);
			}
			
		}
		
		System.out.println(answer);
		
	}
	
	static void dfs(int node) {
		if(visited[node]) {
			return ;
		}
		else {
			visited[node]=true;
			for(int i: graph[node]) {
				dfs(i);
			}
		}
	}

}
