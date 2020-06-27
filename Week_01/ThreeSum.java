package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，
 * 判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.solution1(new int[]{4,-2,-2,-3,3,0}));
    }

    public List<List<Integer>> solution1(int[] nums) {
        if (nums == null || nums.length == 0) return  null;
        List<List<Integer>> rel = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int revj = nums.length - 1,j = i + 1; j < nums.length; j++,revj--) {
                if (j < revj && nums[i] + nums[j] + nums[revj] == 0) {
                    List<Integer> t = new ArrayList<>();
                    t.add(i);t.add(j);t.add(revj);
                    rel.add(t);
                }
            }

        }
        return rel;
    }
}
