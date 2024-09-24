package LeetCode.problem819;

import java.util.*;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> voca = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        StringTokenizer st = new StringTokenizer(paragraph, " ,.!?';");
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            if (!voca.containsKey(tmp)) {
                voca.put(tmp, 1);
            } else {
                voca.replace(tmp, voca.get(tmp), voca.get(tmp) + 1);
            }
        }

        System.out.println(voca.toString());
        for (String b : banned) {
            voca.remove(b);
        }
        int max = -1;
        String maxString = new String();
        for (String s : voca.keySet()) {
            if (voca.get(s) > max) {
                max = voca.get(s);
                maxString = s;
            }
        }
        return maxString.toLowerCase();
    }
}
