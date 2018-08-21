package day31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedWordTest {

    @Test
    void repeatedWordShortString() {
        String test = "Once upon a time, there was a brave princess who...";
        String expected = "a";
        String result = RepeatedWord.repeatedWord(test);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void repeatedWordLongString() {
        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String expected = "it";
        String result = RepeatedWord.repeatedWord(test);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void emptyString() {
        String test = "";
        String expected = "No duplicates found";
        String result = RepeatedWord.repeatedWord(test);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void extraSpaces() {
        String test = "Once upon  a time, there was  a brave princess who...";
        String expected = "a";
        String result = RepeatedWord.repeatedWord(test);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }
}