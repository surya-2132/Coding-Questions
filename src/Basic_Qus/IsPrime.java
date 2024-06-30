package Basic_Qus;

import java.util.Scanner;

public class IsPrime {

    //https://www.youtube.com/watch?v=vwjhT_OTp1w&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=11

    public static void main(String[] args) {

//        isPrimeNumber(13);
//        primeNumbers();
        System.out.println(primeNumberOptimised(17));

    }

    public static void isPrimeNumber(int num){
        int count = 0;
        for(int i = 2; i < num; i++){
            if (num % i == 0) {
                count++;
            }
        }
        //count == 0 ? System.out.println("Prime Number") : System.out.println("Not a Prime Number");

        if(count == 0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }

    public static boolean primeNumberOptimised(int num){
        if(num <= 1){
            return false;
        }
        int count = 2;
        while(count * count <= num){
            if(num % count == 0){
                return false;
            }
            count++;
        }
        return true;
    }




    public static void primeNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int startNum = scanner.nextInt();

        System.out.println("Enter ending number: ");
        int endNum = scanner.nextInt();

        for(int i = startNum; i < endNum; i++){
            int count = 0;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(i + " ");
            }
        }
    }
}
