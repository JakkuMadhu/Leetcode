class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Use long to prevent overflow during absolute conversion
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;

        // Bit shifting from 31 to 0
        for (int i = 31; i >= 0; i--) {
            if ((dvd >> i) >= dvs) {
                dvd -= dvs << i;
                result += 1 << i;
            }
        }

        // Apply sign
        return (dividend > 0) == (divisor > 0) ? result : -result;
    }
}
