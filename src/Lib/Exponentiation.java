package Lib;

import static Lib.Converter.*;
import static Lib.Multiplication.multiply_;
public class Exponentiation {
    public static String exponentiate(String num, String power){
        num = HexToBin(num);
        power = HexToBin(power);
        String res = "1";
        for(int i = 0; i <= power.length() - 1; i++){
            res = multiply_(res,res);
            if(power.charAt(i) == '1'){
                res = multiply_(res, num);
            }
        }
        return BinToHex(res);
    }
}
