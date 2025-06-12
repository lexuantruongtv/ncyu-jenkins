import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeConverterTest {

    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void Convert() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    @Test
    public void Convert2() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }

    // A: 90–100
    @Test
    public void testGradeA_LowerBound() {
        assertEquals("A", converter.convert(90));
    }

    @Test
    public void testGradeA_UpperBound() {
        assertEquals("A", converter.convert(100));
    }

    @Test
    public void testGradeA_Mid() {
        assertEquals("A", converter.convert(95));
    }

    // B: 80–89
    @Test
    public void testGradeB_LowerBound() {
        assertEquals("B", converter.convert(80));
    }

    @Test
    public void testGradeB_UpperBound() {
        assertEquals("B", converter.convert(89));
    }

    // C: 70–79
    @Test
    public void testGradeC_LowerBound() {
        assertEquals("C", converter.convert(70));
    }

    @Test
    public void testGradeC_UpperBound() {
        assertEquals("C", converter.convert(79));
    }

    // D: 60–69
    @Test
    public void testGradeD_LowerBound() {
        assertEquals("D", converter.convert(60));
    }

    @Test
    public void testGradeD_UpperBound() {
        assertEquals("D", converter.convert(69));
    }

    // E: 0–59
    @Test
    public void testGradeE_LowerBound() {
        assertEquals("E", converter.convert(0));
    }

    @Test
    public void testGradeE_UpperBound() {
        assertEquals("E", converter.convert(59));
    }

    // Invalid cases
    @Test
    public void testInvalid_Negative() {
        assertEquals("Invalid", converter.convert(-1));
    }

    @Test
    public void testInvalid_Above100() {
        assertEquals("Invalid", converter.convert(101));
    }

    @Test
    public void testInvalid_HighExtreme() {
        assertEquals("Invalid", converter.convert(Integer.MAX_VALUE));
    }

    @Test
    public void testInvalid_LowExtreme() {
        assertEquals("Invalid", converter.convert(Integer.MIN_VALUE));
    }

    @Test
    public void testConvert8() {
        assertEquals("Invalid", converter.convert(-10));
    }
}
