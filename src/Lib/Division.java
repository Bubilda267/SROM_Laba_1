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

    public static String divide(String A, String B) {
        A = HexToBin(A);
        B = HexToBin(B);
        StringBuilder res = new StringBuilder();
        StringBuilder remainder = new StringBuilder();
        for(int i = 0; i < A.length(); i++){
            remainder.append(A.charAt(i));
            if(compare(remainder.toString(), B) != -1){
                res.append("1");
                remainder = new StringBuilder(RemoveLeadingZeroes(subtract_(remainder.toString(), B)));
            }
            else{
                res.append("0");
            }
        }
        return BinToHex(res.toString());
    }
}
