package algorithm;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] params = new int[]{1,3,6,5,9,2};
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.solution2(params,7)));
    }

    /**
     * baoli
     * @param nums
     * @param target
     * @return
     */
    public int[] solution1(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * hash
     * @param nums
     * @param target
     * @return
     */
    public int[] solution2(int[] nums, int target){
        if (nums == null || nums.length == 0) return null;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[]{i,map.get(temp)};
            }
        }
        return  null;
    }
}
