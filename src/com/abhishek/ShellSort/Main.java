package com.abhishek.ShellSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int intArray[] = {20, 35, -15, 7, 55, 1, -22};
        for (int gap = intArray.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElment = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElment) {
                    intArray[j] = intArray[j - gap];
                    j = j - gap;
                }
                intArray[j] = newElment;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}