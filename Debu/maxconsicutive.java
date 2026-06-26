package Debu;

public class maxconsicutive {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0,0,0,0, 1,1,1 };
        int zcount =0;
        int ocount=0;
        int zmaxi=0;
        int omaxi=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                zcount++;
                ocount=0;
            }else{
                ocount++;
                zcount =0;   
            }
            zmaxi=Math.max(zmaxi,zcount);
            omaxi=Math.max(omaxi,ocount);  
        }
        //  System.out.println(max);
        if(zmaxi>omaxi){
            System.out.println(zmaxi);
        }else{
            System.out.println(omaxi);
        }
    }
}
