package Baekjoon.problem1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] alphabet = new int[26];
		for (char c : input.toCharArray()) {
			if (c >= 65 && c <= 91) {
				alphabet[c-65]++;
			}
			if (c >= 97 && c <= 123) {
				alphabet[c-97]++;
			}
		}

		int max = -1;
		int idx = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] > max) {
				max = alphabet[i];
				idx = i;
			}
		}

		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] == max && idx != i) {
				System.out.println("?");
				return;
			}
		}

		System.out.printf("%c", 65 + idx);

		br.close();
	}
}
