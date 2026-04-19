import java.util.*;

public class MagicSquareCombinations {

    // Define the Subirachs Magic Square. 4x4 squares are recommended, but it also works for 2x2, 3x3, 5x5, and so on
    static int[][] square = {
            {1, 14, 14, 4},
            {11, 7, 6, 9},
            {8, 10, 10, 5},
            {13, 2, 3, 15}
    };

    // Flatten the square into a 1D array for easier subset enumeration
    static int[] flattenSquare() {
        int rows = square.length, cols = square[0].length;
        int[] flat = new int[rows * cols];
        int idx = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                flat[idx++] = square[i][j];
        return flat;
    }

    public static void main(String[] args) {
        int[] cells = flattenSquare();
        int nCells = cells.length;

        // Assume the magic constant is the sum of the first row (for a standard magic square, e.g., 16+3+2+13 = 34)
        int magicSum = 0;
        for (int j = 0; j < square[0].length; j++) {
            magicSum += square[0][j];
        }
        System.out.println("Magic constant: " + magicSum);

        // Maps to count combinations for each sum
        Map<Integer, Integer> sumCountsAll = new HashMap<>();
        int count4Element = 0; // Count only 4-element subsets with sum == magicSum

        // Iterate over all possible subsets (from 0 to 2^(nCells)-1)
        int totalSubsets = 1 << nCells; // 2^nCells
        for (int mask = 0; mask < totalSubsets; mask++) {
            int subsetSum = 0;
            int elementCount = 0;
            // Check each bit of the mask
            for (int i = 0; i < nCells; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsetSum += cells[i];
                    elementCount++;
                }
            }
            // Count for all combinations by sum
            sumCountsAll.put(subsetSum, sumCountsAll.getOrDefault(subsetSum, 0) + 1);

            // Count 4-element subsets with sum == magicSum
            if (elementCount == 4 && subsetSum == magicSum) {
                count4Element++;
            }
        }

        System.out.println("Number of 4-element combinations with sum " + magicSum + ": " + count4Element);

        // Counts ALL combinations with sum == magicSum.
        int countAllMagic = sumCountsAll.getOrDefault(magicSum, 0);
        System.out.println("Number of ALL-element combinations with sum " + magicSum + ": " + countAllMagic);

        // Determine the sum that can be formed in the greatest number of ways
        int maxSum = -1;
        int maxCount = -1;
        for (Map.Entry<Integer, Integer> entry : sumCountsAll.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxSum = entry.getKey();
            }
        }
        System.out.println("The sum that can be formed in the greatest number of ways is " + maxSum + " with " + maxCount + " combinations.");

        // Fun fact/extra credit section
        System.out.println("\nFun fact:\n" +
                "The magic square is used to merge art and math by ensuring that every row, column, diagonal, corner,\n" +
                "and even subsections/subregions that sum to the same constant, giving cosmic balance to this puzzle.\n" +
                "Subirach's artistic vision shows the unity and interconnectivity between these numbers which created\n" +
                "inspirations of mathematical inquiry and creative interpretations due to its mystical, subtle design\n");
        System.out.println("Also fun fact!\n" +
                "All lines in the fun fact including spaces, have the same character count! Coincidence? I think not!");
    }
}
