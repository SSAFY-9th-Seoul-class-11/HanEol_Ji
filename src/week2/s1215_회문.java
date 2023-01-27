package week2;

import java.util.Scanner;

public class s1215_회문 {
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			int n=sc.nextInt();
			String[] sarr=new String[8];
			answer=0;
			for(int i=0;i<8;i++) {
				String st = sc.next();
				sarr[i]=st;
			}
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<8;i++) {
				for(int j=0;j<9-n;j++) { //가로 확인
					check(sarr[i].substring(j,j+n));
					
					
					for(int c=0;c<n;c++) { //세로확인
					sb.append(sarr[j+c].substring(i,i+1));
					}
					check(sb.toString());
					sb.setLength(0);
				}
			}
			
			System.out.println("#"+t+" "+answer);
			
			
			
			
			
			
		}
	}
	public static void check(String str) {
		
		StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        if(str.equals(reversedStr)) { 
        	answer++;
        }
	}

}
