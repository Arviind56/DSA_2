
import java.util.*;

public class asc_dsc {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int dsc[] = new int[n / 2];
        Arrays.sort(arr);
        int j = 0;
        for (int i = n - 1; i >= n / 2; i--) {
            dsc[j] = arr[i];
            j++;
        }
        j = 0;
        for (int i = n / 2; i < n; i++) {
            arr[i] = dsc[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
