// Q-Nishant is a very naughty boy in Launchpad Batch. One day he was playing with strings, and randomly shuffled them all. Your task is to help Nishant Sort all the strings ( lexicographically ) but if a string is present completely as a prefix in another string, then string with longer length should come first. Eg bat, batman are 2 strings and the string bat is present as a prefix in Batman - then sorted order should have - Batman, bat.

// Input Format
// N(integer) followed by N strings.

// Constraints
// N<=1000

// Output Format
// N lines each containing one string.

// Sample Input
// 3
// bat
// apple
// batman
// Sample Output
// apple
// batman
// bat
// Explanation
// In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical order or lexicographic(al) product) is a generalization of the way words are alphabetically ordered based on the alphabetical order of their component letters.



package Comparator_Comparable;
import java.util.*;

public class StringSOrt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            strings.add(str);
        }

        // Sort the strings using a custom comparator
        Collections.sort(strings, new CustomComparator());

        // Print the sorted strings
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }

    static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // First, compare by length in descending order
            int cmp = Integer.compare(s2.length(), s1.length());

            if (cmp == 0) {
                // If lengths are the same, compare lexicographically
                return s1.compareTo(s2);
            }

            // If s1 is a prefix of s2, s2 comes first
            if (s2.startsWith(s1)) {
                return 1;
            }

            // If s2 is a prefix of s1, s1 comes first
            if (s1.startsWith(s2)) {
                return -1;
            }

            // If neither is a prefix of the other, just compare lexicographically
            return s1.compareTo(s2);
        }
    }
}
