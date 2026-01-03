package pl.pcemekm.webBook.tasks;

import org.junit.jupiter.api.Test;

import pl.pcemekm.webBook.tasks.TableIntMultiply;

import static org.junit.jupiter.api.Assertions.*;


public class TableIntMultiplyTest {

    int[] i = {1,2,3,4};
    @Test
    void testTableMultiply(){
        int[] input = {1,2,3,4};
        int[] correctResult =  {24,12,8,6};
        assertArrayEquals(correctResult,TableIntMultiply.test(input));

    }
}
