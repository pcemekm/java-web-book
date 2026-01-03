package pl.pcemekm.webBook.tasks;

import org.junit.jupiter.api.Test;

import pl.pcemekm.webBook.tasks.StringReverser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {
    @Test
    void reverseTest(){

        String input = "1234";
        String correctAnswer = "4321";

        String result = StringReverser.reverse(input);

        assertEquals(result,correctAnswer);
    }
}
