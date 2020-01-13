package cc.lingfor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidatorTestB {

    private final ValidatorB validator = new ValidatorB();

    @Test
    public void shouldReturnTrueIfPositiveInteger() {
        Boolean result = validator.isInteger("123");
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnTrueIfNegativeInteger() {
        Boolean result = validator.isInteger("-123");
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnTrueIfZero() {
        Boolean result = validator.isInteger("0");
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfDigitAndCharacter() {
        Boolean result = validator.isInteger("a1b2");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfSpecialCharacter() {
        Boolean result = validator.isInteger("123%/");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfDot() {
        Boolean result = validator.isInteger("123.45");
        assertEquals(false, result);
    }

 
}