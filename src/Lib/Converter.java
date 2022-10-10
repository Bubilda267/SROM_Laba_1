package Lib;

import java.math.BigInteger;

public class Converter {
    static String HexToBin(String str) {
        return new BigInteger(str, 16).toString(2);
    }

    static String BinToHex(String str){
        return new BigInteger(str, 2).toString(16);
    }
}
