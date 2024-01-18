package programmers.kit.greedy.cloth;
import java.util.Arrays;

public class GreedyCoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25, 50, 100, 500, 1000, 1500, 10000};
        int amount = 15216;

        int minCoins = minCoinsForChange(coins, amount);
        System.out.println("Minimum number of coins needed: " + minCoins);
    }

    public static int minCoinsForChange(int[] coins, int amount) {
        Arrays.sort(coins); // 동전 단위를 정렬

        int numCoins = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                numCoins++;
            }
        }

        return numCoins;
    }
}
