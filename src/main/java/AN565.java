import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Henry on 2017/6/3.
 */
public class AN565 {
    public static void main(String[] args){
        AN565 an = new AN565();
        int [] nums = {};
        System.out.println(an.arrayNesting(nums));
    }
    public int arrayNesting(int[] nums) {
        int size = 0;
        List<HashSet<Integer>> listSet = new LinkedList<HashSet<Integer>>();
        for(int i = 0; i< nums.length; i++){
            boolean hasNum = false;
            for(int j = 0; j < listSet.size(); j++){
                Set set = listSet.get(j);
                if(set.contains(nums[i])){
                    hasNum = true;
                    break;
                }

            }
            if(!hasNum){
                HashSet<Integer> newSet = new HashSet<Integer>();
                newSet.add(nums[i]);
                add(nums,newSet,nums[i]);

                listSet.add(newSet);


            }
        }
        for (Set set : listSet){
            size = Math.max(size,set.size());
        }
        return  size;
    }
    public void add(int[] nums, Set set, int tmp){
        set.add(tmp);
        if(!set.contains(nums[tmp])){
            add(nums,set,nums[tmp]);
        }
        else
        return;
    }
}
