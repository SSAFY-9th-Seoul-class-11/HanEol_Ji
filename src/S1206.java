import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1206 {
		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test=1;test<=10;test++) {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		int answer=0;
		for(int now=2; now<n-2;now++) {
			int max_left = Math.max(arr[now-1], arr[now-2]); 
			if(max_left>=arr[now]) continue;
			int max_right =  Math.max(arr[now+1], arr[now+2]);
			if(max_right>=arr[now]) continue;
			
			int max = Math.max(max_left, max_right);
			if(arr[now]>max) answer+=arr[now]-max;
			
		}	
		System.out.println("#"+test+" " +answer);
		
		
		}
	}
}
