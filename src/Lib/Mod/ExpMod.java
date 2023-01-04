package Lib.Mod;

import static Lib.Exponentiation.exponentiate;
import static Lib.Mod.BarrettReduction.barrett;

public class ExpMod {
    public static String expMod(String num1, String num2, String mod, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        String res = exponentiate(num1, num2, NumeralSystemInput, NumeralSystemOutput);
        return barrett(res, mod, NumeralSystemInput, NumeralSystemOutput);
    }
}
