package Baekjoon.problem1655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>((o1, o2) -> o2 - o1);
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			if (max.size() == min.size()) {
				max.add(input);
			} else {
				min.add(input);
			}

			if (!min.isEmpty() && !max.isEmpty() && max.peek() > min.peek()) {
				min.add(max.poll());
				max.add(min.poll());
			}

			System.out.println(max.peek());
		}

		br.close();
	}
}
