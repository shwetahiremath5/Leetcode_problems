
class rotatedarraySearch{
    public int search(int arr[],int target){
        int s=0,e=arr.length-1;

        while (s<=e) {
            int mid=s+(e-s)/2;
            if(target==arr[mid])
                return mid;

            if(arr[s]<=arr[mid]){ //left sorted
                if(target>=arr[s] && target<=arr[mid])
                    e=mid-1;
                else
                    s=mid+1;
            }

            else{
                if(target>=arr[mid] && target<=arr[e])
                    s=mid+1;
                else
                    e=mid-1;
            }
            }
            return -1;
        }
    }

public class _19_searchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        rotatedarraySearch s=new rotatedarraySearch();
        System.out.println(s.search(arr, 0));
    }
}
