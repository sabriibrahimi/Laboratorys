package Lab1;


//For a given array of random numbers given from standard input, perform a shift of all zeros at the beginning
// of the sequence. Print the transformed array to standard output.

//For example:
//
//Input:
//12
//1 9 8 4 0 0 2 7 0 6 0 9
//Result:
//Transformiranata niza e:
//0 0 0 0 1 9 8 4 2 7 6 9
import java.util.Scanner;

public class PushZero
{
    static void pushZerosToBeginning(int arr[], int n)
    {
        int[] result = new int[n];
        int countZ = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                result[countZ] = 0;
                countZ++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[countZ] = arr[i];
                countZ++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        pushZerosToBeginning(arr, n);

        System.out.println("Transformiranata niza e:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}