package Array.Medium;
import java.util.*;


public class m5_threesumopt {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,0,-4};//124
        // HashMap<Integer,Integer>mp=new HashMap<>();
        HashSet<ArrayList<Integer>>ans=new HashSet<>();
        int k=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            Set<Integer> st=new HashSet<>(); 

            for(int j=i+1;j<n;j++){

                int temp=k-arr[i]-arr[j];
                if(st.contains(temp)){
        
                    ArrayList<Integer>temp2=new ArrayList<>();
                    temp2.add(arr[i]);
                    temp2.add(arr[j]);

                    temp2.add(temp);
                        
                    ans.add(temp2);
                }
                st.add(arr[j]);   
            }
        }
        System.out.println(ans);
    }
}
