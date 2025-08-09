
import java.util.*;

public class valstring { // Renamed the class from "string"

    public static void main(String[] args) {
        String str = "ArvindIsMyNameAndforcesOfTheCountry";
        StringBuilder str1 = new StringBuilder();
        int n = str.length();
        List<String> li = new ArrayList<>();
        int j = 0;
        int k = 0;
        str1.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < n; i++) {
            if (j == 1) {
                li.add(str1.toString());
                str1.setLength(0);
                k++;
                j = 0;
            }

            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                str1.append(Character.toUpperCase(ch));
            } else {
                str1.append(Character.toLowerCase(ch));

            }
            if (i < n - 1 && Character.isUpperCase(str.charAt(i + 1))) {
                j = 1;
            }
        }
        li.add(str1.toString());

        for (String str2 : li) {
            System.err.println(str2);
        }

    }
}
