package Lib;

class ShiftBitsToHigh {
    static String ShiftBits(String num, int zeroes){
        return num + "0".repeat(Math.max(0, zeroes));
    }
}
