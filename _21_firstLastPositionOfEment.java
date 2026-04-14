
class fistlastelement_sol{
    public int[] searchrange(int []arr,int target){
        int left=binsearch(arr,target,true);
        int right=binsearch(arr,target,false);

        return new int[]{left,right};
    }

    private int binsearch(int[] arr, int target,boolean leftbias) {
       int s=0,e=arr.length-1;
       int ans=-1;

           while (s<=e) {
            int mid=s+(e-s)/2;
            if(target>arr[mid])
                s=mid+1;
            else if(target<arr[mid])
                e=mid-1;
            else{
                ans=mid;
                if(leftbias)
                    e=mid-1;
                else
                    s=mid+1;
            }
            
           }
           return ans;
    }

}

public class _21_firstLastPositionOfEment {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        fistlastelement_sol m=new fistlastelement_sol();
        int [] res=m.searchrange(arr, 8);
              System.out.println("["+res[0]+" "+res[1]+"]");
    }
}
