public class Main {
    public static void main(String[] args) {

        //part one assignment.

    accountNumbers(49_000,2_000,10_000);
        System.out.println("\n");

    //below is part two assignment. getting method

    User user =new User("Dessalew","Akassa", "des345@gmail.com",54324);
        System.out.println("User first name: "+ user.getFirstName());
        System.out.println("user last name: " + user.getLastName());
        System.out.println("user email: " + user.getEmail());
        System.out.println("user password: " + user.getPassword());

        //using setting methods
        System.out.println("\n");

        user.setPassword(477599);

        System.out.println("User first name: "+ user.getFirstName());
        System.out.println("user last name: " + user.getLastName());
        System.out.println("user email: " + user.getEmail());
        System.out.println("user password: " + user.getPassword());
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