package Lib;

class ShiftBitsToHigh {
    static String ShiftBits(String temp, int zeroes){
        return temp + "0".repeat(Math.max(0, zeroes));
    }
}
