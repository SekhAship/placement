package Array.Medium;
public class m3_kadane {
    public static void main(String[] args) {
        int [] arr={2,-1,3,-2,4};
        int cs=arr[0];
        int ms=arr[0];
        int as=0;
        int ae=0;
        int start=0;
        for(int i=1;i<arr.length;i++){
            // cs=Math.max(arr[i],cs+arr[i]);


            if(arr[i]>cs+arr[i]){
                cs=arr[i];
                start=i;
            }else{
                cs=cs+arr[i];
            }

            // ms=Math.max(ms,cs);
            if(cs>ms){
                ms=cs;
                as=start;
                ae=i;
            }
            // System.out.println("cs-> "+cs+" ms-> "+ms);
        }
        for(int i=as;i<=ae;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("maximum sum "+ms);
    }
}
