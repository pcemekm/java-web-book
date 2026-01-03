package pl.pcemekm.webBook.tasks;
import org.junit.jupiter.api.Test;

import pl.pcemekm.webBook.tasks.CookNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CookNumbersTest {

    @Test
    void testAdd(){
        int a = 5;
        int b = 6;

        int result = CookNumbers.add(a,b);

        assertEquals(11,result,"Adding bug");

    }

    @Test
    void negativeAdd(){
        assertEquals(-1, CookNumbers.add(1,-2), "AddingNegative bug");
    }

    @Test
    void addZero(){
        assertEquals(5, CookNumbers.add(5,0), "AddingZero bug");
    }
}
