import java.util.HashMap;

public class _6_RomanToInteger {
    public static int Inner_6_RomanToInteger(String s) {
        HashMap<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int res=0;

        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && roman.get(s.charAt(i))< roman.get(s.charAt(i+1)))
                res-=roman.get(s.charAt(i));

            else
                 res+=roman.get(s.charAt(i));

        }
        return res;
    
        
    }
    public static void main(String[] args) {
        String a="MCMXCIV";
        System.out.println("integer value:"+Inner_6_RomanToInteger(a));
        
    }
}
