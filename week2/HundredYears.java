public class HundredYears {
    public static void main(String[] args) {
        System.out.println("Enter your name ");
        String name = In.nextLine();
        
        System.out.println("Enter your age: ");
        int age = In.nextInt();

        // Calculate the year when the user will turn 100
        int year100 = (100 - age) + 2026;
        int yearBorn = (2026 - age);

        if (age < 13) {
            System.out.println("Hi " + name + ", you're still a child! Enjoy these wonderful yeaars!");
        } else if (age < 20) {
            System.out.println("Hello " + name + ", you're a teenager! Embrace new experiences and learn from them!");
        } else if (age < 30) {
            System.out.println("Hey " + name + ", you're in your twenties! A great time for personal growth and exploration!");
        } else if (age < 50) {
            System.out.println("Hi " + name + ", you're in the prime of your life! Make the most of these years!");
        } else if (age == 100) {
            System.out.println("Wow " + name + ", you're a centenarian!");
        } else {
            System.out.println("Hello " + name + ", age is just a number! Keep living life to the fullest!");
        }
        System.out.println("Fun Fact: you will turn 100 in the year " + year100);
        System.out.println(name + ", You were born in " + yearBorn);
    }
}
