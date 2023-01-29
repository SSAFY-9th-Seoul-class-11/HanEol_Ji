package week2;
import java.util.Scanner;

public class น้มุ_2023DFS {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		
		dfs(2,1);
		dfs(3,1);
		dfs(5,1);
		dfs(7,1);
		
	}
	
	public static void dfs(int num, int depth) {
		if(n==depth) {
			if(isprime(num)) System.out.println(num);
			return;
		}
		for(int i=1; i<10; i+=2) { //ศฆผ๖
			if(isprime(num*10+i)) {
				dfs(num*10+i,depth+1);
			}
			
		}
		
		
		
		
	}
	public static boolean isprime(int num) {
		for(int i=2; i<Math.sqrt(num);i++) {
			if(num%i==0) return false;
		}
		
		return true;
	}
}
