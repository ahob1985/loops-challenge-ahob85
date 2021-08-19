

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LoopsChallengeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LoopsChallengeTest
{
    /**
     * Default constructor for test class LoopsChallengeTest
     */
    public LoopsChallengeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void stringTimesTest() {
        assertEquals("HiHi", LoopsChallenge.stringTimes("Hi", 2));
        assertEquals("HiHiHi", LoopsChallenge.stringTimes("Hi", 3));
        assertEquals("Hi", LoopsChallenge.stringTimes("Hi", 1));
        assertEquals("", LoopsChallenge.stringTimes("Hi", 0));
        assertEquals("HiHiHiHiHi", LoopsChallenge.stringTimes("Hi", 5));
        assertEquals("Oh Boy!Oh Boy!", LoopsChallenge.stringTimes("Oh Boy!", 2));
        assertEquals("xxxx", LoopsChallenge.stringTimes("x", 4));
        assertEquals("", LoopsChallenge.stringTimes("", 4));
        assertEquals("codecode", LoopsChallenge.stringTimes("code", 2));
        assertEquals("codecodecode", LoopsChallenge.stringTimes("code", 3));
    }
    
    @Test
    public void countXXTest() {
        assertEquals(1, LoopsChallenge.countXX("abcxx"));
        assertEquals(2, LoopsChallenge.countXX("xxx"));
        assertEquals(3, LoopsChallenge.countXX("xxxx"));
        assertEquals(0, LoopsChallenge.countXX("abc"));
        assertEquals(0, LoopsChallenge.countXX("Hello there"));
        assertEquals(2, LoopsChallenge.countXX("Hexxo thxxe"));
        assertEquals(0, LoopsChallenge.countXX(""));
        assertEquals(0, LoopsChallenge.countXX("Kittens"));
        assertEquals(2, LoopsChallenge.countXX("Kittensxxx"));
    }
    
    @Test
    public void bobThereTest() {
        assertEquals(true, LoopsChallenge.bobThere("abcbob"));
        assertEquals(true, LoopsChallenge.bobThere("b9b"));
        assertEquals(false, LoopsChallenge.bobThere("bac"));
        assertEquals(true, LoopsChallenge.bobThere("bbb"));
        assertEquals(false, LoopsChallenge.bobThere("abcdefb"));
        assertEquals(true, LoopsChallenge.bobThere("123abcbcdbabxyz"));
        assertEquals(false, LoopsChallenge.bobThere("b12"));
        assertEquals(true, LoopsChallenge.bobThere("b1b"));
        assertEquals(true, LoopsChallenge.bobThere("b12b1b"));
        assertEquals(false, LoopsChallenge.bobThere("bbc"));
        assertEquals(true, LoopsChallenge.bobThere("bbb"));
        assertEquals(false, LoopsChallenge.bobThere("bb"));
        assertEquals(false, LoopsChallenge.bobThere("b"));
    }

    @Test
    public void countCodeTest() {
        assertEquals(1, LoopsChallenge.countCode("aaacodebbb"));
        assertEquals(2, LoopsChallenge.countCode("codexxcode"));
        assertEquals(2, LoopsChallenge.countCode("cozexxcope"));
        assertEquals(1, LoopsChallenge.countCode("cozfxxcope"));
        assertEquals(1, LoopsChallenge.countCode("xxcozeyycop"));
        assertEquals(0, LoopsChallenge.countCode("cozcop"));
        assertEquals(0, LoopsChallenge.countCode("abcxyz"));
        assertEquals(1, LoopsChallenge.countCode("code"));
        assertEquals(0, LoopsChallenge.countCode("ode"));
        assertEquals(0, LoopsChallenge.countCode("c"));
        assertEquals(0, LoopsChallenge.countCode(""));
        assertEquals(3, LoopsChallenge.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, LoopsChallenge.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, LoopsChallenge.countCode("coAcodeBcoleccoreDD"));
    }

    @Test
    public void xyBalanceTest() {
        assertEquals(true, LoopsChallenge.xyBalance("aaxbby"));
        assertEquals(false, LoopsChallenge.xyBalance("aaxbb"));
        assertEquals(false, LoopsChallenge.xyBalance("yaaxbb"));
        assertEquals(true, LoopsChallenge.xyBalance("yaaxbby"));
        assertEquals(true, LoopsChallenge.xyBalance("xaxxbby"));
        assertEquals(false, LoopsChallenge.xyBalance("xaxxbbyx"));
        assertEquals(true, LoopsChallenge.xyBalance("xxbxy"));
        assertEquals(false, LoopsChallenge.xyBalance("xxbx"));
        assertEquals(true, LoopsChallenge.xyBalance("bbb"));
        assertEquals(false, LoopsChallenge.xyBalance("bxbb"));
        assertEquals(true, LoopsChallenge.xyBalance("bxyb"));
        assertEquals(true, LoopsChallenge.xyBalance("xy"));
        assertEquals(true, LoopsChallenge.xyBalance("y"));
        assertEquals(false, LoopsChallenge.xyBalance("x"));
        assertEquals(true, LoopsChallenge.xyBalance(""));
        assertEquals(false, LoopsChallenge.xyBalance("yxyxyxyx"));
        assertEquals(true, LoopsChallenge.xyBalance("yxyxyxyxy"));
        assertEquals(true , LoopsChallenge.xyBalance("12xabxxydxyxyzz"));
    }
}
