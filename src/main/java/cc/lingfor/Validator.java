package cc.lingfor;

import java.util.regex.Pattern;

public class Validator {
    
    public Boolean isInteger(String input) {

        //approach 1
        // if(input.isEmpty()) return false;
        // for(int i = 0; i < input.length(); i++) {
        //     if(i == 0 && input.charAt(i) == '-') {
        //         if(input.length() == 1) return false;
        //         else continue;
        //     }
        //     if(Character.digit(input.charAt(i),10) < 0) return false;
        // }
        // return true;

        //approach 2
        if (Pattern.matches("^[+-]?\\d+$", input.subSequence(0, input.length()-1))) {
            return true;
        }
        return false;
        

        //approach 3
        // try
        // {
        //     Integer.parseInt(input);
        //     return true;
        // } catch (NumberFormatException e) {
        //     return false;
        // }
    }
}
