package practice_nillu;
public class findmissingElement{
    public static void main (String[] args){
        int [] arr={0,1,2,4,5};
        int n = arr.length;
        int sum = n*(n+1)/2;
        int actualSum =0;
        for(int a:arr){
            actualSum+=a;
        }
        int output= sum-actualSum;
        System.out.println(output);
    }
}