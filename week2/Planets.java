public class Planets {
    public static void main(String[] args) {
        System.out.println("Select a Planet from the list.");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Earth");
        System.out.println("4. Mars");
        System.out.println("5. Jupiter");
        System.out.println("6. Saturn");
        System.out.println("7. Uranus");
        System.out.println("8. Neptune");
        


        int choice = In.nextInt();
        if (choice == 1) {
            System.out.println("You have selected Mercury ");
        } else if (choice == 2) {
            System.out.println("You have selected Venus");
        } else if (choice == 3) {
            System.out.println("You have selected Earth");
        } else if (choice == 4) {
            System.out.println("You have selected Mars");
        } else if (choice == 5) {
            System.out.println("You have selected Jupiter");
        } else if (choice == 6) {
            System.out.println("You have selected Saturn");
        } else if (choice == 7) {
            System.out.println("You have selected Uranus");
        } else if (choice == 8) {
            System.out.println("You have selected Neptune");
        } else {
            System.out.println("Invalid Choice.");
        }
    }
}
