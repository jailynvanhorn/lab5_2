


import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String hexaDecimal;
        long newDecimal = 0;
        System.out.println("Enter a hexadecimal number: ");
        hexaDecimal = scnr.next();

        int length = hexaDecimal.length();
        int W = 1; //variable of the exponent for 16
        int loop = W - 1;
        char a = 'a';
        char A = 'A';
        char b = 'b';
        char B = 'B';
        char c = 'c';
        char C = 'C';
        char d = 'd';
        char D = 'D';
        char e = 'e';
        char E = 'E';
        char f = 'f';
        char F = 'F';
        char x = 'x';
        char X = 'X';


        while (W <= length) //power less than the length of the string
        {
            if (hexaDecimal.charAt(length - W) == a || hexaDecimal.charAt(length - W) == A) {
                loop = W - 1; // power initialized at 1 so loop subtracts 1 to give the accurate exponent number
                newDecimal += Character.getNumericValue(hexaDecimal.charAt(length - W)) * Math.pow(16, loop);

            } else if (hexaDecimal.charAt(length - W) == b || hexaDecimal.charAt(length - W) == B) {
                loop = W - 1;
                newDecimal += Character.getNumericValue(hexaDecimal.charAt(length - W)) * Math.pow(16, loop);

            } else if (hexaDecimal.charAt(length - W) == c || hexaDecimal.charAt(length - W) == C) {
                loop = W - 1;
                newDecimal += Character.getNumericValue(hexaDecimal.charAt(length - W)) * Math.pow(16, loop);

            } else if (hexaDecimal.charAt(length - W) == d || hexaDecimal.charAt(length - W) == D) {
                loop = W - 1;
                newDecimal += Character.getNumericValue(hexaDecimal.charAt(length - W)) * Math.pow(16, loop);

            } else if (hexaDecimal.charAt(length - W) == e || hexaDecimal.charAt(length - W) == E) {
                loop = W - 1;
                newDecimal += Character.getNumericValue(hexaDecimal.charAt(length - W)) * Math.pow(16, loop);

            } else if (hexaDecimal.charAt(length - W) == f || hexaDecimal.charAt(length - W) == F) {
                loop = W - 1;
                newDecimal += Character.getNumericValue(hexaDecimal.charAt(length - W)) * Math.pow(16, loop);

            }
            //numbers
            else if (hexaDecimal.charAt(length - W) == '1' || hexaDecimal.charAt(length - W) == '2' || hexaDecimal.charAt(length - W) == '3' ||
                    hexaDecimal.charAt(length - W) == '4' || hexaDecimal.charAt(length - W) == '5' || hexaDecimal.charAt(length - W) == '6' ||
                    hexaDecimal.charAt(length - W) == '7' || hexaDecimal.charAt(length - W) == '8' || hexaDecimal.charAt(length - W) == '9' ||
                    hexaDecimal.charAt(length - W) == '0') {
                newDecimal += Character.getNumericValue(hexaDecimal.charAt(length - W)) * Math.pow(16, W - 1);

            }

            //0x function

            else if (

                    hexaDecimal.charAt(length - W) == x || hexaDecimal.charAt(length - W) == X) {

                W = length + 1;

            }


            W++;
        }

        System.out.println("Your number is " + newDecimal + " in decimal");


    }
}



