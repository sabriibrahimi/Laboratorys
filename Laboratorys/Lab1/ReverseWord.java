package Lab1;

//For a given word entered from standard input, print it reversed. On input in the first line, the number of words
// that will be entered is given. In the following lines, the words are entered.
//
//For example:
//
//Input:
//3
//one
//two
//three
//Result:
//eno
//owt
//eerht
import java.util.Scanner;

public class ReverseWord {

    public static void printReversed(String word) {
        char[] array = word.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while(left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
        System.out.println(new String(array));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            printReversed(word);
        }
    }
}
