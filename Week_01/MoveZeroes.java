package algorithm;

import java.util.Arrays;

/**
 * 移动零
 */
public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] params = {1,0,5,0,6,199,0,0,0};
        moveZeroes.solution(params);
        System.out.println(Arrays.toString(params));
    }

    public void solution(int[] nums){
        if (nums == null || nums.length == 0) return ;
        int[] t = new int[nums.length];
        int zCount = 0,next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zCount++;
            } else {
                t[next++] = nums[i];
            }
        }
        if (zCount != 0) {
            for (int i = 0; i < zCount; i++) {
                t[next++] = 0;
            }
        }
        nums = t;
        System.out.println(Arrays.toString(nums));
    }
}
