
import java.util.*;

public class frequency {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 4, 4, 5, 3};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = 0;
        int maxval = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxval = entry.getKey();
            }
        }
        System.out.println(max + " " + maxval);
    }
}
