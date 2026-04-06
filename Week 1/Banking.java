public class Banking {
    public static void main(String[] args) {

        //Variables
        String name = "Seann";
        String lastname = "Burke";
        String date = "03 of March 2026";

        double startingBalance = 100.10;
        double transactionN = 200.0;
        String transactionDescription = "Moderate Deposit";

        double total = startingBalance + transactionN;

        System.out.println("---------------------------------\r\n" +
                           "|       COMMONWEALTH BANK       |\r\n" + 
                           "---------------------------------");

        // Inital value in the bank
        System.out.println("Date: " + date);
        System.out.println("Welcome back, " + name + " " + lastname + ".");
        System.out.println("Money: $" + startingBalance);

        // Updated value in the bank after "small deposit"
        System.out.println(transactionDescription + " of $" + transactionN);
        System.out.println("Updated Money $" + total);


    }
}
