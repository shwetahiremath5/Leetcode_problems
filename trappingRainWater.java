
class trappingwater_sol{
    public int trappingwater(int[] arr){
        if(arr==null || arr.length==0) return 0;

        int l=0,r=arr.length-1;
        int leftmax=arr[l], rightmax=arr[r];
        int res=0;

        while(l<r){
            if(leftmax < rightmax ){
                l++;
                leftmax=Math.max(leftmax, arr[l]);
                res+=leftmax-arr[l];
            }
            else{
                r--;
                rightmax=Math.max(rightmax, arr[r]);
                res+=rightmax-arr[r];
            }
        }
        return res;
    }
}
public class trappingRainWater {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        //int arr[]={4,2,0,3,2,5};
        trappingwater_sol t=new trappingwater_sol();
        System.out.println(t.trappingwater(arr));
    }
}
