package Basic_Qus;

public class SwapNumbers {
    public static void main(String[] args) {
        //to swap numbers
        //withOutExtraVariable(10, 20);
        //singleLine(10, 20);
        XOR(10, 20);
    }

    public static void withExtraVariable(int a, int b){
         a = 10;
         b = 20;
        //after swap a = 20, b = 10;
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void withOutExtraVariable(int a, int b) {
        //by using + and - operators
        //works only on non-zero numbers

        System.out.println("Before a = " + a);
        System.out.println("Before b = " + b);
        a = a + b; //10 + 20  = 30 so a = 30 (+ can be *)
        b = a - b; // 30 - 20 = 10 so b = 10 (- can be /)
        a = a - b; // 30 - 10 = 20 so a = 20 (- can be /)
        System.out.println("after a = " + a);
        System.out.println("after b = " + b);
    }

    public static void XOR(int a, int b){
        a = a ^ b; //10 + 20  = 30 so a = 30 (+ can be *)
        b = a ^ b; // 30 - 20 = 10 so b = 10 (- can be /)
        a = a ^ b; // 30 - 10 = 20 so a = 20 (- can be /)
        System.out.println("after a = " + a);
        System.out.println("after b = " + b);
    }

    public static void singleLine(int a, int b){
        b = a + b -(a=b);
        System.out.println("after a = " + a);
        System.out.println("after b = " + b);
    }
}
