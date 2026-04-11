import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

class spiral_sol{
    public List<Integer> spiralmatrix(int arr[][]) {
        List<Integer> res=new ArrayList<>();

        if(arr==null || arr.length==0) return res;

        int srow=0,erow=arr.length-1;
        int scol=0,ecol=arr[0].length-1;

        while(srow<=erow && scol<=ecol){
            
            //left to right
            for(int i=scol;i<=ecol;i++){
                res.add(arr[srow][i]);
            }
            srow++;

            //top to bottom
            for(int i=srow;i<=erow;i++){
                res.add(arr[i][ecol]);
            }
            ecol--;

            //right to left
            for(int i=ecol;i>=scol;i--){
                if(scol==ecol) break;
                res.add(arr[erow][i]);
            }
            erow--;

            //bottom to up
            for(int i=erow;i>=srow;i--){
                if(srow==erow) break;
                res.add(arr[i][scol]);
            }
            scol++;
        }
        return res;
        
    }
}
public class _17_spiralMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        spiral_sol s=new spiral_sol();
        
        System.out.println(s.spiralmatrix(arr));
    }
}
