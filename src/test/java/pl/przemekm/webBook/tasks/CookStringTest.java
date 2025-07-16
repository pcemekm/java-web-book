package pl.przemekm.webBook.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CookStringTest {

    @Test
    void addString(){
        String a = "Przemek";

        String b = "M";

        String result = CookString.add(a,b);


        assertEquals(a+b,result,"Adding string bug");
    }
}
