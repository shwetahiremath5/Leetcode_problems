import java.util.Stack;

class sol{
    public boolean valid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{')
                stack.push(ch);
            else{
                if(stack.isEmpty())
                    return false;
                 char top=stack.pop();
                 if(ch==')'&&top!='(' || ch==']'&&top!='[' || ch=='}'&&top!='{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

public class _4_validParentheses {
    public static void main(String[] args) {
        String st="(){{[]}}";
        sol a=new sol();
        System.out.println(a.valid(st));
    }
}
