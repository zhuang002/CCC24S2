import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<T;i++) {
			boolean result = strAltered(sc.nextLine(),N);
			System.out.println(result?"T":"F");
		}
	}

	private static boolean strAltered(String line,int N) {
		char c = line.charAt(0);
		boolean lastHeavy = isHeavy(c, 0,  line, N);
		for (int i=1;i<N;i++) {
			c = line.charAt(i);
			boolean currentHeavy = isHeavy(c, i, line, N);
			if (lastHeavy == currentHeavy) {
				return false;
			}
			lastHeavy = currentHeavy;
		}
		return true;
	}

	private static boolean isHeavy(char c, int pos, String line, int n) {
		// TODO Auto-generated method stub
		for (int i=0;i<n;i++) {
			if (i==pos) continue;
			char c2 = line.charAt(i);
			if (c == c2) return true;
		}
		return false;
	}

}
