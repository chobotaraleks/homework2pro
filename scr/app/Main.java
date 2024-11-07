package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter Project: Converts miles to kilometers and vice versa.");

        // Виклик методу milesToKilometers
        System.out.println("5 miles is " + milesToKilometers(5) + " kilometers.");
    }

    // Оголошення методу milesToKilometers в межах класу
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
