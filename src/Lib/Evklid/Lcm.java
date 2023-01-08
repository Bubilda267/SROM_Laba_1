package Lib.Evklid;

import static Lib.Multiplication.multiply;
import static Lib.Evklid.Gcd.gcd;
import static Lib.Division.divide;

public class Lcm {
    public static String lcm(String num1, String num2, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        String res = multiply(num1,num2,NumeralSystemInput,NumeralSystemOutput);
        return divide(res,gcd(num1,num2,NumeralSystemInput,NumeralSystemOutput),NumeralSystemInput,NumeralSystemOutput);
    }
}
