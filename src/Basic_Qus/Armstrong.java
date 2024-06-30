package Basic_Qus;

public class Armstrong {

    public static void main(String[] args) {

        for(int i = 0; i <= 500; i++){
            if (isArmstrong(i)){
                System.out.println(i + " is an Armstrong number");
            }
        }

    }

//    public static void isArmstrong(int num){
//        //371 = 3 * 3 * 3, 7 * 7 * 7, 1 * 1 * 1;
//
//        int org = num;
//        int sum = 0;
//
//        while(num > 0){
//            int rem = num % 10;
//            sum = sum + (rem * rem * rem);
//            num = num/10;
//        }
//
//        if(org == sum){
//            System.out.println(org + " is Armstrong Num");
//        }else{
//            System.out.println(org + " NOT an Armstrong Num");
//
//        }
//    }

    public static boolean isArmstrong(int num){
        //371 = 3 * 3 * 3, 7 * 7 * 7, 1 * 1 * 1;

        int org = num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num/10;
        }

        return org == sum;
    }
}
