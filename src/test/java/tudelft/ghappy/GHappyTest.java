package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy cut;

    @BeforeEach
    public void setUp() {
        cut = new GHappy();
    }

    @Test
    public void testGHappy() {

        Assertions.assertTrue(cut.gHappy("xxggxx"));
        Assertions.assertFalse(cut.gHappy("xxgxx"));
        Assertions.assertFalse(cut.gHappy("xxggyygxx"));

    }

    @Test
    public void startsWithG() {

        Assertions.assertTrue(cut.gHappy("ggxx"));
        Assertions.assertFalse(cut.gHappy("gxx"));

    }

}
