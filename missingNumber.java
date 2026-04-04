import java.util.Arrays;

class missingno_sol{
    public int missingno(int[] arr){
        Arrays.sort(arr);
        int j=0;
        for(int num:arr){
            if(num==j)
                j++;
            else
                return j;
        }
        return j;
    }
}

public class missingNumber{
    public static void main(String[] args) {
        missingno_sol m=new missingno_sol();
        int arr[]={3,0,1,2,6,4,7,9};
        System.out.println("missing number:"+m.missingno(arr));
    }
}