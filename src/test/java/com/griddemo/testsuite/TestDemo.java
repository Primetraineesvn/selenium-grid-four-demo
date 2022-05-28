package com.griddemo.testsuite;

import com.griddemo.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestDemo extends TestBase {

    @Test
    public void testOne() throws InterruptedException {
        System.out.println("Page title is: " + driver.getTitle());
        Thread.sleep(5000);
    }
}
