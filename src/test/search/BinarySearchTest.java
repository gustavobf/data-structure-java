package search;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void findsExistingElements() {
        int[] values = {1, 3, 5, 7, 9};
        assertTrue(BinarySearch.search(values, 5), "should find middle element");
        assertTrue(BinarySearch.search(values, 1), "should find first element");
        assertTrue(BinarySearch.search(values, 9), "should find last element");
    }

    @Test
    public void returnsFalseWhenNotFound() {
        int[] values = {1, 3, 5, 7, 9};
        assertFalse(BinarySearch.search(values, 2), "should not find missing element");
        assertFalse(BinarySearch.search(values, 10), "should not find element greater than max");
    }

    @Test
    public void handlesEmptyAndNullArrays() {
        assertFalse(BinarySearch.search(new int[] {}, 1), "empty array should not contain any element");
        assertFalse(BinarySearch.search(null, 1), "null array should return false");
    }
}
