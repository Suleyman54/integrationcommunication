package nl.hu.intergrationcummunication1;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class Test2 {

    @Test
    public void test2Succes() {
        int a = 2;
        int b = 10;
        assertTrue(a + b == 12);
    }

    @Test
    public void test2Fail() {
        int a = 2;
        int b = 10;
        assertTrue(a + b == 50);

    }
}
