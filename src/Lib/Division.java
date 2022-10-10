package Lib;

import static Lib.Converter.*;
import static Lib.Comparing.compare;
import static Lib.Subtraction.subtract_;

public class Division {
    private static String RemoveLeadingZeroes(String num){
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)!='0'){
                return num.substring(i);
            }
        }
        return "0";
    }

    public static String divide(String num1, String num2) {
        num1 = HexToBin(num1);
        num2 = HexToBin(num2);
        StringBuilder res = new StringBuilder();
        StringBuilder remainder = new StringBuilder();
        for(int i = 0; i < num1.length(); i++){
            remainder.append(num1.charAt(i));
            if(compare(remainder.toString(), num2) != -1){
                res.append("1");
                remainder = new StringBuilder(RemoveLeadingZeroes(subtract_(remainder.toString(), num2)));
            }
            else{
                res.append("0");
            }
        }
        return BinToHex(res.toString());
    }
}
