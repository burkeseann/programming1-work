public class Loops {
    public static void main(String[] args) {

        //counting all intergers from 45 to 59 inclusive
        for (int i = 45; i <= 59; i++) {
            System.out.println(i);
        }
        
        //counting all intergers from 17 to 0 inclusive
        for (int o = 17; o >= 0; o--) {
            System.out.println(o);
        }
        
        //counting all odd value intergers
        for (int i = 45; i <= 59; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        //counting all intergers with multiples of 3
        for (int o = 17; o >= 0; o--) {
            if (o % 3 == 0) {
                System.out.println(o);
            }
        }

        //while loops

        String hey = "";
        int i = 0;

        while (i < 5) { 
            hey += "Hey! ";
            i++;
        }

        System.out.println(hey);
    } 
}
