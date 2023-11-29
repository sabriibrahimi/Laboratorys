package Lab4;

//Given is a sequence of N positive integers and a number K. Let the numbers be denoted by a0 to aN−1. Let
// us define the sum of absolute differences as abs(a1−a0)+abs(a2−a1)+…+abs(aN−1−aN−2). Choose exactly K numbers
// from the sequence so that when they are joined into a single sequence, the sum of absolute differences is maximal.
// Print this sum.
//
//Input: In the first line the two numbers N (1≤N≤100) and K (1≤K≤100, K≤N) are given. In the second line you N
// positive integers are given, each of which is less than 1,000.
//
//Output: Print the requested maximum sum of absolute differences.
//
//Note: The numbers are taken in the order in which they are given in the first sequence. The order of the numbers
// in the newly obtained sequence must not be changed.
//
//Partial Solution: If 5 test cases are correct.
//Name of Java class: SumOfAbsoluteDifferences
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfAbsoluteDifferences {

    static int solve(int numbers[], int N, int K) {
        int [][] m = new int[N][K];
        int max = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 1; j < K; j++) {
                for(int k = 0; k < i; k++) {
                    m[i][j] = Math.max(m[i][j], m[k][j - 1] + Math.abs(numbers[i] - numbers[k]));
                }
                max = Math.max(m[i][j], max);
            }
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int numbers[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int res = solve(numbers, N, K);
        System.out.println(res);

        br.close();
    }
}
