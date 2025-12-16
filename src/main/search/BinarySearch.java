package search;

public class BinarySearch {

    public static boolean search (int[] values, int needle) {

        if (values == null || values.length == 0) {
            return false;
        }

        int low = 0;
        int high = values.length;

        do {

            int middle = low + Math.floorDiv(high - low, 2);
            int currValue = values[middle];

            if (currValue == needle) {
                return true;
            } else if (currValue > needle) {
                high = middle;
            } else {
                low = middle + 1;
            }

        } while (low < high);

        return false;

    }

}
