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