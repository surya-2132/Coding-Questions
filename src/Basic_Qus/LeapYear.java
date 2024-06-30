package Basic_Qus;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        leapYear(2036);
    }

    public static void leapYear(int num){
        if(num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)){
            System.out.println(num + " is leap year ");
        }else{
            System.out.println(num + " NOT a leap year ");
        }
    }

    public static void leapYearINPUT(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int startYear = scanner.nextInt();

        System.out.println("Enter ending number: ");
        int endYear = scanner.nextInt();

        for(int i  = startYear; i <= endYear; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i + " is leap year ");
            } else {
                System.out.println(i + " NOT a leap year ");
            }
        }
    }
}