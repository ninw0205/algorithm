package Baekjoon.problem1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Jewel implements Comparable<Jewel> {
		int weight;
		int price;

		public Jewel(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}

		@Override
		public int compareTo(Jewel o) {
			return this.weight == o.weight ? o.price - this.price : this.weight - o.weight;
		}

		@Override
		public String toString() {
			return "Jewel{" +
				"weight=" + weight +
				", price=" + price +
				'}';
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		Jewel[] jewels = new Jewel[n];
		int k = Integer.parseInt(st.nextToken());
		int[] c = new int[k];
		long sum = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			jewels[i] = (new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}

		for (int i = 0; i < k; i++) {
			c[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(c);
		Arrays.sort(jewels);

		PriorityQueue<Jewel> bag = new PriorityQueue<>((o1, o2) -> o2.price - o1.price);
		int idx = 0;
		for (int i = 0; i < k; i++) {
			while (idx < n && jewels[idx].weight <= c[i]) {
				bag.add(jewels[idx++]);
			}

			// for (int j = idx; j < n; j++) {
			// 	if (jewels[j].weight <= c[i]) {
			// 		bag.add(jewels[j]);
			// 	} else {
			// 		idx = j;
			// 		break;
			// 	}
			// }
			if (!bag.isEmpty()) {
				sum += bag.poll().price;
			}
		}
		System.out.println(sum);
		br.close();
	}
}
