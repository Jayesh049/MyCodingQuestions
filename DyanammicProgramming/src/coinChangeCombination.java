import java.util.Arrays;

public class coinChangeCombination {

        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];

            Arrays.fill(dp , amount + 1);
            dp[0] = 1;

            for (int coin : coins) {

                for (int t = coin; t <= amount; t++) {

                    if (t - coin >= 0)
                        dp[t] += dp[t - coin];
                }
            }


            return dp[amount] <= amount ?
                    dp[amount] : -1;
        }
    }
