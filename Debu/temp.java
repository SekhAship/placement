package Debu;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String startDay = sc.next().toLowerCase();
        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        map.put("sun", 0);
        map.put("mon", 1);
        map.put("tue", 2);
        map.put("wed", 3);
        map.put("thu", 4);
        map.put("fri", 5);
        map.put("sat", 6);

        int day = map.get(startDay);

        int daysToFirstSunday = (7 - day) % 7;

        int count = 0;

        if (daysToFirstSunday == 0) {
            count = (n + 6) / 7;
        } else if (daysToFirstSunday <= n) {
            count = 1 + (n - daysToFirstSunday) / 7;
        }

        System.out.println(count);

        sc.close();
    }
}