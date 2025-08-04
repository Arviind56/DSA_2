
import java.util.*;

class Solution {

    /**
     * This is your new, CORRECT implementation of the threeSum problem. It
     * correctly uses the sorting and two-pointer pattern.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentsum = nums[left] + nums[right];

                if (currentsum == target) {
                    // Found a valid triplet
                    li.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicate values for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move pointers to look for the next unique triplet
                    left++;
                    right--;
                } else if (currentsum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return li;
    }
}

public class three_sum {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // --- Input ---
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Input Array: " + Arrays.toString(nums));

        // --- Executing your correct code ---
        List<List<Integer>> result = solution.threeSum(nums);

        // --- Output ---
        System.out.println("Output from your code: " + result);
        System.out.println("Expected Output:       [[-1, -1, 2], [-1, 0, 1]]");
    }
}



// https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=import+java.util.ArrayList%3B%0Aimport+java.util.Arrays%3B%0Aimport+java.util.List%3B%0A%0Aclass+Solution+%7B%0A++++/**%0A+++++*+This+is+your+new,+CORRECT+implementation+of+the+threeSum+problem.%0A+++++*+It+correctly+uses+the+sorting+and+two-pointer+pattern.%0A+++++*/%0A++++public+List%3CList%3CInteger%3E%3E+threeSum(int%5B%5D+nums)+%7B%0A++++++++List%3CList%3CInteger%3E%3E+li+%3D+new+ArrayList%3C%3E()%3B%0A++++++++Arrays.sort(nums)%3B%0A++++++++int+n+%3D+nums.length%3B%0A%0A++++++++for+(int+i+%3D+0%3B+i+%3C+n+-+2%3B+i%2B%2B)+%7B%0A++++++++++++//+Skip+duplicate+values+for+the+first+element%0A++++++++++++if+(i+%3E+0+%26%26+nums%5Bi%5D+%3D%3D+nums%5Bi+-+1%5D)+%7B%0A++++++++++++++++continue%3B%0A++++++++++++%7D%0A++++++++++++%0A++++++++++++int+target+%3D+-nums%5Bi%5D%3B%0A++++++++++++int+left+%3D+i+%2B+1%3B%0A++++++++++++int+right+%3D+n+-+1%3B%0A%0A++++++++++++while+(left+%3C+right)+%7B%0A++++++++++++++++int+currentsum+%3D+nums%5Bleft%5D+%2B+nums%5Bright%5D%3B%0A%0A++++++++++++++++if+(currentsum+%3D%3D+target)+%7B%0A++++++++++++++++++++//+Found+a+valid+triplet%0A++++++++++++++++++++li.add(Arrays.asList(nums%5Bi%5D,+nums%5Bleft%5D,+nums%5Bright%5D))%3B%0A%0A++++++++++++++++++++//+Skip+duplicate+values+for+the+second+element%0A++++++++++++++++++++while+(left+%3C+right+%26%26+nums%5Bleft%5D+%3D%3D+nums%5Bleft+%2B+1%5D)+%7B%0A++++++++++++++++++++++++left%2B%2B%3B%0A++++++++++++++++++++%7D%0A++++++++++++++++++++//+Skip+duplicate+values+for+the+third+element%0A++++++++++++++++++++while+(left+%3C+right+%26%26+nums%5Bright%5D+%3D%3D+nums%5Bright+-+1%5D)+%7B%0A++++++++++++++++++++++++right--%3B%0A++++++++++++++++++++%7D%0A%0A++++++++++++++++++++//+Move+pointers+to+look+for+the+next+unique+triplet%0A++++++++++++++++++++left%2B%2B%3B%0A++++++++++++++++++++right--%3B%0A++++++++++++++++%7D+else+if+(currentsum+%3C+target)+%7B%0A++++++++++++++++++++left%2B%2B%3B%0A++++++++++++++++%7D+else+%7B%0A++++++++++++++++++++right--%3B%0A++++++++++++++++%7D%0A++++++++++++%7D%0A++++++++%7D%0A++++++++return+li%3B%0A++++%7D%0A%7D%0A%0Apublic+class+ClassNameHere+%7B%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++++Solution+solution+%3D+new+Solution()%3B%0A%0A++++++++//+---+Input+---%0A++++++++int%5B%5D+nums+%3D+%7B-1,+0,+1,+2,+-1,+-4%7D%3B%0A++++++++System.out.println(%22Input+Array%3A+%22+%2B+Arrays.toString(nums))%3B%0A++++++++%0A++++++++//+---+Executing+your+correct+code+---%0A++++++++List%3CList%3CInteger%3E%3E+result+%3D+solution.threeSum(nums)%3B%0A%0A++++++++//+---+Output+---%0A++++++++System.out.println(%22Output+from+your+code%3A+%22+%2B+result)%3B%0A++++++++System.out.println(%22Expected+Output%3A+++++++%5B%5B-1,+-1,+2%5D,+%5B-1,+0,+1%5D%5D%22)%3B%0A++++%7D%0A%7D&mode=display&curInstr=89
