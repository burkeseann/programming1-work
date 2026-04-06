package week4;

public class Week4 {
    public static void main(String[] args) {
        //solution
        VideoGame marioKart = new VideoGame("Mario Kart", 109.99);
        System.out.println(marioKart);
        marioKart.applyDiscount(9.99);
        System.out.println(marioKart);
        
    }
}

class VideoGame {
    String name;
    double price;

    public String toString() {
        return "Name: " + this.name + ", Price: $" + this.price;
    }

    VideoGame(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void startGame() {
        System.out.println("The game " + this.name + " has started.");
    }

    void stopGame() {
        System.out.println("The game " + this.name + " has stopped.");
    }

    void playGame() {
        System.out.println("Playing the game " + this.name + ".");
    }

    void applyDiscount(double discount) {
        this.price -= discount;
    }
}

class Square {
    int width;

    Square(int width) {
        this.width = width;
    }

    int getArea() {
        return this.width * this.width;
    }

    boolean isAreaGreaterThan(int area) {
        int myArea = this.getArea();
        boolean isGreater = myArea > area;
        return isGreater;
    }

    public String toString() {
        return "Square with width " + this.width;
    }

    int getPerimeter() {
        return 4 * this.width;
    }

    boolean isPerimeterGreaterThan(int perimeter) {
        int myPerimeter = this.getPerimeter();
        boolean isGreater = myPerimeter > perimeter;
        return isGreater;


    }
}

class SquareTest {
    public static void main(String[] args) {
        Square sq = new Square(10);
        System.out.println("Perimeter: " + sq.getPerimeter());
        System.out.println("Is perimeter greater than 30? " + sq.isPerimeterGreaterThan(30));
        System.out.println("Is perimeter greater than 40? " + sq.isPerimeterGreaterThan(40));
    }
}