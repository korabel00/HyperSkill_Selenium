package Hyperskill.strings;

import java.util.Scanner;

public class CheckBurgs {
    public static void checkIt() {
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.nextLine();
        System.out.println(strInput.endsWith("burg"));
    }
}
/*    Write a program that reads the name of a city and check the name ends with "burg".
        Keep in mind, a city can have a short name.
        The program should output true or false.

        Sample Input 1:
        Brandenburg
        Sample Output 1:
        true

        Sample Input 2:
        Saint Petersburg
        Sample Output 2:
        true

        Sample Input 3:
        Tu
        Sample Output 3:
        false*/
