package LeetCode.problem49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    // strs = ["eat","tea","tan","ate","nat","bat"]
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] tmp = str.toCharArray();
            Arrays.sort(tmp);
            String newStr = new String(tmp);
            if (!map.containsKey(newStr)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(newStr, list);
            } else {
                map.get(newStr).add(str);
            }
        }

        for (List<String> list : map.values()) {
            ret.add(list);
        }

        return ret;
    }
}
