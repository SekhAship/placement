package Array.Easy;
import java.util.*;

///// XORRRRRR........
/// 
// public class d_findthenumappearonce {
//     public static void main(String[] args) {
//         int[] arr = { 1, 3, 4, 4, 2, 2, 3 };
//         // o(nlogn)
//         // 1 ^ 0=1
//         // 1 ^ 1=0
//         int ans = 0;
//         for (int i : arr) {
//             ans = ans ^ i;
//         }
//         System.out.println(ans);
//     }
// }

///// MAPPPP............
public class d_findthenumappearonce {  
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 4, 2, 2, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        /// 1 -> 1
        /// 3 -> 2
        /// 4 -> 2
        /// 2 -> 2

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);

            } else {
                map.put(i, 1);

            }
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                System.out.println(m.getKey() + " " + m.getValue()); // isse key value pair ko dekh sakte hai
            }
        }
        System.out.println(map);// issse pure map ko dekh sakte hai
    }
}
