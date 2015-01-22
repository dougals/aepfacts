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

    @Test
    public void processSquareAndCube(){
        String result = new QueryProcessor().process("acd405a0: which of the following numbers is both a square and a cube: 309, 4096");
        assertNotNull(result);
        assertThat(result, is("4096") );
    }

    @Test
    public void processSquareAndCube2(){
        String result = new QueryProcessor().process("acd405a0: which of the following numbers is both a square and a cube: 4096, 309");
        assertNotNull(result);
        assertThat(result, is("4096") );
    }

    @Test
    public void processPrime(){
        String result = new QueryProcessor().process("9691e710: which of the following numbers are primes: 113, 165");
        assertNotNull(result);
        assertThat(result, is("113") );
    }
    /*
    @Test
    public void processFibonacci(){
        String result = new QueryProcessor().process("88b86c70: what is the 20th number in the Fibonacci sequence");
        assertNotNull(result);
        assertThat(result, is("113") );
    }
      */
    @Test
    public void processSubtractionRequest(){
        String result = new QueryProcessor().process("e1a3f360: what is 5 minus 15");
        assertNotNull(result);
        assertThat(result, is("-10") );
    }
    





}



