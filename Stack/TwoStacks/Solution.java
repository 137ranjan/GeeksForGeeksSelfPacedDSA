package Stack.TwoStacks;

public class Solution {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        System.out.println(ts.push1(10));
        System.out.println(ts.push2(70));
        System.out.println(ts.pop1());
    }

    public static class TwoStacks {
        int[] arr;
        int cap;
        int top1;
        int top2;

        TwoStacks(int n) {
            cap = n;
            top1 = -1;
            top2 = n;
            arr = new int[n];
        }

        boolean push1(int x) {
            if (top1 < top2 - 1) {
                top1++;
                arr[top1] = x;
                return true;
            }
            return false;
        }

        boolean push2(int x) {
            if (top1 < top2 - 1) {
                top2--;
                arr[top2] = x;
                return true;
            }
            return false;
        }

        Integer pop1() {
            if (top1 >= 0) {
                int x = arr[top1];
                top1--;
                return x;
            }
            return null;
        }

        Integer pop2() {
            if (top2 < cap) {
                int x = arr[top2];
                top2++;
                return x;
            }
            return null;
        }
    }
}