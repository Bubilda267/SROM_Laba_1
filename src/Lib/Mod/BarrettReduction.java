package Lib.Mod;

import static Lib.RemoveLeadingZeroes.removeLeadingZeroes;
import static Lib.Comparing.compare;
import static Lib.Division.divide;
import static Lib.Multiplication.multiply;
import static Lib.Subtraction.subtract;
import static Lib.Converter.*;
import static Lib.ShiftBitsToHigh.*;
public class BarrettReduction {
    public static String barrett(String num, String mod, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {

        switch (NumeralSystemInput) {
            case 2 -> {
                num = BinToHex(num);
                mod = BinToHex(mod);
            }
            case 10 -> {
                num = DecToHex(num);
                mod = DecToHex(mod);
            }
            case 16 -> {

            }
            default -> throw new Exception("Wrong Numeral System");
        }

        int k = mod.length();

        String u = U(k,mod);
        String q = num.substring(0, num.length() - k + 1);
        q = multiply(q, u, 16, 16);
        q = q.substring(0, q.length() - k - 1);
        String res = subtract(num, multiply(q, mod, 16, 16), 16, 16);
        if (res.equals("negative number")) {
            throw new Exception("Something wrong");
        }
        while (compare(res, mod) >= 0) {
            res = subtract(res, mod, 16, 16);
        }
        switch (NumeralSystemOutput) {
            case 2 -> {
                return HexToBin(res);
            }
            case 10 -> {
                return HexToDec(res);
            }
            case 16 -> {
                return res;
            }
            default -> throw new Exception("Wrong Numeral System");
        }
    }

    private static String U(int k, String mod) throws Exception {
        String u_ = shiftBitsToHigh("1", 2*k);
        return removeLeadingZeroes(divide(u_, mod, 16, 16));
    }
}
