import java.util.Arrays;
import java.util.*;
class remove_duplicates_sol{
    public int removeDuplicates(int arr[]){
        if(arr.length==0) return 0;

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}

public class removeduplicates {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        remove_duplicates_sol r=new remove_duplicates_sol();
        int k=r.removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);

    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < k; i++) {
        System.out.print(arr[i] + " ");
    }
    }
}
