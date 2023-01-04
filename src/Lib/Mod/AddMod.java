package Lib.Mod;

import static Lib.Addition.add;
import static Lib.Mod.BarrettReduction.barrett;


public class AddMod {
    public static String addMod(String num1, String num2, String mod, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        String res = add(num1, num2, NumeralSystemInput, NumeralSystemOutput);
        return barrett(res, mod, NumeralSystemInput, NumeralSystemOutput);
    }
}
