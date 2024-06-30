package Basic_Qus;

public class Palindrome {

    //https://www.youtube.com/watch?v=kNE3vq1g2e8&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=4

    public static void main(String[] args) {
        isPalindrome(1203021);
    }

    public static void isPalindrome(int num){
        //12321
        int rev = reverse(num);
        if(num != rev){
            System.out.println("Not a palindrome");
        }else{
            System.out.println("palindrome");
        }

    }

    public static int reverse(int num){
        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
}
