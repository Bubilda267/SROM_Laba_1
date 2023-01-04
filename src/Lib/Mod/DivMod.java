package Lib.Mod;

import static Lib.Division.divide;
import static Lib.Mod.BarrettReduction.barrett;

public class DivMod {
    public static String divMod(String num1, String num2, String mod, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        String res = divide(num1, num2, NumeralSystemInput, NumeralSystemOutput);
        return barrett(res, mod, NumeralSystemInput, NumeralSystemOutput);
    }
}
