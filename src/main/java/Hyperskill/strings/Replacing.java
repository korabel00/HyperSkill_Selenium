package Hyperskill.strings;

import java.util.Scanner;

public class Replacing {
    public static void repalceIt () {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.replace("a", "b"));
    }

}


/*Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
The program should output the resulting string.
Sample Input 1:        aaa        Sample Output 1:        bbb
Sample Input 2:        bca        Sample Output 2:        bcb*/
