import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Fahrenheit degree");

        double fahrenheitDegree = input.nextDouble();
        System.out.println("Fahrenheit degree: " + fahrenheitDegree + "°F");

        double celsiusDegree = (5.0 / 9) * (fahrenheitDegree - 32);
        System.out.println("Celsius degree: " + celsiusDegree + "°C");
    }
}

