
import java.util.*;

public class subarry_sum {

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int tsum = 0;
        map.put(0, 1);

        for (int i = 0; i < n; i++) {
            tsum += nums[i];
            int target = tsum - k;
            if (map.containsKey(target)) {
                count += map.get(target);
            }
            map.put(tsum, map.getOrDefault(tsum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        subarry_sum solution = new subarry_sum();

        int[] nums = {1, 2, 3, -3, 1, 1, 1};
        int k = 3;

        int result = solution.subarraySum(nums, k);

        System.out.println("The number of subarrays with sum " + k + " is: " + result);
    }
}
