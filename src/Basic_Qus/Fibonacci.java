package Basic_Qus;

public class Fibonacci {

    //https://www.youtube.com/watch?v=QqX1ExNAev0&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=10

    public static void main(String[] args) {
        fibonacci();

    }

    public static void fibonacci(){
        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i < 20; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.print(num3 + " ");
        }
    }
}
