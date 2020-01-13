package cc.lingfor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidatorTest {

    private final Validator validator = new Validator();

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
    public void shouldReturnFalseIfLeadingZero() {
        Boolean result = validator.isInteger("00123");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfSpecialCharacter() {
        Boolean result = validator.isInteger("123%/");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseWithTrueString() {
        Boolean result = validator.isInteger("true");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseWithFalseString() {
        Boolean result = validator.isInteger("false");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfExceedingPositiveMaximum() {
        Boolean result = validator.isInteger("999999999999999999999999999999999");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfExceedingNegativeMaximum() {
        Boolean result = validator.isInteger("-999999999999999999999999999999999");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfBlank() {
        Boolean result = validator.isInteger(" ");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfHaveMiddleBlank() {
        Boolean result = validator.isInteger("123 456");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfHaveLeadingBlank() {
        Boolean result = validator.isInteger("  123456");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfHaveTrailingBlank() {
        Boolean result = validator.isInteger("123456   ");
        assertEquals(false, result);
    }

    @Test
    public void shouldReturnFalseIfDot() {
        Boolean result = validator.isInteger("123.45");
        assertEquals(false, result);
    }
}