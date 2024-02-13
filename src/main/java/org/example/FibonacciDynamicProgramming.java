package org.example;

public class FibonacciDynamicProgramming {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[] fibArray = new int[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++){
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray[n];
    }
    public static void main(String[] args){
        int n = 6;
        int result = fibonacci(n);
        System.out.println("Fibonacci number " + n + " is: " + result);
    }

}

//Просторова складність: O(n) - використовується масив розміром n для зберігання проміжних значень.
//Часова складність: O(n) - алгоритм має лінійну складність, оскільки обчислення відбувається за лінійним циклом з n ітераціями.
