package Fundamental;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        int factorialResult=1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int factorialNumber=scanner.nextInt();

        int iterator=0;

        for(iterator=1;iterator<=factorialNumber;iterator++){
            factorialResult=factorialResult*iterator;

        }
        System.out.println("The factorial of "+factorialNumber+ " is : "+factorialResult);
    }

}
