package Lib;

import static Lib.Converter.*;
import static Lib.Comparing.compare;
import static Lib.RemoveLeadingZeroes.removeLeadingZeroes;
import static Lib.Subtraction.subtract;

public class Division {
    public static String divide(String num1, String num2, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        switch (NumeralSystemInput) {
            case 2 -> {
            }
            case 10 -> {
                num1 = DecToBin(num1);
                num2 = DecToBin(num2);
            }
            case 16 -> {
                num1 = HexToBin(num1);
                num2 = HexToBin(num2);
            }
            default -> throw new Exception("Wrong Numeral System");
        }
        StringBuilder res = new StringBuilder();
        StringBuilder remainder = new StringBuilder();
        for(int i = 0; i < num1.length(); i++){
            remainder.append(num1.charAt(i));
            remainder = new StringBuilder(removeLeadingZeroes(remainder.toString()));
            if(compare(remainder.toString(), num2) != -1){ // remainder >= num2
                res.append("1");
                remainder = new StringBuilder(removeLeadingZeroes(subtract(remainder.toString(), num2, 2, 2)));
            }
            else{
                res.append("0");
            }
        }
        switch (NumeralSystemOutput) {
            case 2 -> {
                return removeLeadingZeroes(res.toString());
            }
            case 10 -> {
                return BinToDec(res.toString());
            }
            case 16 -> {
                return BinToHex(res.toString());
            }
            default -> throw new Exception("Wrong Numeral System");
        }
    }
}
