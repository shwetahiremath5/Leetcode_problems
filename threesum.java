import java.util.*;
class three_sum_solution{
    public List<List<Integer>> threesum(int arr[]){
        int n=arr.length;
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];

                if(sum<0)
                    j++;
                else if(sum>0) k--;
                else {
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;

                    if(j>k && arr[j]==arr[j-1]) j++;
                     if(j>k && arr[k]==arr[k-1]) k--;
                }
            }
        }
             return res;
    }
}
public class threesum {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        three_sum_solution t=new three_sum_solution();
       List<List<Integer>> res= t.threesum(arr);
       for(List<Integer> i:res)
        System.out.println(i);
    }
}
