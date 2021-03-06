import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }

    @Test
    public void testSolution() {
        String inputText = "Cat";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "taC";

        assertEquals(String.format("For the text %s, the program should write to the console: %s.", inputText, expected), expected, outContent.toString().trim());
    }

    @Test
    public void testSolution2() {
        String inputText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = ".auqila angam erolod te erobal tu tnudidicni ropmet domsuie od des ,tile gnicsipida rutetcesnoc ,tema tis rolod muspi meroL";

        assertEquals(String.format("For the text %s, the program should write to the console: %s.", inputText, expected), expected, outContent.toString().trim());
    }

}