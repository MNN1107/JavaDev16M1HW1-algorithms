package org.example;

public class FibonacciIterative {
    public static int fibonacci(int n){
        if (n <= 1)
            return n;

        int fibPrev  = 0;
        int fibCurrent = 1;

        int fibNext = 0;
        for (int i = 2; i <= n; i++) {
            fibNext = fibPrev + fibCurrent;
            fibPrev = fibCurrent;
            fibCurrent = fibNext;
        }
        return fibCurrent;
    }


    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("Fibonacci number " + n + " is: " + result);
        }
}

//Просторова складність: O(1) - використовується постійна кількість змінних.
//Часова складність: O(n) - алгоритм має лінійну складність, оскільки обчислення відбувається за лінійним циклом з n ітераціями.