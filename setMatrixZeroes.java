import java.util.Arrays;

class setmatrixzero_sol{
    public void matrixzero(int arr[][]){
        int r=arr.length,c=arr[0].length;
        boolean row0=false;

        //to mark 
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(arr[i][j]==0){
                    arr[0][j]=0;
                    if(i==0) row0=true;
                    else arr[i][0]=0;
        }

        //to fill zeroes
        for(int i=1;i<r;i++)
            for(int j=0;j<c;j++)
              if(arr[i][0]==0 || arr[0][j]==0)
                arr[i][j]=0;

        //to fill column 
        if(arr[0][0]==0)
            for(int i=0;i<r;i++)
        arr[i][0]=0;

        //to fill row 
        if(row0)
            for(int j=0;j<c;j++)
        arr[0][j]=0;
    }
}
public class setMatrixZeroes {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        setmatrixzero_sol m=new setmatrixzero_sol();
        m.matrixzero(arr);
 for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
