
class rangesum_sol{
    int prefix[];
    public  rangesum_sol(int arr[]){
        prefix =new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
            prefix[i]=prefix[i-1]+arr[i];
    }
    
    public int rangesum(int left,int right){
        if(left==0)
            return prefix[right];
        return prefix[right]-prefix[left-1];
    }
}
public class _24_rangeSumQuery_Immutable {
    public static void main(String[] args) {
        int arr[]={-2, 0, 3, -5, 2, -1};
        rangesum_sol f=new rangesum_sol(arr);

        System.out.println(f.rangesum(0, 2));
        System.out.println(f.rangesum(2, 5));
        System.out.println(f.rangesum(0, 5));

    }
}
