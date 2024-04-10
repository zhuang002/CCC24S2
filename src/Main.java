import java.util.HashMap;
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
		HashMap<Character, Boolean> heavyDic = new HashMap<>();
		// build dictionary
		for (int i=0;i<N;i++) {
			char c = line.charAt(i);
			if (heavyDic.containsKey(c)) {
				heavyDic.put(c, true);
			} else {
				heavyDic.put(c, false);
			}
		}
		
		char c = line.charAt(0);
		boolean lastHeavy = heavyDic.get(c);
		for (int i=1;i<N;i++) {
			c = line.charAt(i);
			boolean currentHeavy = heavyDic.get(c);
			if (lastHeavy == currentHeavy) {
				return false;
			}
			lastHeavy = currentHeavy;
		}
		return true;
	}

	
}
