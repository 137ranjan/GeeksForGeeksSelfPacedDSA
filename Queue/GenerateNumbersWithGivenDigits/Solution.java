package GenerateNumbersWithGivenDigits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String item1 = st.nextToken();
        String item2 = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        printFixN(n, item1, item2);
    }

    private static void printFixN(int n, String item1, String item2) {
        Queue<String> q = new LinkedList<>();
        q.add(item1);
        q.add(item2);
        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            System.out.println(curr);
            q.add(curr + item1);
            q.add(curr + item2);
        }
    }
}
