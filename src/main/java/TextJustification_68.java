import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/10.
 */
public class TextJustification_68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new LinkedList<>();
        int i = 0;
        int j = 0;
        int num = 0;
        int len = 0;
        while (j < words.length){
            len = len + words[j].length();
            if(len + j - i > maxWidth){
                StringBuffer sb = new StringBuffer();
                len = len - words[j].length();
                int spaceNum = maxWidth - len;
                int place = j > 1? j - i - 1: 1;
                for(int k = i; k < j; k++){
                    sb.append(words[k]);


                }
            }
        }
        return list;
    }
}
