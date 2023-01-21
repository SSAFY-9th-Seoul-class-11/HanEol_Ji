import java.util.*;


public class 백준_110474그리디 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[] coins = new int[n];
		int answer =0;
		for(int i=0;i<n;i++) {
			coins[i] = sc.nextInt();
		}
		
		for(int i= coins.length-1; i>=0;i--) { //뒤에서 부터 보기
			if(coins[i]>k) continue;
			
			answer+= k/coins[i];
			k%=coins[i];
			
			if(k==0) {
				System.out.println(answer);
				return;
			}
			
		}
	}

}
