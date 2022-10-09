package Lib;

import static Lib.Converter.*;
public class Subtraction {
    public static String subtract(String num1, String num2) {
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

        StringBuilder res = new StringBuilder();
        int borrow = 0, temp;
        for (int i = len; i > 0; i--) {
            temp = (num1.charAt(i - 1) - '0') - (num2.charAt(i - 1) - '0') - borrow;
            if (temp >= 0) {
                res.append(temp);
                borrow = 0;
            } else {
                res.append((2 + temp));
                borrow = 1;
            }
        }
        if (borrow == 0) {
            return BinToHex(res.reverse().toString());
        } else {
            return "negative number";
        }
    }

    static String subtract_(String num1, String num2) {
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

        StringBuilder res = new StringBuilder();
        int borrow = 0, temp;
        for (int i = len; i > 0; i--) {
            temp = (num1.charAt(i - 1) - '0') - (num2.charAt(i - 1) - '0') - borrow;
            if (temp >= 0) {
                res.append(temp);
                borrow = 0;
            } else {
                res.append((2 + temp));
                borrow = 1;
            }
        }
        return res.reverse().toString();
    }
}


