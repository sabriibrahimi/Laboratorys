package Lab9.BusCpaccity;

import java.util.Scanner;
import java.util.TreeMap;

public class BusCapacity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = scanner.nextInt();
        int n = scanner.nextInt();

        TreeMap<String, Integer> events = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String boardTime = scanner.next();
            String leaveTime = scanner.next();

            events.put(boardTime, events.getOrDefault(boardTime, 0) + 1);

            events.put(leaveTime, events.getOrDefault(leaveTime, 0) - 1);
        }

        int currentPassengers = 0;
        boolean valide = true;

        for (int passengers : events.values()) {
            currentPassengers += passengers;

            if (currentPassengers > capacity) {
                valide = false;
                break;
            }
        }

        System.out.println(valide);

        scanner.close();
    }
}
