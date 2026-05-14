//package strings;

class sol{
    public boolean rotatestring(String s,String goal){
        if(s.length()!=goal.length())
            return false;

        String doubled=s+s;
      return  doubled.contains(goal);
    }
}
public class _1_rotateString {
    public static void main(String[] args) {
        String s= "abcde";
        String goal = "cdeab";
        sol obj=new sol();
        System.out.println(obj.rotatestring(s, goal));
    }
}
