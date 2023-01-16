import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s1208 {
	static int max,min;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		for(int test=1;test<=1;test++) {
			
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int[] arr = new int[100];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<100;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		int answer=0;
		
		for(int i=0; i<n; i++) {
			max = Arrays.stream(arr).max().getAsInt();
			min = Arrays.stream(arr).min().getAsInt();
			
			
			int max_idx=findidx(arr, max);
			int min_idx=findidx(arr, min);
			
			
			
			arr[max_idx]--;
			arr[min_idx]++;
			
			
			System.out.println(max_idx+" " +min_idx);
		}
		answer=max-min;
		System.out.println("#"+test+" " +answer);
			
		}
	}
	
	static int findidx(int[] arr , int num) {
		for(int i=0; i<100; i++) {
			if (arr[i]==num) return i;
		}
		return -1;
	}
}
