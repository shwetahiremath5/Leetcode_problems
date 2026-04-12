import java.util.*;

class rotateArray_sol{
    public void rotatearray(int arr[],int k){
        int n=arr.length;

        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        
    }

    private void reverse(int[] arr, int s, int e) {
       while(s<=e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
       }
}
}
public class _18_rotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        rotateArray_sol r=new rotateArray_sol();
        r.rotatearray(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
