package Lib;

public class Comparing {
    // 1 - if a > b
    // 0 - if a == b
    // -1 - if a < b
    public static int compare(String a, String b) {
        int size_a = a.length();
        int size_b = b.length();
        if (size_a > size_b) {
            return 1;
        } else if (size_a < size_b) {
            return -1;
        } else {
            int i = 0;
            while (i != size_a && a.charAt(i) == b.charAt(i)) {
                i += 1;
            }
            if (i == size_a) {
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
