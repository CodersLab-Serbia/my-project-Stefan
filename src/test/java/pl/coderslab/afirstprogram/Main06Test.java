package pl.coderslab.afirstprogram;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class Main06Test {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void shouldPrintHelloWorld() {
        // This test will fail until the code is uncommented and fixed
        Main06.main(null);
        assertEquals("Hello world" + System.lineSeparator(), systemOutRule.getLog());
    }
}

