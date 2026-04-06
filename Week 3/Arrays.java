public class Arrays {
    public static void main(String[] args) {

        double[] arr1 = { 10, 20, 30, 40, 50, 60 };
        double[] arr2 = { 45, -12, 37, 98 };
        
        //For-each loop to calculate the sum
        double sum1 = 0;
        double sum2 = 0;

        for (double num : arr1) {
            sum1 += num;
        }

        for (double num : arr2) {
            sum2 += num;
        }

        System.out.println("Sum of arr1: " + sum1);
        System.out.println("Sum of arr2: " + sum2);

        //Calculate Average

        double avg1 = sum1 / arr1.length;
        double avg2 = sum2 / arr2.length;

        System.out.println("Average of arr1: " + avg1);
        System.out.println("Average of arr2: " + avg2);

        //Create new array

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }

        for (int num : numbers) {
            System.out.println(num);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 10 - i;
        }

        for (int num : numbers) {
            System.out.println(num);
    }
}

}
