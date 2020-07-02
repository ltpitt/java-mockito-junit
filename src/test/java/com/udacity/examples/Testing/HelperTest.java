package com.udacity.examples.Testing;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class HelperTest {

    @Test
    public void test() {
        assertEquals(4, 4);
    }

    @Test
    public void compare_arrays() {
        int[] yrs = {10, 14, 2};
        int[] expectedYrs = {10, 14, 2};
        assertArrayEquals(expectedYrs, yrs);
    }

    @Test
    public void validate_getCount() {
        List<String> namesList = Arrays.asList("Davide", "Saluti");
        final long actual = Helper.getCount(namesList);
        assertEquals(2, actual);
    }

    @Test
    public void validate_getStats() {
        List<Integer> yrsOfExperience = Arrays.asList(13, 4, 15, 6, 17, 8, 19, 1, 2, 3);
        List<Integer> expectedList = Arrays.asList(13, 4, 15, 6, 17, 8, 19, 1, 2, 3);
        final IntSummaryStatistics actual = Helper.getStats(yrsOfExperience);
        assertEquals(19, actual.getMax());
        assertEquals(expectedList, yrsOfExperience);
    }

    @Test
    public void validate_getStringsOfLength3() {
        assertEquals(1, Helper.getStringsOfLength3(Arrays.asList("Name1", "", "Name2", "", "Nam")));
    }

    @Test
    public void validate_getSquareList() {
        List<Integer> expectedList = Arrays.asList(1,4,9,16,25);
        final List<Integer> actualList = Helper.getSquareList(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expectedList, actualList);
    }

    @Test
    public void validate_getMergedList() {
        assertEquals("Name1, Name2, Name3", Helper.getMergedList(Arrays.asList("Name1", "", "Name2", "", "Name3")));
    }

    @BeforeClass
    public static void setup() {
        System.out.println("Runs before each class");

    }

    @Before
    public void init() {
        System.out.println("Runs before each test method");

    }

    @AfterClass
    public static void teardown() {
        System.out.println("Runs after each class");
    }

    @After
    public void initEnd() {
        System.out.println("Runs after every method");
    }
    //@Ignore skips a test in case it is needed

}
