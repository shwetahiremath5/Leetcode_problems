//package Leetcode;

import java.util.Arrays;

class move_zeroes_sol{
    public void movezeroes(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }
    }
}
public class move_zeroes {
    public static void main(String[] args) {
        move_zeroes_sol m=new move_zeroes_sol();
        int arr[]={0,1,0,3,12};
        m.movezeroes(arr);
      System.out.println(Arrays.toString(arr));
        
    }
    
}




//another way using temp
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}