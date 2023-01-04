package Lib;

public class RemoveLeadingZeroes {
    public static String removeLeadingZeroes(String num){
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)!='0'){
                return num.substring(i);
            }
        }
        return "0";
    }
}
