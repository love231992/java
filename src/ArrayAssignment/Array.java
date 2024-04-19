package ArrayAssignment;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};

        // reverse the array
        int[] arr = new int[8];
        for (int i = 0; i < number.length; i++) {
            arr[i] = number[(number.length-i)-1];
        }
        System.out.println("The reverse array is :"+Arrays.toString(arr));

        // find the max & min element
        for (int i = 0; i < number.length-1; i++) {
            for (int j = 0; j < number.length-i-1; j++) {
                if (number[j] > number[j+1]) {
                   int temp = number[j];
                   number[j] = number[j+1];
                   number [j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is :"+Arrays.toString(number));
        System.out.println(("The maximum number in the array is : " +number[number.length-1]));
        System.out.println(("The second maximum number in the array is : " +number[number.length-2]));
        System.out.println(("The minimum number in the array is : " +number[0]));
        System.out.println(("The second minimum number in the array is : " +number[1]));

        // sum of all the elements
        int sum = 0;
        for (int j : number) {
            sum = sum + j;
        }
        System.out.println("Sum of all the elements in the arrays is : "+sum);

        // average of all the elements
        System.out.println("Average of all the element is : "+sum/number.length);

        //Add 2D arrays
        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};
        int[][] array3 = new int [3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
              array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Addition of 2D array is : "+Arrays.deepToString(array3));






    }





















}
