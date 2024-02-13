package org.example;

public class FibonacciRecursive {
    public static int fibonacci(int n){
        if (n <= 1){
            return n;}
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args){
        int n = 6;
        int result = fibonacci(n);
        System.out.println("Fibonacci number " + n + " is: " + result);
    }

}

//Просторова складність: O(n) - рекурсія викликається n разів, тому використовується стековий простір пам'яті.
//Часова складність: O(2^n) - рекурсивний алгоритм має експоненційну складність через подвійні рекурсивні виклики.
