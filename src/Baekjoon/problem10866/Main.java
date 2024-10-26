package Baekjoon.problem10866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()) {
                case("push_back"): {
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                }
                case("push_front"): {
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                }
                case("pop_front") : {
                    if (deque.peekFirst() == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollFirst());
                    }
                    break;
                }
                case("pop_back") : {
                    if (deque.peekLast() == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollLast());
                    }
                    break;
                }
                case("size") : {
                    System.out.println(deque.size());
                    break;
                }
                case("empty") : {
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    break;
                }
                case("front") : {
                    if (deque.peekFirst() == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekFirst());
                    }
                    break;
                }
                case("back") : {
                    if (deque.peekLast() == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekLast());
                    }
                    break;
                }

            }
        }
        br.close();
    }
}
