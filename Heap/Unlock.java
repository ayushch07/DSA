// Q-Shekhar is a bomb defusal specialist. He once encountered a bomb that can be defused only by a secret code. He is given a number N and a number K. And he is also given permutation of first N natural numbers . The defusal code is the largest permutation possible by doing atmost K swaps among a pair of the given permutation. Help him to find the final permutation.

// Input Format
// First line contains ​an integer N and an integer k. The next line contains N space separated integers denoting the given permutation.

// Constraints
// 1 <= n <= 10^5
// 1<= K <= 10^9

// Output Format
// The final permutation of the numbers with every number separated by a space with other number.

// Sample Input
// 5 2
// 3 4 1 2 5
// Sample Output
// 5 4 3 2 1
// Explanation
// First we can swap 5 with 3 which gives us 5 4 1 2 3 and then we can swap 3 and 1 which gives us 5 4 3 2 1
import java.util.*;
public class Unlock {
    public static void main(String args[]) {
	          Scanner sc=new Scanner(System.in);
			  int n=sc.nextInt();
			  int k=sc.nextInt();
			  int arr[]=new int[n];
			  for(int i=0;i<n;i++)
			  arr[i]=sc.nextInt();
	 Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], i);
        }
        for (int i = 0; i < n && k > 0; i++) {
            // If the current element is already in its correct position, skip it
            if (arr[i] == n - i) {
                continue;
            }

            // Otherwise, swap the current element with the largest available element
            int cvv = arr[i];
            int lvv = n - i;
            int cindex = i;
            int largeIndex = mp.get(lvv);

            // Update the index map
            mp.put(cvv, largeIndex);
            mp.put(lvv, cindex);

            // Swap the elements
            arr[i] = lvv;
            arr[largeIndex] = cvv;

            k--;
        }

        // Print the final arr
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

	

    }
}