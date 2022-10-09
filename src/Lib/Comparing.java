package Lib;

public class Comparing {
    public static int compare(String a, String b) {
        int size_a = a.length();
        int size_b = b.length();
        if (size_a > size_b) {
            return 1;
        } else if (size_a < size_b) {
            return -1;
        } else {
            int len = a.length();
            int i = 0;
            while (i != len && a.charAt(i) == b.charAt(i)) {
                i += 1;
            }
            if (i == len) {
                return 0;
            } else {
                if (a.charAt(i) > b.charAt(i)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }
}
