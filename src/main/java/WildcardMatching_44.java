/**
 * Created by Henry on 2017/8/4.
 */
public class WildcardMatching_44 {
    public boolean isMatch(String s, String p) {
        int si = 0;
        int pi = 0;
        int start = -1;
        int match = 0;
        while (si < s.length()){
            if(pi < p.length() && (p.charAt(pi) == '?' || s.charAt(si) == p.charAt(pi))){
                si ++;
                pi ++;
            }
            else if(pi < p.length() && p.charAt(pi) == '*'){
                start = pi;
                pi++;
                match = si;
            }
            else if(start != -1){
                pi = start + 1;
                match ++;
                si = match;
            }
            else return false;

        }
        while (pi < p.length() && p.charAt(pi) == '*')
            pi++;
        return pi == p.length();
//        if(s == null || p == null) return false;
////        if(s.length() == 0 && p.equals("*")) return true;
//        if(s.length() == 0 && p.length() > 0){
//            if(p.charAt(0) == '*') return true;
//            else return false;
//        }
//        if(p.length() == 0 && s.length() > 0){
//            if(s.charAt(0) == '*')return true;
//            else return false;
//        }
//        if(s.length() == 0 && p.length() == 0)return true;
//        return match(s, p, 0, 0);
    }

//    private boolean match(String s, String p, int si, int pi) {
//        if(si == s.length() && pi == p.length())return true;
//        if(pi == p.length() && si < s.length()) return false;
//        else if(si == s.length())
//        else if(pi <= p.length()) {
//            if (p.charAt(pi) == '*') {
//                pi = pi + 1;
//                si = s.substring(si).indexOf(p.charAt(pi));
//                if (si < 0) return false;
//                else return match(s, p, si, pi);
//            }
//        }
//        else if(p.charAt(pi) == '?'){
//            return match(s, p, si+1, pi + 1);
//        }
//        else if(p.charAt(pi) == s.charAt(si))
//            return match(s, p, si +1 , pi +1);
//        else return false;
//    }
}
