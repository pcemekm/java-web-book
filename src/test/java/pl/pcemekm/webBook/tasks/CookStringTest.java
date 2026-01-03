package pl.pcemekm.webBook.tasks;

import org.junit.jupiter.api.Test;

import pl.pcemekm.webBook.tasks.CookString;

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
