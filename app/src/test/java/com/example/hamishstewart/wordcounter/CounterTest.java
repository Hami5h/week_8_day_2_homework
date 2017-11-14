package com.example.hamishstewart.wordcounter;

import com.example.hamishstewart.wordcounter.Model.Counter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 13/11/2017.
 */

public class CounterTest {
    Counter counter;

    @Test
    public void getWordCount() {
        assertEquals(4, Counter.getWordCount("I want to count"));
    }



}
