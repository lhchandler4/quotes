package quotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {
    @Test
    public void test_randomQuote(){
        App test = new App();
        Quote  exp = test.randomQuote();
        assertNotNull("There is something in here",exp);
    }

    @Test
    public void test_Quote(){
       Quote classUnderTest = new Quote("Bernard","NO PBR NO BAR","123");
       assertEquals("Bernard wrote, NO PBR NO BAR The quote got 123",classUnderTest.toString());
    }

    @Test
    public void test_Quote_get_Auther(){
        Quote classUnderTest = new Quote("Bernard","NO PBR NO BAR","123");
        assertEquals("Bernard",classUnderTest.getAuthor());
    }

    @Test
    public void test_Quote_get_text(){
        Quote classUnderTest = new Quote("Bernard","NO PBR NO BAR","123");
        assertEquals("NO PBR NO BAR",classUnderTest.getText());
    }
}
