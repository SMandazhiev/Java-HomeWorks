package Problem5PrintaCharacterTriangle;

import java.util.Scanner;

public class Problem5PrintaCharacterTriangle {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        String numberLine = input.nextLine();
        Integer number = Integer.parseInt(numberLine);
        if (number < 1 || number > 26) {
            throw new Exception("Number must be between 1 and 26!");
        }

        char c = 96; // We want symbols from a to z smallcase
        int n = 1;

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(c);
                c += 1;
            }

            if (n < number) {
                n++;
            }

            c = (char) (97);
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(c);
                c += 1;
            }

            if (n > 0) {
                n--;
            }

            c = (char) (97);
            System.out.println();
        }

        System.out.println();
    }
}
