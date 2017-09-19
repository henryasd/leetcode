import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/7/28.
 */
public class VP_20 {
    public static void main(String[] args){
        System.out.println(new VP_20().isValid("([])"));
    }
    public boolean isValid(String s) {
        boolean valid = false;
        LinkedList<Character> list  = new LinkedList<Character>();
        for(int i = 0; i< s.length(); i++){
            char c2 = s.charAt(i);
            if(list.size() == 0){
                list.push(c2);
            }
            else {
                char c1 = list.peek();
                if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}')) {
                    list.pop();
                } else
                    list.push(c2);
            }

        }
        if(list.size() == 0)
            valid = true;
        else
            valid = false;
        return valid;

    }
    public boolean isMatch(char c1, char c2){
        boolean match = false;
        if((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}')){
            match = true;
        }
        return match;
    }
}
