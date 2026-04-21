package Array.Easy;
import java.util.*;
public class i_joinarray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 4, 5, 6 };
        
        // int arr3[] = new int[arr1.length + arr2.length];
        // for (int i = 0; i < arr1.length; i++) {
        //     arr3[i] = arr1[i];
        // }
        // for (int i = 0; i < arr2.length; i++) {
        //     arr3[arr1.length + i] = arr2[i];
        // }
        // for (int i = 0; i < arr3.length; i++) {
        //     System.out.println(arr3[i]);
        // }

        ArrayList<Integer>list=new ArrayList<>();
        for(int i:arr1){
            list.add(i);
        }
        for(int i:arr2){
            list.add(i);
        }
        System.out.println(list);

    }
}
// list(0)->>>>>            2bit       memory
// list.add(1)->>>>>>>>       (2*1.5)
// list..add(2)->>>>>>>      (2*1.5*1.5) 7bit
//arr[5]->>>>>>>>           5 bit;

