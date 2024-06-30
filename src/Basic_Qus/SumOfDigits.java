package Basic_Qus;

public class SumOfDigits {

    //https://www.youtube.com/watch?v=ZLaBlxnmrxc&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=8

    public static void main(String[] args) {
        sumOfDigit(123456);
        System.out.println(largestOfThreeNumbers(5,2,3));
    }

    public static int largestOfThreeNumbers(int a, int b, int c){
        return c >(a > b ? a:b)? c : (a > b ? a : b);
        // return Math.max(c, (Math.max(a, b)));
    }

    public static void sumOfDigit(int num){
        //1234

        int rem = 0;
        int sum = 0;
        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Sum of Digit : "+sum);
    }


}
