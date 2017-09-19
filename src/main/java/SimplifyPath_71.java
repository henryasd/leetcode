import java.util.Stack;

/**
 * Created by Henry on 2017/8/11.
 */
public class SimplifyPath_71 {
    public static void main(String[] args){
        System.out.println(new SimplifyPath_71().simplifyPath("/."));
    }
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] paths = path.split("/");
        for(int i = 0; i < paths.length; i++){
            if(paths[i].equals("..")){
                if(!st.isEmpty())
                st.pop();
            }
            else if(!paths[i].equals(".") && paths[i].length() > 0){
                st.push(paths[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append("/");
        for(int i = 0; i < st.size() - 1; i++){
            sb.append(st.get(i)).append("/");
        }
        if(!st.isEmpty()) {
            sb.append(st.get(st.size() - 1));
        }
        return sb.toString();

    }
}
