package Problem8GetAverage;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Simeon on 3/15/2016.
 */
public class Problem8GetAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the 3 numbers in one line for example: 111 222 333 ");

        String numberLine = input.nextLine();
        String[] numbersArray = numberLine.split(" ");
        double firstNumber = Double.parseDouble(numbersArray[0]);
        double secondNumber = Double.parseDouble(numbersArray[1]);
        double thirdNumber = Double.parseDouble(numbersArray[2]);

        double averageResult = average(firstNumber, secondNumber, thirdNumber);
        System.out.printf("%.2f", averageResult);
    }

    private static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

