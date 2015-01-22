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
        String result = new QueryProcessor().process("87500d90: what is 9 plus 11");
        assertNotNull(result);
        assertThat(result, is("20") );
    }

    @Test
    public void processGreaterRequest(){
        String result = new QueryProcessor().process("986f2de0: which of the following numbers is the largest: 100, 13");
        assertNotNull(result);
        assertThat(result, is("100") );
    }

    @Test
    public void processMultiplication(){
        String result = new QueryProcessor().process("74b6ce90: what is 12 multiplied by 2");
        assertNotNull(result);
        assertThat(result, is("24") );
    }

    @Test
    public void processGreaterRequestMultiples(){
        String result = new QueryProcessor().process("7e5ceca0: which of the following numbers is the largest: 560, 70, 27, 58");
        assertNotNull(result);
        assertThat(result, is("560") );
    }




}



