public class Countdown {
    public static void main(String[] args) {
        
        System.out.println("Enter a positve interger:");
        int n = In.nextInt();

        while (n >= 1 ) {
            if (n % 2 == 0) {
                System.out.println(n + " is EVEN");
            } else {
                System.out.println(n + " is ODD");
            }

            n--;
        }
    }
}
