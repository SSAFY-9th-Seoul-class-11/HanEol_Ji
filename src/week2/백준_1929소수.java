package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_1929소수 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[m+1];
		
		for(int i=2;i<m+1;i++) {
			arr[i]=i;
		}
		
		for(int i=2;i<Math.sqrt(m)+1;i++) {
			if(arr[i]==0) continue;
			
			for(int j=i*2;j<=m;j+=i) {
				arr[j]=0;
			}
		}
		
		for(int i=n; i<=m;i++) {
			if(arr[i]!=0) bw.write(arr[i]+"\n");
		}
		
		bw.flush();
	}
	
	
}
