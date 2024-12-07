package Baekjoon.problem2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int R = Integer.parseInt(st.nextToken());
			String P = st.nextToken();
			StringBuilder sb = new StringBuilder();
			for (char c : P.toCharArray()) {
				sb.append((c + "").repeat(R));
			}
			System.out.println(sb);
		}

		br.close();
	}
}
