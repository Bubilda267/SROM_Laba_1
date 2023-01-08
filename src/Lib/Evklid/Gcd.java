package Lib.Evklid;

import static Lib.Division.divide;
import static Lib.Multiplication.multiply;
import static Lib.Converter.*;
import static Lib.Comparing.compare;
import static Lib.Subtraction.subtract;

public class Gcd {
    static public String gcd(String num1, String num2, int NumeralSystemInput, int NumeralSystemOutput) throws Exception {
        switch (NumeralSystemInput) {
            case 2 -> {
                num1 = BinToDec(num1);
                num2 = BinToDec(num2);
            }
            case 10 -> {

            }
            case 16 -> {
                num1 = HexToDec(num1);
                num2 = HexToDec(num2);
            }
            default -> throw new Exception("Wrong Numeral System");
        }
        String temp;
        String d = "1";
        while (Integer.parseInt(String.valueOf(num1.charAt(num1.length()-1))) % 2 == 0 &&
                Integer.parseInt(String.valueOf(num2.charAt(num2.length()-1))) % 2 == 0){
            num1 = divide(num1, "2", 10, 10);
            num2 = divide(num2, "2", 10, 10);
            d = multiply(d,"2", NumeralSystemInput, NumeralSystemInput);
        }
        while (Integer.parseInt(String.valueOf(num1.charAt(num1.length()-1))) % 2 == 0){
            num1 = divide(num1, "2", 10, 10);
        }
        while(!num2.equals("0")){
            while (Integer.parseInt(String.valueOf(num2.charAt(num2.length()-1))) % 2 == 0){
                num2 = divide(num2, "2", 10,10);
            }
            temp = num1;
            num1 = min(num1,num2);
            if(compare(temp, num2) == 1){
                num2 = subtract(temp, num2, 10,10);
            }
            else{
                num2 = subtract(num2,temp,10,10);
            }
        }
        switch (NumeralSystemOutput) {
            case 2 -> {
                num1 = DecToBin(num1);
            }
            case 10 -> {

            }
            case 16 -> {
                num1 = DecToHex(num1);
            }
            default -> throw new Exception("Wrong Numeral System");
        }
        return multiply(d,num1, NumeralSystemInput, NumeralSystemOutput);
    }

    static private String min(String num1, String num2){
        if(compare(num1,num2) == 1){
            return num2;
        }
        return num1;
    }
}
