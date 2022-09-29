import java.util.Arrays;

public class Lib {

    private static class Wrapper {

        public String string;
        public Wrapper(String string){
            this.string = string;
        }
    }

    private static void swap(Wrapper a, Wrapper b){
        if(compare(a.string,b.string) == -1){
            String temp = a.string;
            a.string = b.string;
            b.string = temp;
        }
    }


    private static int log2(int N)
    {
        int result = (int)(Math.log(N) / Math.log(2));

        return result;
    }
    static int compare(String a, String b) {
        int size_a = a.length();
        int size_b = b.length();
        if (size_a > size_b) {
            return 1;
        }
        else if(size_a < size_b){
            return -1;
        }
        else {
            int i = size_a - 1;
            while (i!= -1 && a.charAt(i) == b.charAt(i)) {
                i -= 1;
            }
            if(i == -1){
                return 0;
            }
            else{
                if (a.charAt(i) > b.charAt(i)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }

    static String addition(String a_, String b_) {
        Wrapper a = new Wrapper(a_);
        Wrapper b = new Wrapper(b_);
        swap(a,b);
        int carry = 0;
        int n = b.string.length();
        int rest = a.string.length() - n;
        int temp;
        String res = "";
        while (n > 0) {
            temp =  (a.string.charAt(n+rest-1) - '0') + (int)(b.string.charAt(n-1) - '0') + carry;
            res += temp % 10; //(int)Math.pow(2,log2(10));
            carry = temp / 10; //(int)Math.pow(2,log2(10));
            n -= 1;
        }
        while (rest != 0) {
            temp = a.string.charAt(rest-1) - '0' + carry;
            res +=  temp % 10;
            carry = temp / 10;
            rest -= 1;
        }
        if (carry != 0){
            res += carry;
        }

        return new StringBuilder(res).reverse().toString();
    }
}