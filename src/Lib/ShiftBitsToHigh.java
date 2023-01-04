package Lib;

public class ShiftBitsToHigh {
    public static String shiftBitsToHigh(String num, int zeroes){
        return num + "0".repeat(Math.max(0, zeroes));
    }
}
