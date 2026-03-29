
class maxpro_sol{
    public int maxpro(int arr[]){
        int maxpro=arr[0];
        int minpro=arr[0];
        int res=arr[0];

        for(int i=1;i<arr.length;i++){
            int curr=arr[i];

             if(curr<0){
                int temp=maxpro;
                maxpro=minpro;
                minpro=temp;
             }

             maxpro=Math.max(curr,maxpro*curr);
             minpro=Math.min(minpro*curr, curr);

             res=Math.max(maxpro, res);
        }
        return res;
    }
}
public class maxProSubarray {
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        maxpro_sol m=new maxpro_sol();
        System.out.println("maxproduct:"+m.maxpro(arr));
    }
}
