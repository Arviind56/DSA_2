// visulize it
// https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=import+java.util.Arrays%3B%0A%0Apublic+class+ClassNameHere+%7B%0A%0A++++/**%0A+++++*+Finds+the+minimal+length+of+a+contiguous+subarray+whose+sum+is+%3E%3D+target.%0A+++++*+This+method+uses+the+efficient+sliding+window+(two-pointer)+technique.%0A+++++*%0A+++++*+%40param+target+The+target+sum+to+meet+or+exceed.%0A+++++*+%40param+nums+The+input+array+of+positive+integers.%0A+++++*+%40return+The+minimal+length+of+a+valid+subarray,+or+0+if+no+such+subarray+exists.%0A+++++*/%0A++++public+int+minSubArrayLen(int+target,+int%5B%5D+nums)+%7B%0A++++++++//+Initialize+variables%0A++++++++int+n+%3D+nums.length%3B%0A++++++++int+minLength+%3D+Integer.MAX_VALUE%3B+//+Use+a+large+value+to+track+the+minimum%0A++++++++int+windowSum+%3D+0%3B%0A++++++++int+left+%3D+0%3B+//+The+left+pointer+of+our+sliding+window%0A%0A++++++++//+The+'right'+pointer+expands+the+window+by+iterating+through+the+array%0A++++++++for+(int+right+%3D+0%3B+right+%3C+n%3B+right%2B%2B)+%7B%0A++++++++++++//+Add+the+current+element+to+the+window's+sum%0A++++++++++++windowSum+%2B%3D+nums%5Bright%5D%3B%0A%0A++++++++++++//+Once+the+window's+sum+is+valid+(%3E%3D+target),+try+to+shrink+it%0A++++++++++++//+from+the+left+to+find+the+smallest+possible+valid+window.%0A++++++++++++while+(windowSum+%3E%3D+target)+%7B%0A++++++++++++++++//+Update+our+overall+minimum+length+found%0A++++++++++++++++minLength+%3D+Math.min(minLength,+right+-+left+%2B+1)%3B%0A++++++++++++++++%0A++++++++++++++++//+Shrink+the+window%3A+subtract+the+leftmost+element+and+move+the+pointer%0A++++++++++++++++windowSum+-%3D+nums%5Bleft%5D%3B%0A++++++++++++++++left%2B%2B%3B%0A++++++++++++%7D%0A++++++++%7D%0A%0A++++++++//+If+minLength+was+never+updated,+no+valid+subarray+was+found.%0A++++++++//+Otherwise,+return+the+minimum+length+found.%0A++++++++return+(minLength+%3D%3D+Integer.MAX_VALUE)+%3F+0+%3A+minLength%3B%0A++++%7D%0A%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++++ClassNameHere+solution+%3D+new+ClassNameHere()%3B%0A%0A++++++++//+Input+from+the+prompt%0A++++++++int+target+%3D+7%3B%0A++++++++int%5B%5D+nums+%3D+%7B2,+3,+1,+2,+4,+3%7D%3B%0A%0A++++++++//+Call+the+method+to+get+the+result%0A++++++++int+result+%3D+solution.minSubArrayLen(target,+nums)%3B%0A%0A++++++++//+Print+the+inputs+and+the+final+result%0A++++++++System.out.println(%22Input+Array%3A+%22+%2B+Arrays.toString(nums))%3B%0A++++++++System.out.println(%22Target%3A+%22+%2B+target)%3B%0A++++++++System.out.println(%22Minimal+length+of+a+valid+subarray%3A+%22+%2B+result)%3B+//+Expected+output%3A+2%0A++++%7D%0A%7D&mode=display&curInstr=10

import java.util.*;

public class minimum_209 {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int t = target;
        int m = Arrays.stream(nums).sum();
        int j = 0;
        int max_min = Integer.MAX_VALUE;
        int val = 0;
        List<Integer> li = new ArrayList<>();
        if (m < t) {
            return 0;
        } else if (m == t) {
            return nums.length;
        } else {
            for (int i = 0; i < n; i++) {

                val += nums[i];
                while (t <= val) {
                    int min = i - j + 1;
                    max_min = Math.min(min, max_min);
                    val -= nums[j];
                    j++;
                }
                System.out.print(j);
            }
        }
        System.out.print(li);
        return max_min;
    }

    public static void main(String[] args) {
        minimum_209 solution = new minimum_209();

        // Input from the prompt
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        // Call the method to get the result
        int result = solution.minSubArrayLen(target, nums);

        // Print the inputs and the final result
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Minimal length of a valid subarray: " + result); // Expected output: 2
    }
}
