package pl.coderslab.bvariablesandoperators;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main01Test {

    @Test
    public void testIntegerVariableDeclarationAndAssignment() {
        int number = 42;
        assertEquals(42, number);
        
        number = 100;
        assertEquals(100, number);
    }

    @Test
    public void testDoubleVariableDeclarationAndAssignment() {
        double decimal = 3.14;
        assertEquals(3.14, decimal, 0.001);
        
        decimal = 2.718;
        assertEquals(2.718, decimal, 0.001);
    }

    @Test
    public void testStringVariableDeclarationAndAssignment() {
        String text = "Hello";
        assertNotNull(text);
        assertEquals("Hello", text);
        
        text = "World";
        assertEquals("World", text);
        
        String emptyText = "";
        assertNotNull(emptyText);
        assertTrue(emptyText.isEmpty());
    }

    @Test
    public void testBooleanVariableDeclarationAndAssignment() {
        boolean flag = true;
        assertTrue(flag);
        
        flag = false;
        assertFalse(flag);
        
        boolean anotherFlag = false;
        assertFalse(anotherFlag);
    }
}

