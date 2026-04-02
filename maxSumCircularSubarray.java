
class circularsub_sol{
    public int circularsubarray(int arr[]){
        int totalsum=0;
        int maxsum=arr[0];
        int curmax=0;
        int minsum=arr[0];
        int curmin=0;

        for(int i:arr){

            totalsum+=i;

            curmax=Math.max(i,curmax+i);
            maxsum=Math.max(maxsum,curmax);

            curmin=Math.min(i,curmin+i);
            minsum=Math.min(minsum,curmin);

            if(maxsum<0)
             return maxsum;
        }

        return Math.max(maxsum,totalsum-minsum);
    }
}
public class maxSumCircularSubarray {
    public static void main(String[] args) {
        int arr[]={1,-2,3,-2};
        circularsub_sol c=new circularsub_sol();
        System.out.println("maxsum:"+ c.circularsubarray(arr));
    }
}
