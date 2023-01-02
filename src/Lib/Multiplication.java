package Lib;

import static Lib.Addition.add;
import static Lib.Converter.*;
import static Lib.ShiftBitsToHigh.ShiftBits;

public class Multiplication {

    public static String multiply(String num1, String num2, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        StringBuilder sb_1, sb_2;
        switch (NumeralSystemInput) {
            case 2 -> {
                sb_1 = new StringBuilder(num1);
                sb_2 = new StringBuilder(num2);
            }
            case 10 -> {
                sb_1 = new StringBuilder(DecToBin(num1));
                sb_2 = new StringBuilder(DecToBin(num2));
            }
            case 16 -> {
                sb_1 = new StringBuilder(HexToBin(num1));
                sb_2 = new StringBuilder(HexToBin(num2));
            }
            default -> throw new Exception("Wrong Numeral System");
        }
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
                res = (add(temp, res, 2, 2));
            }
        }
        switch (NumeralSystemOutput) {
            case 2 -> {
                return res;
            }
            case 10 -> {
                return BinToDec(res);
            }
            case 16 -> {
                return BinToHex(res);
            }
            default -> throw new Exception("Wrong Numeral System");
        }
    }
}
