package HackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsItPossible {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String a = br.readLine();
			if (Integer.parseInt(a.substring(a.length() - 1)) % 2 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		br.close();
	}
}