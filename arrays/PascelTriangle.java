// import java.util.*;

// public class PascelTriangle {

//     public static List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> result = new ArrayList<>();

//         for (int row = 1; row <= numRows; row++) {
//             result.add(generateRow(row));
//         }
//         return result;
//     }

//     private static List<Integer> generateRow(int n) {
//         List<Integer> row = new ArrayList<>();
//         int ans = 1;
//         row.add(1); // first element

//         for (int col = 1; col < n; col++) {
//             ans = ans * (n - col);
//             ans = ans / col;
//             row.add(ans);
//         }
//         return row;
//     }

//     public static void main(String[] args) {
//         int numRows = 5;

//         List<List<Integer>> triangle = generate(numRows);

//         // Print Pascal's Triangle
//         for (List<Integer> row : triangle) {
//             System.out.println(row);
//         }
//     }
// }

// Solution class to find the (r, c) element of Pascal's Triangle
class Solution {
    // Function to compute binomial coefficient (nCr)
    public long findPascalElement(int r, int c) {
        // Element is C(r-1, c-1)
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        // Compute C(n, k) using iterative formula
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }
}

// Main class to test the solution
public class PascelTriangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int r = 5, c = 3;
        System.out.println(sol.findPascalElement(r, c));
    }
}

