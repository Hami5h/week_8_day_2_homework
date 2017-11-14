package com.example.hamishstewart.wordcounter.Model;

/**
 * Created by hamishstewart on 13/11/2017.
 */

public class Counter {

//    method can be static as there are no instance variables and the class
//    does not need to be instatiated.
    public static int getWordCount(String sentence) {
        if(sentence == null || sentence.isEmpty()) {
            return 0;
        }
        return sentence.split(" ").length;
    }

//    Codeclan homework solution code below
//    public int getCount(String text) {
//        String[] wordArray = text.toLowerCase().split(" ");
//        return wordArray.length;
//    }

}
