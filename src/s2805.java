import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class s2805 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		for(int test=1;test<=t;test++) {
		int n = Integer.valueOf(br.readLine());
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			String c = br.readLine();
			for(int j=0;j<n;j++) {
			arr[i][j] = Integer.valueOf(c.charAt(j)-'0');
		}
		}
		
		int answer=0;
		int end=n/2, start=n/2;
		
		for(int i=0; i<n;i++) {
			for(int j=start; j<end+1; j++) {
				 answer+=arr[i][j];
				
			}
			if(i<n/2) {
				start--;
				end++;
			}else {
				start++;
				end--;
			}
		}
		
		System.out.println("#"+test+" "+answer);
		
			
		}
	}
}