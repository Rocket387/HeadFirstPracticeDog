package org.example;

public class TestStuff {

    static void go() {
        TestStuff t = new TestStuff();
        t.takeTwo(12, 34);

        TestStuff t2 = new TestStuff();
        t2.takeTwo(78, 99);
    }

    static Object takeTwo(int x, int y) {
        int z = x + y;
        System.out.println("Total is " + z);
        return z;
    }

    public static void main (String[] args) {
        go();
    }
}
