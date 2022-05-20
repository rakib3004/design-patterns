package Fundamental;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        String userGivenString = "", reverseString = "";
        System.out.print("Enter the string: ");

        Scanner scanner = new Scanner(System.in);

        userGivenString = scanner.nextLine();



        int stringLength = userGivenString.length();

        for (int i = (stringLength - 1); i >=0; --i) {
            reverseString = reverseString + userGivenString.charAt(i);
        }

        if (userGivenString.toLowerCase().equals(reverseString.toLowerCase())) {
            System.out.println(userGivenString + " is a Palindrome String.");
        }
        else {
            System.out.println(userGivenString + " is not a Palindrome String.");
        }


    }
}
