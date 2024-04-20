import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Item[] input = new Item[3];
        input[0] = new Item(50, 600);
        input[1] = new Item(20, 500);
        input[2] = new Item(30, 400);
        int w = 70;
        System.out.println(fractionalKnapsack(input, w));
    }

    static double fractionalKnapsack(Item[] arr, int w) {
        Arrays.sort(arr);
        double res = 0.0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].weight <= w) {
                w -= arr[i].weight;
                res += arr[i].value;
            } else {
                res += w * arr[i].ratio;
                return res;
            }
        }

        return res;
    }

    static class Item implements Comparable<Item> {
        int weight;
        int value;
        double ratio;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / (double) weight;
        }

        public int compareTo(Item i) {
            return (int) i.ratio - (int) this.ratio;
        }
    }
}