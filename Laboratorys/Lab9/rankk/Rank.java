package Lab9.rankk;

import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int rank = 1;

        for(int i = 0; i < n; i++) {
            int score = in.nextInt();
            if(score > m) {
                rank++;
            }
        }

        System.out.println(rank);
    }
}



