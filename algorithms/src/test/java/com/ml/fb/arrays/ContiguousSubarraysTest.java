package com.ml.fb.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContiguousSubarraysTest {

    @Test
    public void test1(){
        int[] result = ContiguousSubarrays.countSubarrays(new int[] {3, 4, 1, 6, 2});
        int[] expectedResult = new int[] {1, 3, 1, 5, 1};
        assertTrue(expectedResult.length == result.length);

        for(int i = 0; i < expectedResult.length; i++){
            assertTrue(expectedResult[i] == result[i]);
        }
    }
}
