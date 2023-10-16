import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class romantest {
    @Test
    public void singleDigit() {
        assertEquals(1, new roman().romanToInt("I"));
        assertEquals(5, new roman().romanToInt("V"));
        assertEquals(10, new roman().romanToInt("X"));
        assertEquals(50, new roman().romanToInt("L"));
        assertEquals(100, new roman().romanToInt("C"));
        assertEquals(500, new roman().romanToInt("D"));
        assertEquals(1000, new roman().romanToInt("M"));
    }

    @Test
    public void repetition() {
        assertEquals(2, new roman().romanToInt("II"));
        assertEquals(20, new roman().romanToInt("XX"));
        assertEquals(200, new roman().romanToInt("CC"));
    }

    @Test
    public void manyLettersInOrder() {
        assertEquals(6, new roman().romanToInt("VI"));
        assertEquals(15, new roman().romanToInt("XV"));
    }
    @Test
    public void singleLetterWithSubtractiveNotation() {
        assertEquals(4, new roman().romanToInt("IV"));
        assertEquals(9, new roman().romanToInt("IX"));
        assertEquals(40, new roman().romanToInt("XL"));
        assertEquals(90, new roman().romanToInt("XC"));
        assertEquals(400, new roman().romanToInt("CD"));
        assertEquals(900, new roman().romanToInt("CM"));
    }
    
    @Test
    public void notValid() {
        // Not valid roman numerals
        assertEquals(0, new roman().romanToInt("VV"));
        assertEquals(0, new roman().romanToInt("IIII"));
        assertEquals(0, new roman().romanToInt("XXXX"));
        assertEquals(0, new roman().romanToInt("CCCC"));
        assertEquals(0, new roman().romanToInt("DD"));
        assertEquals(0, new roman().romanToInt("LL"));
        assertEquals(0, new roman().romanToInt("VVV"));
        assertEquals(0, new roman().romanToInt("IIIV"));
        assertEquals(0, new roman().romanToInt("IM"));
        assertEquals(0, new roman().romanToInt("XD"));
    }
    @Test
    public void validAndInvalidLetters() {
        // Valid letters with an invalid one
        assertEquals(19, new roman().romanToInt("XIZ"));
        // Invalid letters
        assertEquals(0, new roman().romanToInt("Z"));
    }
    @Test
    public void startsWithI() {
        assertEquals(1, new roman().romanToInt("I"));
        assertEquals(3, new roman().romanToInt("III"));
        assertEquals(4, new roman().romanToInt("IV"));
        assertEquals(9, new roman().romanToInt("IX"));
        assertEquals(11, new roman().romanToInt("XI"));
    }
    @Test
    public void nullInput() {
        // Test behavior when null is provided as input
        assertEquals(0, new roman().romanToInt(null));
    }
    @Test
    public void withSubtractiveNotation() {
        assertEquals(14, new roman().romanToInt("XIV")); // XIV is 14 with subtractive notation
        assertEquals(44, new roman().romanToInt("XLIV")); // XLIV is 44 with subtractive notation
        assertEquals(94, new roman().romanToInt("XCIV")); // XCIV is 94 with subtractive notation
    }

    @Test
    public void withoutSubtractiveNotation() {
        assertEquals(14, new roman().romanToInt("XIIII")); // XIIII is 14 without subtractive notation
        assertEquals(44, new roman().romanToInt("XXXXIV")); // XXXXIV is 44 without subtractive notation
        assertEquals(94, new roman().romanToInt("LXXXXIV")); // LXXXXIV is 94 without subtractive notation
    }
}


