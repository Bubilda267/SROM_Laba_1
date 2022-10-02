import java.math.BigInteger;

public class Lib {

    private static class Wrapper {

        public String string;
        public Wrapper(String string){
            this.string = hexToBin(string);
        }
    }

    private static void swap(Wrapper a, Wrapper b){
        if(compare(a.string,b.string) == -1){
            String temp = a.string;
            a.string = b.string;
            b.string = temp;
        }
    }

//    static String hexToBinary(String hex){
//        String binary = "";
//        hex = hex.toUpperCase();
//
//        // initializing the HashMap class
//        HashMap<Character, String> hashMap
//                = new HashMap<Character, String>();
//
//        // storing the key value pairs
//        hashMap.put('0', "0000");
//        hashMap.put('1', "0001");
//        hashMap.put('2', "0010");
//        hashMap.put('3', "0011");
//        hashMap.put('4', "0100");
//        hashMap.put('5', "0101");
//        hashMap.put('6', "0110");
//        hashMap.put('7', "0111");
//        hashMap.put('8', "1000");
//        hashMap.put('9', "1001");
//        hashMap.put('A', "1010");
//        hashMap.put('B', "1011");
//        hashMap.put('C', "1100");
//        hashMap.put('D', "1101");
//        hashMap.put('E', "1110");
//        hashMap.put('F', "1111");
//
//
//        char ch;
//
//        // loop to iterate through the length
//        // of the Hexadecimal String
//        for (int i = 0; i < hex.length(); i++) {
//            // extracting each character
//            ch = hex.charAt(i);
//
//            // checking if the character is
//            // present in the keys
//            if (hashMap.containsKey(ch))
//
//                // adding to the Binary Sequence
//                // the corresponding value of
//                // the key
//                binary += hashMap.get(ch);
//
//                // returning Invalid Hexadecimal
//                // String if the character is
//                // not present in the keys
//            else {
//                binary = "Invalid Hexadecimal String";
//                return binary;
//            }
//        }
//
//        // returning the converted Binary
//        return binary;
//    }

    private static String hexToBin(String str) {
        return new BigInteger(str, 16).toString(2);
    }

    private static String BinToHex(String str){
        return new BigInteger(str, 2).toString(16);
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
            res += temp & 1;
            carry = temp >> 1;
            n -= 1;
        }
        while (rest != 0) {
            temp = a.string.charAt(rest-1) - '0' + carry;
            res +=  temp & 1;
            carry = temp >> 1;
            rest -= 1;
        }
        if (carry != 0){
            res += carry;
        }

        return BinToHex(new StringBuilder(res).reverse().toString());
    }
}