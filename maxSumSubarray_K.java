import java.util.*;

class maxSubarray_sol {
    public int maxsumk(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();

        int n=arr.length;
        int count=0;

        int[] prefixsum=new int[n];
        prefixsum[0]=arr[0];

        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1] + arr[i];
        }

        for(int j=0;j<n;j++){
            if(prefixsum[j]==k)
                count++;

            int val=prefixsum[j]-k;

            if(map.containsKey(val))
                count+=map.get(val);

            map.put(prefixsum[j],map.getOrDefault(prefixsum[j],0)+1);
        }
        return count;

    }
}

public class maxSumSubarray_K {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        maxSubarray_sol s=new maxSubarray_sol();
        int k=6;
        System.out.println(s.maxsumk(arr,k));
    }
}
