import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {

    GradeConverter converter = new GradeConverter();

    @Before
    public void setUp() throws Exception {//
    }

    @Test
    public void convert() {
    }

    @Test
    public void testConverter1()
    {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter2()
    {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }
}