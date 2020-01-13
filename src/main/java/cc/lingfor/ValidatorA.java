package cc.lingfor;

public class ValidatorA {
    
    public Boolean isInteger(String input) {
        if(input.isEmpty()) return false;
        for(int i = 0; i < input.length(); i++) {
            if(i == 0 && input.charAt(i) == '-') {
                if(input.length() == 1) return false;
                else continue;
            }
            if(Character.digit(input.charAt(i),10) < 0) return false;
        }
        return true;
    }
}
