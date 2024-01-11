package Comparator_Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class sort2d{
    public static void main(String[] args) {
        int[][] arr = {
            {3, 1, 4},
            {1, 2, 8},
            {2, 3, 6},
            {4, 4, 2}
        };

        int sortByColumn = 0; // Column to sort by (0-based index)

        // Use a custom comparator to sort by the specified column
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[sortByColumn], b[sortByColumn]);
            }
        });

        // Print the sorted 2D array
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

