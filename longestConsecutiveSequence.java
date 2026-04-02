import java.util.HashSet;

class consecutiveSeq_sol {
    public int longestconsective(int arr[]){
      HashSet<Integer> set=new HashSet<>();
      for(int num:arr)
        set.add(num);

      int longest=0;

      for(int num:arr){
        if(!set.contains(num-1)){
            int current=num;
            int length=1;
            while(set.contains(current+1)){
                current++;
                length++;
            }
            longest=Math.max(length, longest);
        }
      }
      return longest;
      }
    
}
public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[]={100,4,200,1,3,2};
        consecutiveSeq_sol s=new consecutiveSeq_sol();
        int result=s.longestconsective(arr);
        System.out.println("length:"+result);
    }
}
