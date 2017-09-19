import java.util.LinkedList;
import java.util.List;

/**
 * Created by Henry on 2017/8/9.
 */
public class InsertInterval {


    //  Definition for an interval.
      public class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> list = new LinkedList<>();
        if(intervals == null || intervals.size() == 0){
            intervals.add(newInterval);
            return intervals;
        }
        int begin = 0;
        while (begin < intervals.size() && intervals.get(begin).end < newInterval.start){
            list.add(intervals.get(begin));
            begin ++;
        }
        while (begin < intervals.size() && intervals.get(begin).start <= newInterval.end){
            newInterval = new Interval(Math.min(intervals.get(begin).start, newInterval.start),
                    Math.max(intervals.get(begin).end, newInterval.end));
            begin++;
        }
        list.add(newInterval);
        while (begin < intervals.size()) {
            list.add(intervals.get(begin));
            begin++;
        }
        return list;



    }
}
