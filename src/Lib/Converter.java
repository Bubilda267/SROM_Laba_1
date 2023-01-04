package Lib;

import java.math.BigInteger;

public class Converter {
    public static String HexToBin(String str) { return new BigInteger(str, 16).toString(2); }

    public static String BinToHex(String str){
        return new BigInteger(str, 2).toString(16);
    }

    public static String BinToDec(String str){
        return new BigInteger(str, 2).toString(10);
    }

    public static String DecToBin(String str) {
        return new BigInteger(str, 10).toString(2);
    }
    public static String DecToHex(String str) {
        return new BigInteger(str, 10).toString(16);
    }
    public static String HexToDec(String str) {
        return new BigInteger(str, 16).toString(10);
    }
}
