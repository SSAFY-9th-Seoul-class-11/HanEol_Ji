import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class s1225 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for(int test=1; test<11;test++) {
			
			int n = Integer.parseInt(bf.readLine());
			String[] s = bf.readLine().split(" ");
			Queue<Integer> myqueue = new LinkedList(); 
			
			for(int i=0; i<8; i++) {
				myqueue.add(Integer.valueOf(s[i]));// 데이터 받기
			}
			boolean end = false; 
			while(!end) {
				
				for(int i=1; i<6;i++) { //5번 반복
				int first=myqueue.poll();
				if(first-i<=0) { //끝이 0이면 종료
					myqueue.add(0);
					end=true;
					break;
				}
				myqueue.add(first-i);	
			}	
			}
			
			System.out.print("#"+n+" ");
			while(!myqueue.isEmpty()) { // 큐가 다 비워질때까지 출력
				System.out.print(myqueue.poll()+" ");
			}
		
		
			System.out.println();
		
		}
	}

}
