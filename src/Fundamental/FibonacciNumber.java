package Fundamental;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        int fibonacciResult=0;
        int firstTerm=1;
        int secondTerm=1;



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the term range: ");

        int fibonacciRange=scanner.nextInt();

        fibonacciResult=firstTerm+secondTerm;
        System.out.print("The series is: "+firstTerm+" "+secondTerm+" "+fibonacciResult+" ");
        for(int iterator=1;iterator<=fibonacciRange;iterator++){


            firstTerm=secondTerm;
            secondTerm=fibonacciResult;
            fibonacciResult=firstTerm+secondTerm;
            System.out.print(fibonacciResult+" ");

        }

    }

}
