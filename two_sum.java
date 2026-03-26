//package Leetcode;

import java.util.HashMap;

class two_sum_sol{
public int[] twosum(int[] arr,int target ){
    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<arr.length;i++){
       int  first=arr[i];
      int  sec=target-first;
      if(map.containsKey(sec)){
        return new int[]{i,map.get(sec)};
      }
      map.put(first,i);
    }
    return new int[]{};
}
}
public class two_sum {
    public static void main(String[] args) {
        two_sum_sol c=new two_sum_sol();
        int arr[]={2,7,11,15};
        int target=9;
         
        int[] result=c.twosum(arr,target);
        if(result.length==0){
            System.out.println("no solution found");
        }
        else{
            System.out.println("Indices"+result[0]+" "+result[1]);
        }
    }
         
    }
   

