package Lib.Mod;

import static Lib.Mod.BarrettReduction.barrett;
import static Lib.Subtraction.subtract;

public class SubMod {
    public static String subMod(String num1, String num2, String mod, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        String res = subtract(num1, num2, NumeralSystemInput, NumeralSystemOutput);
        return barrett(res, mod, NumeralSystemInput, NumeralSystemOutput);
    }
}
