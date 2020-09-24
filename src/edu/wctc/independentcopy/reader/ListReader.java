package edu.wctc.independentcopy.reader;

import java.util.ArrayList;

public class ListReader implements Reader{

    @Override
    public String readln() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Stuff");
        words.add("And");
        words.add("Things");

        String listOfWords = words.get(0) + words.get(1) + words.get(2);

        return listOfWords;
    }
}
