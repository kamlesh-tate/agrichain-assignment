
package com.example.problem2.kt.test;

import com.example.problem2.kt.base.BaseTest;
import com.example.problem2.kt.pages.InputPage;
import com.example.problem2.kt.pages.ResultPage;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class InputValidationTest extends BaseTest {

    @Test
    void validAlphanumericShowsCorrectLength() {
        InputPage input = new InputPage(driver);
        input.enterString("abcabcbb");
        input.clickSubmit();   // <-- this click() causes the browser to navigate to /qa/resul url

        // after navigation
        ResultPage result = new ResultPage(driver);
        String output = result.getOutput();
        assertEquals("3", output,
                "Longest‐substring length for 'abcabcbb' should be 3");
    }
}
