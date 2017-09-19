//import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
//import java.util.Set;

/**
 * Created by Henry on 2017/8/9.
 */
public class PermutationSequence_60 {
    public static void main(String[] args) {


    PermutationSequence_60 ps = new PermutationSequence_60();
    int n = 3;
    int k = 6;
        System.out.println(ps.getPermutation(n,k));
    }

    public String getPermutation(int n, int k) {
        List<Integer> numList = new LinkedList<>();
        int[]  factorial = new int[n + 1];
        for(int i = 1; i <= n; i++ )
            numList.add(i);
        factorial[0] = 1;
        for(int i = 1; i <= n; i++){
            factorial[i] = i * factorial[i - 1];
        }
        StringBuffer sb = new StringBuffer();
        k--;
        for(int i = 1; i <= n; i++){
            int index = k/factorial[n - i];
            sb.append(numList.get(index));
            numList.remove(index);
            k = k - index * factorial[n - i];
        }
        return sb.toString();
    }


}
