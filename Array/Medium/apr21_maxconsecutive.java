package Array.Medium;
public class apr21_maxconsecutive {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0,0,0,0, 1,1,1 };
        int c = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++;// c=3
            } else {
                c = 0;// c=0
            }
            maxi = Math.max(maxi, c);

        }
        System.out.println(maxi);
        
    }
}