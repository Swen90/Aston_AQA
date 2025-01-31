package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSigh();
        printColor();
        compareNumbers();
        System.out.println(checkSum(5, 7));
        checkNumPositivity(-7);
        System.out.println(checkNumPositivityBool(12));
        printString("Greetings friend", 5);
        System.out.println(checkLeapYear(2024));

        int[] nums = {0,1,0,1,1,0,1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = 1;
            }
            else{
                nums[i] = 0;
            }
            System.out.println(nums[i]);
        }

        int[] nums2 = new int[100];
        for(int i = 0; i < 100; i++){
            nums2[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i < nums3.length; i++){
            if(nums3[i] < 6){
                nums3[i] = nums3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(nums3));

        int[][] nums4 = new int[4][4];
        for(int i = 0; i == 4; i++){
            nums4[i][i] = 1;
        }

        massive(5,333);
    }

    public static void printThreeWords(){
        System.out.println("Orange \n" + "Banana\n" + "Apple\n");
    }

    public static void checkSumSigh(){
        int a = 5;
        int b = 10;
        if(a + b >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 100;
        if(value <= 0){
            System.out.println("Красный");
        }
        else if(value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 1;
        int b = 5;
        if(a >= b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b){
        int c = a + b;
        /*if(c >= 10 && c <= 20){
            return true;
        }
        else{
            return false;
        }
        */
         return c >= 10 && c <= 20;
    }

    public static void checkNumPositivity(int a){
        if(a >= 0){
            System.out.println("Число " + a + " является положительным.");
        }
        else{
            System.out.println("Число " + a + " является отрицательным.");
        }
    }

    public static boolean checkNumPositivityBool(int a){
        /*if(a >= 0){
            return false;
        }
        else{
            return true;
        }
         */
        return a >= 0;
    }

    public static void printString(String a, int b){
        for(int i = 0; i < b; i++){
            System.out.println(a);
        }
    }

    public static boolean checkLeapYear(int a){
        if( a % 400 == 0){
            return true;
        }
        else if (a % 100 == 0){
            return false;
        }
        else if(a % 4 == 0){
            return true;
        }
        return false;
    }

    public static int[] massive(int len, int initialValue){
        int[] numArray = new int[len];
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = initialValue;
        }
        System.out.println(Arrays.toString(numArray));
        return numArray;
    }
}