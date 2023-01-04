package Lib;

import static Lib.Converter.*;
import static Lib.Multiplication.multiply;

public class Exponentiation {
    public static String exponentiate(String num, String power, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        switch (NumeralSystemInput) {
            case 2 -> {
            }
            case 10 -> {
                num = DecToBin(num);
                power = DecToBin(power);
            }
            case 16 -> {
                num = HexToBin(num);
                power = HexToBin(power);
            }
            default -> throw new Exception("Wrong Numeral System");
        }
        String res = "1";
        for(int i = 0; i <= power.length() - 1; i++){
            res = multiply(res,res,2,2);
            if(power.charAt(i) == '1'){
                res = multiply(res, num,2,2);
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
