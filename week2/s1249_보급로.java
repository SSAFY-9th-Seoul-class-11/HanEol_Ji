package week2;

import java.io.*;
import java.util.*;
public class s1249_보급로 {
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		
		for(int test=1; test<=t;test++) {
			
			int n=Integer.valueOf(br.readLine());
			Queue<int[]> myQueue = new LinkedList<>();
			map =new int[n][n]; //원본
			int[][] tmp =new int[n][n];//복사
			for(int i=0;i<n;i++) {
				String s =br.readLine();
				for(int j=0;j<n;j++) {
					map[i][j]= Integer.valueOf(s.substring(j,j+1));
					tmp[i][j]=map[i][j];
				}
			}
			 //복사본
			boolean[][] visited = new boolean[n][n];
			
			myQueue.add(new int[] {0,0});
			visited[0][0]=true;
			while(!myQueue.isEmpty()) {
				
				int[] now = myQueue.poll();
				
				
				for(int i=0;i<4;i++) {
					int nx=dx[i]+now[0];
					int ny=dy[i]+now[1];
					
					
					
					if(ny>=n || nx>=n||nx<0||ny<0) continue;
					
					int tmpnum= tmp[now[0]][now[1]]+map[nx][ny]; // 다음꺼
					
					if(!visited[nx][ny]) { //방문안했다면
						tmp[nx][ny] =tmpnum;
						myQueue.add(new int[] {nx,ny});
						visited[nx][ny]=true;
						continue;
					}
					
					if(tmpnum < tmp[nx][ny]) {//방문했고 값이 작으면			
						tmp[nx][ny] =  tmpnum;
						myQueue.add(new int[] {nx,ny});
					}
				}
				
			}

			
			
			System.out.println("#"+test+" "+tmp[n-1][n-1]);
	}

	}
}



