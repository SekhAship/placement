package Array.Medium;
public class m3_majorityoptimal {
    public static void main(String[] args) {
        //boyer moore voting algo
        int arr[]={2,2,1,1,1,2,2};
        int candidate=0;
        int count=0;
        for(int itr:arr){
            if(count==0){
                candidate=itr;
            }
            if(itr==candidate){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(candidate);
    }
}