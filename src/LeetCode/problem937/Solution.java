package LeetCode.problem937;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Solution {
    public boolean isBigDecimal(String i) {
        try {
            new BigDecimal(i);
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    public String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<>();
        List<String> letters = new ArrayList<>();

        for (String log : logs) {
            String[] str = log.split(" ");

            if (isBigDecimal(str[1])) digits.add(log);
            else letters.add(log);
        }

        letters.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] oo1 = o1.split(" ");
                String[] oo2 = o2.split(" ");
                String[] oo3 = new String[Math.max(oo1.length, oo2.length)];
                String[] oo4 = new String[Math.max(oo1.length, oo2.length)];
                for (int i = 0; i < oo1.length; i++) oo3[i] = oo1[i];
                for (int i = 0; i < oo2.length; i++) oo4[i] = oo2[i];

                if (oo1.length > oo2.length) {
                    for (int i = oo2.length; i < oo1.length; i++) {
                        oo4[i] = "a";
                    }
                } else {
                    for (int i = oo1.length; i < oo2.length; i++) {
                        oo3[i] = "a";
                    }
                }

                for (int i = 1; i < oo3.length; i++) {
                    if (oo3[i].compareTo(oo4[i]) == 0)
                        continue;
                    else {
                        return oo3[i].compareTo(oo4[i]);
                    }
                }
                return oo3[0].compareTo(oo4[0]);
            }
        });

        letters.addAll(digits);
        return letters.toArray(new String[letters.size()]);
    }
}