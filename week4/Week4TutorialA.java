package week4;

public class Week4TutorialA {

    public static void main(String[] args) {

        Person a1 = new Person("John", "Smith", 20, true);
        Person a2 = new Person("Sarah", "Lee", 15, true);
        Person a3 = new Person("Mike", "Brown", 30, false);

        System.out.println(a1);
        System.out.println("Is adult? " + a1.isAdult());

        System.out.println();

        System.out.println(a2);
        System.out.println("Is adult? " + a2.isAdult());

        System.out.println();

        System.out.println(a3);
        System.out.println("Is adult? " + a3.isAdult());


        //exercise #2
        Point p1 = new Point(3, 5);
        Point p2 = new Point(-4, 6);
        Point p3 = new Point(-2, -3);
        Point p4 = new Point(4, -7);
        
        System.out.println(p1);
        System.out.println("Upper half plane: " + p1.inUpperHalfPlane());
        System.out.println("First Quadrant: " + p1.inFirstQuadrant());
        System.out.println("Quadrant 1? " + p1.isInQuadrant(1));
        System.out.println("Squared distance: " + p1.squaredDistance());

        System.out.println();

        System.out.println(p2);
        System.out.println("Quadrant 2? " + p2.isInQuadrant(2));
    }
}

class Point {

    double x;
    double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Upper half plane
    public boolean inUpperHalfPlane() {
        return y >= 0;
    }

    // First quadrant
    public boolean inFirstQuadrant() {
        return x > 0 && y > 0;
    }

    // General quadrant method
    public boolean isInQuadrant(int quadrantNumber) {

        switch (quadrantNumber) {

            case 1:
                return x > 0 && y > 0;

            case 2:
                return x < 0 && y > 0;

            case 3:
                return x < 0 && y < 0;

            case 4:
                return x > 0 && y < 0;

            default:
                return false;
        }
    }

    // Squared distance
    public double squaredDistance() {
        return (x * x) + (y * y);
    }

    // toString
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
}

class Person {

    String firstName;
    String lastName;
    int age;
    boolean isStudent;

    // Constructor
    public Person(String firstName, String lastName, int age, boolean isStudent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isStudent = isStudent;
    }

    // isAdult method
    public boolean isAdult() {
        return age >= 18;
    }

    // toString method
    public String toString() {
        return firstName + " " + lastName +
               " | Age: " + age +
               " | Student: " + isStudent;
    }
}
