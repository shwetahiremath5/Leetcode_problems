
class mostWater_sol  {
    public int mostwater(int arr[]){
        int maxarea=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int h=Math.min(arr[left],arr[right]);
            int w=right-left;
            int area=h*w;
            maxarea=Math.max(maxarea,area);
            if(arr[left]<arr[right])
                left++;
            else
                right--;

        }
         return maxarea;
    }
}
public class containerWithMostWater {
    public static void main(String[] args) {
        mostWater_sol w=new mostWater_sol();
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println("max area:"+w.mostwater(arr));
    }
}
