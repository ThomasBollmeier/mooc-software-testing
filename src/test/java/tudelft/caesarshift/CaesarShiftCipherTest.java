package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher cut;

    @BeforeEach
    public void setUp() {
        cut = new CaesarShiftCipher();
    }

    @Test
    public void testInvalid() {
        Assertions.assertEquals("invalid", cut.CaesarShiftCipher("ABC", 2));
    }

    @Test
    public void testPositiveShift() {
        Assertions.assertEquals("cde", cut.CaesarShiftCipher("abc", 2));
    }

    @Test
    public void testNegativeShift() {
        Assertions.assertEquals("yza", cut.CaesarShiftCipher("abc", -2));
    }

    @Test
    public void testZeroShift() {
        Assertions.assertEquals("abc", cut.CaesarShiftCipher("abc", 0));
    }

    @Test
    public void testLargeShift() {
        Assertions.assertEquals("bcd", cut.CaesarShiftCipher("abc", 53));
    }

}
