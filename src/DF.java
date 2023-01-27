import java.util.Arrays;

public class DF {

	public static void main(String[] args) {
		int[] s = new int[] {1,2};
		int[] d = s.clone();
		s[1]=3;
		System.out.println(Arrays.toString(s));
	}

}
