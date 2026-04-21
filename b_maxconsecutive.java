public class b_maxconsecutive {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1 };
        int c = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++;// c=3
            } else {
                maxi = Math.max(maxi, c);// maxi=2
                c = 0;// c=0
            }

        }
        System.out.println(Math.max(maxi, c));
    }
}