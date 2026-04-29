
class sol{
    public int[] choco(int candies,int num_people){
        int res[]=new int[num_people];
        int index=0;

        while(candies>0){
            int give=Math.min(candies,index+1);
            res[index%num_people]+=give;
            candies-=give;
            index++;
        }
        return res;
    }
}
public class _27_distributeCandiesToPeople {
    public static void main(String[] args) {
        
    sol s=new sol();
    int candies=10;
    int num_people=3;
     int[] result = s.choco(candies, num_people);

        // Print result
        for (int i = 0; i < result.length; i++) 
            System.out.print(result[i] + " ");
    }
 
}
