package algorithm;

import javax.validation.constraints.Max;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] params = new int[]{1,3,2,8,1,5,20};
        MaxArea maxArea = new MaxArea();
        System.out.println(maxArea.solution2(params));

    }

    public int solution(int[] height) {
        if (height == null || height.length == 0) return 0;
        int area = 0,i = 0,j = height.length - 1;
        while (i < j) {
            int leftbar = height[i];
            int rightbar = height[j];
            area = Math.max((j - i) * Math.min(leftbar , rightbar),area);
            if (leftbar > rightbar) {
                j--;
            }else {
                i++;
            }
        }
        return area;
    }


    public int solution2(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                area = Math.max((j - i) * Math.min(height[i] , height[j]),area);
            }
        }
        return area;
    }
}
