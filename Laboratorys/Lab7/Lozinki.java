package Lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;


public class Lozinki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int hashTableSize = 2 * N;
        Hashtable<String, String> users = new Hashtable<>(hashTableSize);

        for (int i = 1; i <= N; i++) {
            String imelozinka = br.readLine();
            String[] pom = imelozinka.split(" ");
            String username = pom[0];
            String password = pom[1];
            users.put(username, password);
        }

        while (true) {
            String loginAttempt = br.readLine();
            if (loginAttempt.equals("KRAJ")) {
                break;
            }

            String[] loginData = loginAttempt.split(" ");
            String username = loginData[0];
            String password = loginData[1];

            if (users.containsKey(username) && users.get(username).equals(password)) {
                System.out.println("Najaven");
                break;
            } else {
                System.out.println("Nenajaven");

            }
        }
    }
}
