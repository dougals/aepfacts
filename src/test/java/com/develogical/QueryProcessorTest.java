package com.develogical;

import org.junit.Test;

import java.util.Map;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class QueryProcessorTest {


    @Test
    public void returnsEmptyStringForUnknownQueries() {
        String result = new QueryProcessor().process("unknown");
        assertNotNull(result);
        assertThat(result, is(""));
    }
    @Test
    public void handleWhatIsYourNameQuery(){
        String result = new QueryProcessor().process("slkjlk:what is your name");
        assertNotNull(result);
        assertThat(result, is("MedhaDaveMike"));
    }

    @Test
    public void processAdditionRequest(){
        String result = new QueryProcessor().process("slkjlk:what is 7 plus 9");
        assertNotNull(result);
        assertThat(result, is("16") );
    }

    @Test
    public void processGreaterRequest(){
        String result = new QueryProcessor().process("api?q=986f2de0: which of the following numbers is the largest: 100, 13");
        assertNotNull(result);
        assertThat(result, is("100") );
    }
}



