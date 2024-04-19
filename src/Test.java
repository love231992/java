/* File name : VirtualDemo.java */

import java.util.Arrays;

public class Test {
    public static void main(String[] arguments) {
//        Date date = Date.from(Instant.now());
//        System.out.println(date.compareTo());

     String s = "love";
        System.out.println(s);


// ****************                         Reverse the string            *****************************************
//        String s = "pragra";
//        String y = "";
//        for (int i = s.length() -1; i >= 0 ; i--) {
//            y += s.charAt(i);
//        }
//        for (int i = 0; i < y.length(); i++) {
//            System.out.print(y.charAt(i));
//        }
// ****************************************************************************************************************

        // **********************               Reverse an array            *********************

        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = new int[6];
        for (int i = 0; i < arr.length ; i++) {
             arr2[i] = arr[(arr.length-i)-1];
        }
        System.out.println(Arrays.toString(arr2));
// ****************************************************************************************************************
        // **********************               Sort an array            *********************
//        int[] array = {12,23,44,12,11,34};
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            } }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Lowest num in the array is : " + array[0]);
//        System.out.println("Highest num in the array is : " + array[(array.length -1)]);
// ****************************************************************************************************************
        // ********************        Array addition           *****************************

//        int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
//        int [][] arr2 = {{3,5,7},{6,5,9},{1,5,6}};
//        int [][] arr3 = new int [3][3];
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                arr3[i][j] = arr1[i][j]+arr2[i][j];
//            }
//        }
//        for (int i = 0; i < arr3.length; i++) {
//            for (int j = 0; j < arr3.length; j++) {
//                System.out.println(arr3[i][j]);
//            }
//        }
// ****************************************************************************************************************












} }