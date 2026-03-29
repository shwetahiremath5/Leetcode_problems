
class maxsum_sol{
    public int maxsum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            maxsum=Math.max(maxsum, currsum);
            if(currsum<0)
                currsum=0;

        }
         return maxsum;
    }
}
public class maxSumSubarray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        maxsum_sol m=new maxsum_sol();
        System.out.println("maxsum:"+m.maxsum(arr));

    }
}
