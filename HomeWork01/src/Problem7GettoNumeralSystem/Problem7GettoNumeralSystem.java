package Problem7GettoNumeralSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Simeon on 3/15/2016.
 */
public class Problem7GettoNumeralSystem {
    public static void main(String[] args) {

        Map gettoMap = new HashMap();
        gettoMap.put("0", "Gee");
        gettoMap.put("1", "Bro");
        gettoMap.put("2", "Zuz");
        gettoMap.put("3", "Ma");
        gettoMap.put("4", "Duh");
        gettoMap.put("5", "Yo");
        gettoMap.put("6", "Dis");
        gettoMap.put("7", "Hood");
        gettoMap.put("8", "Jam");
        gettoMap.put("9", "Mack");
        System.out.println();
        //System.out.println(" gettoMap Elements");
        //System.out.print("\t" + gettoMap);
        //System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        String numberLine = input.nextLine();
        char[] numberArr = numberLine.toCharArray();

        for (int i = 0; i < numberLine.length(); i++) {
            System.out.print(gettoMap.get(String.valueOf(numberArr[i])));
        }

        //6781	DisHoodJamBro
        //9374	MackMaHoodDuh
        //533	YoMaMa
        //102	BroGeeZuz
    }
}
