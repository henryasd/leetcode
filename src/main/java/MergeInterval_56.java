import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/9.
 */
public class MergeInterval_56 {

    //  Definition for an interval.
      public class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ans = new LinkedList<>();
        if(intervals == null || intervals.size() == 0) return ans;
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        ans.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++){
            Interval last = ans.get(ans.size() - 1);
            if(isMerge(last, intervals.get(i))){
                Interval mergeInterval = mergeTwo(last, intervals.get(i));
                ans.remove(ans.size() - 1);
                ans.add(mergeInterval);
            }
            else {
                ans.add(intervals.get(i));
            }
        }
        return ans;

    }

    private boolean isMerge(Interval last, Interval interval) {
        if(last.end >= interval.start)
            return true;
        else
            return false;
    }
    private Interval mergeTwo(Interval interval1, Interval interval2){
        Interval result = new Interval();
        result.start =  interval1.start;
        result.end = interval1.end > interval2.end? interval1.end: interval2.end;
        return result;

    }
}
