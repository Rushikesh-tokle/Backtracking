public class OptimizedGrid {
    // Function to calculate grid paths using combinations formula
    public static long gridWays(int n, int m) {
        return combination(n + m, n);
    }

    // Helper function to calculate combinations (nCr)
    private static long combination(int n, int r) {
        if (r > n - r) r = n - r; // Use symmetry property
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println("Number of paths in the grid: " + gridWays(n, m));
    }
}
