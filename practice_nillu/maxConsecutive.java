package practice_nillu;

public class maxConsecutive {
    public static void main(String[] args){
  
    int[] arr={2,3,1,1,1,1,5,1,1,1,1,1};
    int count=0;
    int maxi=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            count++;
        }else{
            maxi=Math.max(maxi,count);
            count=0;
        }
    }
    // int[] arr={2,3,1,1,1,1,5,1,1,1,1,1,5};
    //agar last me 5 nhi ho to fir else condition run nhi hoga aur maxi update nhi hoga aur answer galat ayega
    // isi liye last 2 step verification
        maxi=Math.max(maxi,count);
        System.out.print(maxi);
    
    }
}
