/*
Geek lost the password of his super locker. 
He remembers the number of digits N as well as the sum S of all the digits of his password. 
He know that his password is the largest number of N digits that can be made with given sum S. 
As he is busy doing his homework, help him retrieving his password.

Input:
N = 5, S = 12
Output:
93000
Explanation:
Sum of elements is 12. Largest possible 
5 digit number is 93000 with sum 12.

Input:
N = 3, S = 29
Output:
-1
Explanation:
There is no such three digit number 
whose sum is 29.
*/

class Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int N, int S)
    {
       if (N == 1 && S == 0) {
            return "0";
        }

        if (S == 0) {
            StringBuilder zeros = new StringBuilder();
            for (int i = 0; i < N; i++) {
                zeros.append(0);
            }
            return zeros.toString();
        }

        if (S > 9 * N) {
            return "-1"; // No password possible
        }

        StringBuilder password = new StringBuilder();

        // Add the largest possible digit (9) as long as the sum is greater than 9
        while (S > 9) {
            password.append(9);
            S -= 9;
            N--;
        }

        // Add the remaining sum as a single digit
        if (S > 0) {
            password.append(S);
            N--;
        }

        // Fill the remaining digits with zeros
        for (int i = 0; i < N; i++) {
            password.append(0);
        }

        return password.toString();
    }
}
