import java.util.Arrays;

public class temp2 {

    static int solveMem(int[] nums, int n, int[] dp) {

        // Base Case
        if (n < 0)
            return 0;

        if (n == 0)
            return nums[0];

        // Already calculated
        if (dp[n] != -1)
            return dp[n];

        int incl = solveMem(nums, n - 2, dp) + nums[n];
        int excl = solveMem(nums, n - 1, dp);

        dp[n] = Math.max(incl, excl);

        return dp[n];
    }



    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 11, 2};
        int n = arr.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int ans=solveMem(arr, n - 1, dp);
        System.out.println(ans);
    }
}