package Basic_Qus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OtherQuestions {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //multiplyBy3and5();
        //sumOfArray();
        //isPrime();
        //sumTillGivenNumber();
        //productTillGivenNumber();
        //palindromeString();
        //reverseString();
        //removeVowels();
        //removeDuplicateFromString();
        //vow();
        //bubbleSortASC();
        //bubbleSortDSC();
        //findMaxMin();
        //sortedInOrder();
        arrayWithSumProductAvg();

    }

    public static void multiplyBy3and5(){
        System.out.println("\nEnter the number: ");
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println(i + " is divisible by both 3 and 5");
            }
        }
    }

    public static void isPrime(){
        System.out.println("\nEnter the number to check if its prime: ");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println(num + " is prime");
        }else{
            System.out.println("Not a prime");
        }
    }

    public static void sumTillGivenNumber(){
        System.out.println("\nEnter the end number to sum form 1: ");
        int num = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum = sum + i;
        }
        System.out.println("Total sum: " + sum);
    }

    public static void productTillGivenNumber(){    //Just Factorial
        System.out.println("\nEnter the end number to product form 1: ");
        int num = scanner.nextInt();

        int sum = 1;
        for(int i = 1; i <= num; i++){
            sum = sum * i;
        }
        System.out.println("Total sum: " + sum);
    }

    public static void palindromeString(){
        System.out.println("\nEnter the string to find palindrome: ");
        String str = scanner.next();
        boolean isPalindrome = true;

        int left = 0;
        int right = str.length()-1;
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Character miss matched");
                isPalindrome = false;
                break;
            }
            left++; right--;

        }
        if(isPalindrome){
            System.out.println("Palindrome String");
        }else{
            System.out.println("NOT a Palindrome String");
        }
    }

    public static void reverseString(){
        System.out.println("\nEnter the string to find reverse: ");
        String str = scanner.next();

        StringBuffer sbfr = new StringBuffer(str);
        sbfr.reverse();
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: "+sbfr);
    }

    public static void removeVowels(){
        System.out.println("\nEnter the string to REMOVE VOWELS: ");
        String str = scanner.next();
        //surya = sry

        String strOP = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(strOP);
    }

    public static void vow() {
        System.out.println("\nEnter the string to REMOVE VOWELS: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
//        raj surya kalieswaran
//        rj sry klswrn
        String cons = "";

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(!(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')){
                cons += ch;
            }
        }
        System.out.println(cons);
    }

    public static void removeVowelsWithoutREGEX() {
        System.out.println("Enter the string to REMOVE VOWELS: ");
        String input = scanner.next();
        // surya = sry

        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }

        System.out.println("String after removing vowels: " + result.toString());
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void removeDuplicateFromString(){
        System.out.println("\nEnter the string to REMOVE DUPLICATE: ");
        String input = scanner.next();

        Set<Character> stringSet = new HashSet<>();
        char[] charArray = new char[input.length()];
        for(int i = 0; i < charArray.length; i++){
            charArray[i] = input.charAt(i);
        }

        for(int i = 0; i < charArray.length; i++){
            stringSet.add(charArray[i]);
        }

//        for(char arr : charArray){    //Enhanced for
//            stringSet.add(arr);
//        }

        System.out.println("With Duplicate: " + input);
        System.out.println("Removed Duplicate" + stringSet);
    }

    public static void sumOfArray(){
        System.out.println("\nEnter the size of an array");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of an array: "+sum);
    }

    public static void bubbleSortASC(){
        int[] array = new int[]{9,7,3,1,5,0,6,8,2,4};
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

//        for(int i : array){
//            System.out.println(array[i]);
//        }
    }

    public static void bubbleSortDSC(){
        int[] array = new int[]{9,7,3,1,5,0,6,8,2,4};
        for(int i = 0; i < array.length-1; i++){
            for(var j = i+1; j < array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] array){
        for(int i = 0; i < array.length; i++){
            for(var j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void findMaxMin(){
        int[] array = new int[]{9,7,3,1,5,0,6,8,2,4};
        sortArray(array);
        var maximum = array.length-1;
        var minimum = array[0];
        System.out.println("Maximum : " + maximum);
        System.out.println("Minimum : " + minimum);

//        System.out.println(Arrays.stream(array).max());
//        System.out.println(Arrays.stream(array).min());
    }

    public static void arrayWithSumProductAvg(){
        System.out.println("\nArray size: ");
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize];

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter the number: ");
            array[i] = scanner.nextInt();
        }

        //For Sum of an array
        int sum = 0;
        for (var element : array) {
            sum = sum + element;
        }

        //For Product of an array
        int product = 1;
        for (var element : array) {
            product = product * element;
        }

        //For Avg calc of an array
        int avg = sum / array.length;

        //results of Calculations
        System.out.println("\nSum of an array: " + sum);
        System.out.println("Product of an array: " + product);
        System.out.println("Average: " + avg);
    }

    public static void sortedInOrder(){
        System.out.println("\nArray size: ");
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize];

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter the number: ");
            array[i] = scanner.nextInt();
        }
        sortArray(array);
        if(array[0] < array[array.length-1]){
            System.out.println("Sorted in Asc ");
        }else{
            System.out.println("Sorted in Dsc ");
        }
    }
}
