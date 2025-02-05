package pl.coderslab.afirstprogram;

import pl.coderslab.afirstprogram.Main03;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.assertEquals;

public class Main03Test {

    private static final String EXPECTED_OUTPUT = "Today I am starting" + System.lineSeparator() +
            "TESTER course" + System.lineSeparator() +
            "in CodersLab" + System.lineSeparator();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public TestRule watchman = new TestWatcher() {
        @Override
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Before
    public void setUp() {
        systemOutRule.clearLog();
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void shouldPrintExpectedOutput() {
        Main03.main(null);
        assertEquals(EXPECTED_OUTPUT, systemOutRule.getLog());
    }

    }
