package Basic_Qus;

public class DigitsInNumber {

    //https://www.youtube.com/watch?v=Ns4LoG56SZ4&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=7

    public static void main(String[] args) {
        //12345 = 5 digit
        int count = digitCount(123456789);
        if(count % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("Odd");
        }

    }

    public static int digitCount(int num){
        int count = 0;
        int odd = 0;
        int even = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem % 2 == 0){
                even++;
            }else{
                odd++;
            }
            num = num/10;
            count++;
        }
        System.out.println("odds " + odd);
        System.out.println("even " + even);

        System.out.println("Total digits "+count);
        return count;
    }
}
