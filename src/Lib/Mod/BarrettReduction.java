package Lib.Mod;

import java.math.BigInteger;

import static Lib.Comparing.compare;
import static Lib.Division.divide;
import static Lib.Exponentiation.exponentiate;
import static Lib.Multiplication.multiply;
import static Lib.Subtraction.subtract;
import static Lib.Converter.*;

public class BarrettReduction {
//    public static String barrett(String x, String n) throws Exception {
//        int k = new BigInteger(n).bitLength();
//        String u = divide(exponentiate("2", multiply("2", DecToHex(Integer.toString(k)), 10)), n);
//        String q =  x.substring(0, x.length() - k + 1);
//        q = multiply(q, u, 16);
//        q = q.substring(0, q.length() - k - 1);
//        String r = subtract(x, multiply(q, n));
//
//        while (compare(r,n) >= 0){
//            r = subtract(r,n);
//        }
//        return r;
//    }
}
