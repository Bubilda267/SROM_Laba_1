package Lib;
import java.util.Objects;

import static Lib.Converter.*;

public class Addition {

    public static String add(String num1, String num2){
        if(Objects.equals(num1, "0") || num1 == null){return num2;}
        if(Objects.equals(num2, "0") || num2 == null){return num1;}
        StringBuilder sb_1 = new StringBuilder(HexToBin(num1));
        StringBuilder sb_2 = new StringBuilder(HexToBin(num2));
        int len_1 = sb_1.length();
        int len_2 = sb_2.length();
        int len = Math.max(len_1, len_2);
        for (int i = len_1; i < len; i++) {
            sb_1.insert(0, '0');
        }
        for (int i = len_2; i < len; i++) {
            sb_2.insert(0, '0');
        }
        num1 = sb_1.toString();
        num2 = sb_2.toString();

        int carry = 0;
        StringBuilder res = new StringBuilder();
        for(int i = len; i > 0; i--){
            int temp =  (num1.charAt(i-1) - '0') + (num2.charAt(i-1) - '0') + carry;
            res.append(temp & 1);
            carry = temp >> 1;
        }
        if (carry != 0){
            res.append(carry);
        }
        return BinToHex(res.reverse().toString());
    }


    static String add_(String num1, String num2){
        if(Objects.equals(num1, "0") || num1 == null){return num2;}
        if(Objects.equals(num2, "0") || num2 == null){return num1;}
        StringBuilder sb_1 = new StringBuilder(num1);
        StringBuilder sb_2 = new StringBuilder(num2);
        int len_1 = sb_1.length();
        int len_2 = sb_2.length();
        int len = Math.max(len_1, len_2);
        for (int i = len_1; i < len; i++) {
            sb_1.insert(0, '0');
        }
        for (int i = len_2; i < len; i++) {
            sb_2.insert(0, '0');
        }
        num1 = sb_1.toString();
        num2 = sb_2.toString();

        int carry = 0;
        StringBuilder res = new StringBuilder();
        for(int i = len; i > 0; i--){
            int temp =  (num1.charAt(i-1) - '0') + (num2.charAt(i-1) - '0') + carry;
            res.append(temp & 1);
            carry = temp >> 1;
        }
        if (carry != 0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
