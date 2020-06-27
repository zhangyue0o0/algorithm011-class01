package algorithm;

import java.util.Arrays;

public class Rotate {

    public static void main(String[] args) {
        int[] params = {1,2,3,4,5,6,7};
        //0.{1234567}
        //1.{7123456}
        //2.{6712345}
        //3.{5671234}
        Rotate rotate = new Rotate();
        rotate.solution1(params,3);
//        rotate.solution2(params,11);
    }

    //暴力
    public void solution1(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) return;
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     *
     * @param nums
     * @param k
     */
//    public void solution2(int[] nums,int k){
//        if (nums == null || nums.length == 0 || k == 0) return;
//        System.out.println( k % nums.length);
//    }
}
