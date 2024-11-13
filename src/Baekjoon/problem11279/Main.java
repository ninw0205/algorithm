package Baekjoon.problem11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input == 0) {
				if (priorityQueue.isEmpty())
					System.out.println(0);
				else
					System.out.println(priorityQueue.poll());
			}
			priorityQueue.add(input);
		}

		br.close();
	}
}
