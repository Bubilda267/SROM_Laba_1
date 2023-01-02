package Lib;

import static Lib.Converter.*;
public class Subtraction {
    public static String subtract(String num1, String num2, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
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
            switch (NumeralSystemOutput) {
                case 2 -> {
                    return res.reverse().toString();
                }
                case 10 -> {
                    return BinToDec(res.reverse().toString());
                }
                case 16 -> {
                    return BinToHex(res.reverse().toString());
                }
                default -> throw new Exception("Wrong Numeral System");
            }
        } else {
            return "negative number";
        }
    }
}


