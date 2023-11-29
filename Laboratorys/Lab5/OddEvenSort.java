package Lab5;

//Given a sequence of N natural numbers. It is necessary to sort the sequence so that in the first part of the sequence
// the odd numbers from it will be sorted in ascending order, and in the second part the even numbers will be sorted in
// descending order.
//
//In the first line of the input, the number of elements in the array N is given, and in the second line, the numbers
// are given. The output should print the sorted array.
//
//Class Name: OddEvenSort
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenSort {

    static void oddEvenSort(int a[], int n) {
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        int[] oddNumbers = new int[oddCount];
        int[] evenNumbers = new int[evenCount];

        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evenNumbers[evenIndex++] = a[i];
            } else {
                oddNumbers[oddIndex++] = a[i];
            }
        }


        bubbleSortAscending(oddNumbers);


        bubbleSortDescending(evenNumbers);


        int i = 0;
        for (int odd : oddNumbers) {
            a[i++] = odd;
        }
        for (int even : evenNumbers) {
            a[i++] = even;
        }
    }

    static void bubbleSortAscending(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void bubbleSortDescending(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int i;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s = stdin.readLine();
        int n = Integer.parseInt(s);

        s = stdin.readLine();
        String[] pom = s.split(" ");
        int[] a = new int[n];
        for (i = 0; i < n; i++)
            a[i] = Integer.parseInt(pom[i]);

        oddEvenSort(a, n);

        for (i = 0; i < n - 1; i++)
            System.out.print(a[i] + " ");
        System.out.print(a[i]);
    }
}
