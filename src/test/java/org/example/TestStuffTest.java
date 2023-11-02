package org.example;

import junit.framework.TestCase;

public class TestStuffTest extends TestCase {

    public void testGo() {
        TestStuff g1 = new TestStuff();
    }

    public void testTakeTwo() {
        TestStuff t1 = new TestStuff();

        assertEquals(46, t1.takeTwo(12, 34));

    }
}