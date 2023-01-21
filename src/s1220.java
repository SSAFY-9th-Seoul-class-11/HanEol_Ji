import java.io.*;
import java.util.*;

public class s1220 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t=1; t<=10;t++) {
			int n=Integer.valueOf(bf.readLine());
			int[] check = new int[n];
			int answer=0;
			for(int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				for(int j=0; j<n;j++) {
					int num = Integer.valueOf(st.nextToken());
					if(num==0) continue;
					switch(num) {
					case 1: //n±ØÀÏ¶§
						if(check[j]==0||check[j]==2) {
							check[j]=1;
						}
						break;
					case 2:  //s±Ø
						if(check[j]==1) {
							answer++;
							check[j]=2;
						}
					}
					
					
				}
				
			}
			
			System.out.println("#"+t+" "+answer);
			
			
			
			
		}
	}

}
