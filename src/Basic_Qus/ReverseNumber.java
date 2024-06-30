package Basic_Qus;

public class ReverseNumber {

    //https://www.youtube.com/watch?v=m0lMpNIG6vU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=2

    public static void main(String[] args) {

        reverse1(123);
        byStringBuffer(456);
        byStringBuilder(789);
    }

    public static void reverse1(int num){
        //12345
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed num Logic " + rev);

    }

    public static void byStringBuffer(int num){
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(num));
        StringBuffer rev = stringBuffer.reverse();
        System.out.println("Reversed num StringBuffer " + rev);
    }

    public static void byStringBuilder(int num){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        StringBuilder rev = stringBuilder.reverse();
        System.out.println("Reversed num StringBuilder " + rev);
    }
}
