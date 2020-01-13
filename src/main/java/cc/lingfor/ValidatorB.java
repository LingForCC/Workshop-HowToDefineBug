package cc.lingfor;

public class ValidatorB {
    
    public Boolean isInteger(String input) {
        try
        {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
