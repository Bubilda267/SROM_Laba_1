package Lib;

import static Lib.Addition.add_;
import static Lib.Converter.*;
import static Lib.ShiftBitsToHigh.ShiftBits;

public class Multiplication {

    public static String multiply(String num1, String num2) {
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

        String res = "0";
        for (int i = len; i > 0; i--) {
            if (num2.charAt(i - 1) != '0') {
                String temp = ShiftBits(num1, len - i);
                res = (add_(temp, res));
            }
        }
        return BinToHex(res);
    }
    static String multiply_(String num1, String num2){
        StringBuilder sb_1 = new StringBuilder(num1);
        StringBuilder sb_2 = new StringBuilder(num2);
        int len_1 = sb_1.length();
        int len_2 = sb_2.length();
        int len = Math.max(len_1, len_2);
        for (int i = len_1; i < len ; i++) {sb_1.insert(0, '0');}
        for (int i = len_2; i < len; i++) {sb_2.insert(0, '0');}
        num1 = sb_1.toString();
        num2 = sb_2.toString();

        String res = "0";
        for(int i = len; i > 0; i--){
            if(num2.charAt(i-1) != '0'){
                String temp = ShiftBits(num1, len - i);
                res = (add_(temp, res));
            }
        }
        return RemoveLeadingZeroes(res);
    }

    private static String RemoveLeadingZeroes(String num){
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)!='0'){
                return num.substring(i);
            }
        }
        return "0";
    }
}
