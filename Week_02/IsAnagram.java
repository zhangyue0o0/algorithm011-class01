package algorithm;

import org.hamcrest.core.Is;
import org.junit.platform.commons.util.StringUtils;

import java.util.*;

public class IsAnagram {

    public boolean solution1(String s, String t) {
        if (s == null || t == null || s.equals(t)) return true;
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();
        char[] c = s.toCharArray();
        char[] tc = t.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (maps.containsKey(c[i])) {
                int k = maps.get(c[i]).intValue();
                maps.put(c[i],k++);
            } else {
                maps.put(c[i],1);
            }
        }
        for (int i = 0; i < tc.length; i++) {
            if (mapt.containsKey(tc[i])) {
                int k = mapt.get(tc[i]).intValue();
                maps.put(tc[i],k++);
            } else {
                maps.put(tc[i],1);
            }
        }

        return true;
    }


    public boolean solution2(String s,String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        if (sc.length != tc.length) return false;
        Arrays.sort(sc);Arrays.sort(tc);
        return Arrays.equals(sc,tc);
    }


    public static void main(String[] args) {
        IsAnagram isAnagram=  new IsAnagram();
        System.out.println(isAnagram.solution2("rdf","rfg"));
    }

}
