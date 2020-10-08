package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.BeforeClass;

public class TestMaximumTest {
    @BeforeClass
    public static void beforeClass() {
        TestMaximum testMaximum = new TestMaximum();
        boolean welcomeMessage = testMaximum.printWelcomeMessage();
        Assert.assertTrue(welcomeMessage);
    }
}
