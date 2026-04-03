
import java.util.*;

class majority_Solution {
    public int majorityElement(int[] arr) {
        int element=arr[0];
        int count=0;
        for(int num:arr){
            if(count==0)
                element=num;
            if(num==element)
                count++;
            else
                count--;
        }
        return element;
    }
}

public class majorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        majority_Solution s=new majority_Solution();
        System.out.println(s.majorityElement(arr));
    }
}
