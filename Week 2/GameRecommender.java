public class GameRecommender {
    public static void main(String[] args) {
        System.out.println("Enter your favorite video game genre:");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Horror");

        // Print blank line
        System.out.println();
        System.out.println("Enter your choice: ");
        
        int choice = In.nextInt();
        if (choice == 1) {
            System.out.println("We recommend playing Grand Theft Auto V");
        } else if (choice == 2) {
            System.out.println("We recommend playing The Legend of Zelda: Breath of the WIld");
        } else if (choice == 3) {
            System.out.println("We recommend playing Resident Evil Reqiuem");
        }
        
        else {
            System.out.println("Invalid Choice.");
        }
    }
}
