import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public static void main(String[] args) {
		Integer[] coins = { 1, 2, 5, 10 };
		int amount = 57;
		int n = coins.length;
		System.out.println(minCoins(coins, n, amount));
	}

	private static int minCoins(Integer[] coins, int n, int amount) {

		Arrays.sort(coins, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		int res = 0;
		for (int i = 0; i < n; i++) {
			if (coins[i] <= amount) {
				int c = (int) Math.floor(amount / coins[i]);
				res = res + c;
				amount = amount - c * coins[i];
			}
			if (amount == 0) {
				break;
			}
		}

		return res;
	}
}
