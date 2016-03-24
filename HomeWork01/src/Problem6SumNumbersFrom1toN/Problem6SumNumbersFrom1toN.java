package Problem6SumNumbersFrom1toN;

import java.util.Scanner;

/**
 * Created by Simeon on 3/14/2016.
 */
public class Problem6SumNumbersFrom1toN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        String numberLine = input.nextLine();
        Integer number = Integer.parseInt(numberLine);
        Integer sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum.toString());
    }

}
