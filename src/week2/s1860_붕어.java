package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class s1860_붕어 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int tin = Integer.valueOf(bf.readLine());
		for(int t=1; t<=tin;t++) {
			Boolean end =false;
			String[] s = bf.readLine().split(" ");
			int n=Integer.valueOf(s[0]) ,m=Integer.valueOf(s[1]),k=Integer.valueOf(s[2]); // 사람수, 시간당,만드는개수
			s=bf.readLine().split(" ");
			int[] human=new int[n]; //도착 시간
			for(int i=0;i<n;i++) {
				human[i]=Integer.valueOf(s[i]);
			}
			Arrays.sort(human);// 정렬
			int cur_boong=0;
			int cur_time=m;
			
			for(int i=0;i<n;i++) {
				if(human[i]>=cur_time) {
					cur_boong+=k-1;
					cur_time+=m;
				} else {
					if(cur_boong<1) {
						end=true;
						break;
					}
					cur_boong--;
				}
			}
		
			if(end) {
				System.out.println("#"+t+" "+"Imossible");
			} else {
				System.out.println("#"+t+" "+"possible");
			}
			
			
		}
	}

}
