
class sol{
    public int pivotIndex(int arr[]){
        int total=0;
        for(int i:arr){
            total+=i;
        }

        int leftsum=0;

        for(int i=0;i<arr.length;i++){
         int rightsum=total-arr[i]-leftsum;
         if(leftsum==rightsum)
            return i;

         leftsum+=arr[i];
        }
        return -1;
    }
}
public class _28_findPivotIndex {
    public static void main(String[] args) {
        
    int arr[]={1, 7, 3, 6, 5, 6};
    sol s=new sol();
    System.out.println("pivot index:"+s.pivotIndex(arr));
}
}
