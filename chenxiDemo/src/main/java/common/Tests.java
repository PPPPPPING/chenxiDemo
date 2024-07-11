package common;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ping
 * @Date 2023/2/8 10:20
 */
public class Tests {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{2, 3, 5, 1, 4, 2}));
    }
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    @Test
    public static void test() {
        List list = new ArrayList();
    }
}
