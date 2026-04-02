import java.util.HashSet;

class duplicatenum{
    public int findDuplicate(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num))
                return num;
            set.add(num);
        }
        return -1;
    }
}
public class findDuplicateNum {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        duplicatenum d=new duplicatenum();
        System.out.println("duplicate number:"+d.findDuplicate(arr));
    }
}
