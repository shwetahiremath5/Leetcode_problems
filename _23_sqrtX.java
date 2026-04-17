
class sqrt_sol{
    public int findsqrt(int x){
        if(x==0) return 0;

        int s=0,e=x;
        int res=0;

        while(s<=e){
            int mid=s+(e-s)/2;
            long sqrt=(long)mid*mid;
            if(sqrt==x)
                return mid;
            else if(sqrt<x){
                res=mid;
                s=mid+1;
            }
            else 
                e=mid-1;    
        }
        return res;
    }
}

public class _23_sqrtX {
    public static void main(String[] args) {
        int x=8;
        sqrt_sol s=new sqrt_sol();
        System.out.println(s.findsqrt(x));
    }
}
