package Basic_Qus;

import java.util.Scanner;

public class Factorial {

    //https://www.youtube.com/watch?v=0VoHk8a6F6E&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=13

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        long factorial = scanner.nextLong();
        factorial(factorial);
        factorialWhile(factorial);
    }

    public static void factorial(long num){
        //10! = 9  * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 =
        long fac = 1;
        for(long i = num - 1; i >= 1; i--){
            fac = fac * i;
            //System.out.print(i + " ");
        }
        System.out.print("Factorial of " + num + " is " + fac + " \n");
    }

    public static void factorialWhile(long num){
        //10! = 9  * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 =
        long fac = 1;
        long i = num - 1;
        while (i >= 1){
            fac = fac * i;
            i--;
        }
        System.out.print("Factorial of " + num + " is " + fac + " ");
    }
}
