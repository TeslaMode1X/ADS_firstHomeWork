import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//Просто вводите task1(); и тд........

    }

//    public static void task1() {
//
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//
//        int min = minimum(size);
//
//        System.out.println(min);
//    }

//Problem 1. Complexity: linear - O(n)
//    public static int minimum(int size) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int minimum = 99999;
//
//        for (int i = 0; i < size; i++) {
//            int num = sc.nextInt();
//
//            if (minimum > num) {
//                minimum = num;
//            }
//        }
//
//        return minimum;
//
//    }

//    public static void task2() {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//
//        double avg = average(size);
//
//        System.out.println(avg);
//    }

//Problem 2. Complexity: linear - O(n)
//    public static double average(int size) {
//        Scanner sc = new Scanner(System.in);
//
//        double averageValue = 0;
//
//        for (int i = 0; i < size; i++) {
//            int num = sc.nextInt();
//            averageValue += num;
//        }
//
//        return averageValue / size;
//    }

//    public static void task3() {
//
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//
//        boolean check = isPrime(num);
//
//        System.out.println(check ? "Prime" : "Composite");
//    }

//Problem 3. Complexity: linear - O(n)
//    public static boolean isPrime(int num) {
//
//        if (num < 2) {
//            return false;
//        }
//
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }

//    public static void task4() {
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        int factorialToPrint = factorial(num);
//
//        System.out.println(factorialToPrint);
//    }

//Problem 4. Complexity: recursion - O(n)
//    public static int factorial(int num) {
//
//        if (num == 0) {
//            return 1;
//        }
//
//        return num * factorial(num - 1);
//    }

//    public static void task5() {
//        Scanner sc = new Scanner(System.in);
//
//        int fibonacciNum = sc.nextInt();
//
//        int fibonacciNumToPrint = fibonacci(fibonacciNum);
//
//        System.out.println(fibonacciNumToPrint);
//    }

//Problem 5. Complexity: recursion - O(2^n)
//    public static int fibonacci(int num) {
//
//        if (num == 0) {return 0;}
//        if (num == 1) {return 1;}
//
//        return fibonacci(num - 2) + fibonacci(num - 1);
//
//    }

//    public static void task6() {
//        Scanner sc = new Scanner(System.in);
//
//        int exponent = sc.nextInt();
//
//        int exponentToPrint = exponentOfTwo(exponent);
//
//        System.out.println(exponentToPrint);
//    }

//Problem 6. Complexity: recursion - O(n)
//    public static int exponentOfTwo(int exponent) {
//
//        if (exponent == 0) {
//            return 1;
//        }
//
//        return 2 * exponentOfTwo(exponent - 1);
//    }

//    public static void task7() {
//        Scanner sc = new Scanner(System.in);
//
//
//        String input = sc.nextLine();
//
//        permute(input.toCharArray(), 0, input.length() - 1);
//    }

//Problem 7. Complexity: recursion - O(n!)
//    public static void permute(char[] word, int startIndex, int endIndex) {
//        if (startIndex == endIndex) {
//            System.out.println(String.valueOf(word));
//        } else {
//            for (int i = startIndex; i <= endIndex; i++) {
//                swap(word, startIndex, i);
//                permute(word, startIndex + 1, endIndex);
//                swap(word, startIndex, i);
//            }
//        }
//    }
//
//    public static void swap(char[] word, int i, int j) {
//        char temp = word[i];
//        word[i] = word[j];
//        word[j] = temp;
//    }

//    public static void task8() {
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//
//        boolean valid = isDigit(str);
//
//        System.out.println(valid ? "Yes" : "No");
//    }

//Problem 8. Complexity: linear - O(n)
//    public static boolean isDigit(String text) {
//
//        for(int i = 0; i < text.length(); i++) {
//
//            if (!Character.isDigit(text.charAt(i))) {
//                return false;
//            }
//
//        }
//
//        return true;
//    }

//    public static void task9() {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        int numToPrint = binomialCoefficient(n, k);
//
//        System.out.println(numToPrint);
//    }

//Problem 9. Complexity: recursion - O(2^n)
//    public static int binomialCoefficient(int n, int k) {
//        if (k == 0 || k == n) {
//            return 1;
//        } else {
//            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
//        }
//    }

//    public static void task10() {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int numToPrint = euclideanAlgorithm(a, b);
//
//        System.out.println(numToPrint);
//    }

//Problem 10. Complexity: recursion - O(я не знаю какой у него time complexity).
//    public static int euclideanAlgorithm(int a, int b) {
//
//        if (b == 0) {
//            return a;
//        }
//
//        int remainder = a % b;
//
//        return euclideanAlgorithm(b, remainder);
//    }


}
