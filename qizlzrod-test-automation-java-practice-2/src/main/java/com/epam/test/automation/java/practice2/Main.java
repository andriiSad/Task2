package com.epam.test.automation.java.practice2;

public class Main {
    private Main() {
    }


    public static int task1(int value) {
        if (value <= 0) throw new IllegalArgumentException();
        int temp;
        int sum = 0;
        while (value != 0) {
            temp = value % 10;
            if (temp % 2 == 1) sum += temp;
            value /= 10;
        }
        return sum;

    }


    public static int task2(int value) {
        if (value <= 0) throw new IllegalArgumentException();
        String binaryString = Integer.toBinaryString(value);
        int counter = 0;
        for (String s : binaryString.split(""))
            if (s.equals(String.valueOf(1))) counter++;
        return counter;
    }


    public static int task3(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        int[] arr = new int[n];
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else if (n == 3) return 2;
        else {
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 1;
            for (int i = 3; i < n; i++) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}