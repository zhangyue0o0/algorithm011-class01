package algorithm;

import org.redisson.misc.Hash;

import java.util.*;

public class GroupAnagrams {

    /**
     * ["eat", "tea", "tan", "ate", "nat", "bat"]
     * @param args
     */
    public static void main(String[] args) {
        String[] params = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams g = new GroupAnagrams();
        List<List<String>> rslt = g.solution1(params);
        System.out.println(rslt.toString());
    }

    /**
     * sort method
     * @param strs
     * @return
     */
    public List<List<String>> solution1(String[] strs) {
        if (strs == null || strs.length == 0) return null;
        List<List<String>> rslt = new ArrayList<>();
        Map<String,List<String>> sortedMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            sortedMap.put(String.valueOf(temp),new ArrayList<>());
        }

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);//logn
            String sortedString = String.valueOf(temp);
            if (sortedMap.containsKey(sortedString)) {
                sortedMap.get(sortedString).add(strs[i]);
            }
        }
        System.out.println(sortedMap);
        for (Iterator<Map.Entry<String,List<String>>> iterator
             = sortedMap.entrySet().iterator(); iterator.hasNext(); ) {
            rslt.add(iterator.next().getValue());
        }
        return rslt;
    }
}
