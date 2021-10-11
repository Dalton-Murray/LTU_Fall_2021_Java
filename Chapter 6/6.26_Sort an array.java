/*
Write a program that gets a list of integers from input, and outputs the integers in ascending order (lowest to highest). The first integer indicates how many numbers are in the list. Assume that the list will always contain less than 20 integers.

Ex: If the input is:

5 10 4 39 12 2
the output is:

2 4 10 12 39
For coding simplicity, follow every output value by a space, including the last one.

Your program must define and call the following method. When the sortArray() method is complete, the array passed in as the parameter should be sorted.
public static void sortArray(int[] myArr, int arrSize)

Hint: There are many ways to sort an array. You are welcome to look up and use any existing algorithm. Some believe the simplest to code is bubble sort: https://en.wikipedia.org/wiki/Bubble_sort. But you are welcome to try others: https://en.wikipedia.org/wiki/Sorting_algorithm.

Dalton Murray
*/

import java.util.Scanner;

public class LabProgram {
    public static void sortArray(int[] myArr, int arrSize){
        for (int i = 0; i < arrSize - 1; i++) {
            for (int x = 0; x < arrSize - i - 1 ; x++) {
                if (myArr[x] > (myArr[x + 1])) {
                    int temp = myArr[x];
                    myArr[x] = myArr[x + 1];
                    myArr[x + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        int[] myArray = new int[userInput];
        for(int i = 0; i < userInput; i++){
            myArray[i] = scan.nextInt();
        }

        sortArray(myArray,myArray.length);
        for(int i = 0; i < userInput; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}