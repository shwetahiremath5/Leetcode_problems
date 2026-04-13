
class findmin_sol{
    public int findmin(int arr[]){
        int s=0,e=arr.length-1;
        while (s<e) {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[e])
                s=mid+1;
            else
                e=mid;

        }
        return arr[s];
    }
}
public class _20_minRotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
           findmin_sol m=new findmin_sol();
           System.out.println("min:"+m.findmin(arr));
    }
}
