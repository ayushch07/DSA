// Count Number of Binary Strings
// Medium
// Difficulty
// 84
// Submissions
// 100
// Max Points
// Status: Accepted

// 100/100 Points
// Problem
// Submissions
// Leaderboard
// Discuss
// You are provided an integers N. You need to count all possible distinct binary strings of length N such that there are no consecutive 1’s.

// Input Format
// First line contains integer t which is number of test case. For each test case, it contains an integer n which is the the length of Binary String.

// Constraints
// 1<=t<=100 1<=n<=90

// Output will in be Long

// Output Format
// Print the number of all possible binary strings.

// Sample Input
// 2
// 2
// 3
// Sample Output
// 3
// 5
// Explanation
// 1st test case : 00, 01, 10 2nd test case : 000, 001, 010, 100, 101



// //  Provide Custom Input
// // Compile and Test Submit Code
// // 2
// // 2
// // 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] dynamic = new long[n + 1];

              dynamic[1] = 2;
            dynamic[2] = 3;

            for (int i = 3; i <= n; i++) {
                    dynamic[i] = dynamic[i - 1] + dynamic[i - 2];
            }

            System.out.println(dynamic[n]);
        }
    }
}

