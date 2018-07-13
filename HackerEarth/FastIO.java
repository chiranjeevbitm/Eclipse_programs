package HackerEarth;

import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastIO {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
	}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader scn = new FastReader();

		
		long n = scn.nextLong();
		long q = scn.nextLong();
		long[] arr = new long[(int) n];

		//arr[0] = 0;
		for (long i = 1; i <= n; i++) {
			arr[(int) i] = scn.nextLong();

		}

		for (long j = 0; j < q; j++) {
			long l = scn.nextLong();
			long r = scn.nextLong();
			System.out.println((l + r) / 2);
		}
	}
}
