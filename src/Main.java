public class Main {
    public static void main(String[] args) {

    accountNumbers(49_000,2_000,10_000);

    }

    public static double accountNumbers (double x, double y, double z) {

        int savingsAccountBalance = 6_000;
        int indexFundBalance = 2_000;
        int depositAmount = 10_000;
        int newBalance = savingsAccountBalance + depositAmount;

        if (savingsAccountBalance < 50_000 ) {
         int accountUpdated1 = savingsAccountBalance + depositAmount;
            System.out.println("savings account updated.New balance: $"+ accountUpdated1);
        } else {
            int accountUpdated2 = indexFundBalance + depositAmount;
            System.out.println("index Fund Balance updated.New balance: $" + accountUpdated2);
        }
        return newBalance;
    }
}