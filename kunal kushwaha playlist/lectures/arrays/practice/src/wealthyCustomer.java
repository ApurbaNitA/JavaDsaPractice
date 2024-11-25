import java.util.HashSet;

public class wealthyCustomer {

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        int maxWealth = findRichestCustomerWealth(accounts);
        System.out.println("The richest customer has wealth = " + maxWealth);
    }

    public static int findRichestCustomerWealth(int[][] accounts) {

        int maxwealth=0;
        for (int[] account : accounts) {
            int output=0;
            for (int col:account) {
                output += col;
            }
            if (output > maxwealth) {
                maxwealth = output;
            }
        }
        return maxwealth;
    }


}
