/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void test_ronSwanson(){
        App test = new App();
        String exp = test.ronSwansonQuote();
        assertNotNull("There is something in here",exp);
    }
}
