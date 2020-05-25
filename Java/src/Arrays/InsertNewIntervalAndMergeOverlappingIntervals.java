package Arrays;

import java.util.ArrayList;

/*
*Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
*You may assume that the intervals were initially sorted according to their start times.
*Example 1:
*Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
*
*
 */
public class InsertNewIntervalAndMergeOverlappingIntervals {

    static class Intervals{
        int start;
        int end;
        Intervals() { start = 0; end = 0; }
        Intervals(int s, int e) { start = s; end = e; }

    }

    private static ArrayList<Intervals> insertNewInterval(ArrayList<Intervals> intervals,Intervals newInterval){
        ArrayList<Intervals> result=new ArrayList<Intervals>();

        for(int i=0;i<intervals.size();i++){
            Intervals currentInterval=intervals.get(i);
            if(currentInterval.start>newInterval.end){
                result.add(newInterval);
                result.addAll(intervals.subList(i,intervals.size()));
                return result;
            }else if(currentInterval.end<newInterval.start){
                result.add(currentInterval);
            }else{
                int newStart=Math.min(currentInterval.start,newInterval.start);
                int newEnd=Math.max(currentInterval.end,newInterval.end);
                newInterval.start=newStart;
                newInterval.end=newEnd;
            }

        }
        result.add(newInterval);
        return result;
    }


    private static ArrayList<Intervals> mergeOverLappingIntervals(ArrayList<Intervals> input){

      for(int i=0;i<input.size()-1;i++){
            Intervals current=input.get(i);
            Intervals next=input.get(i+1);
            if(current.end>next.start&&current.end<next.end){
                Intervals newInterval=new Intervals(current.start,next.end);
                input.set(i,newInterval);
                input.remove(next);
              //  input.remove(current);
            }
      }
      return input;
    }

    public static void main(String[] args) {
        ArrayList<Intervals> initialIntervals=new ArrayList<>();
        initialIntervals.add(new Intervals(1,2));
        initialIntervals.add(new Intervals(3,5));
        initialIntervals.add(new Intervals(6,7));
        initialIntervals.add(new Intervals(8,10));
        initialIntervals.add(new Intervals(12,16));
        ArrayList<Intervals> result=insertNewInterval(initialIntervals,new Intervals(4,9));
        System.out.println("Intervals after merge:  ");
        for (Intervals i:result){
            System.out.print("["+i.start+","+i.end+"]  ");
        }


        ArrayList<Intervals> initialIntervalsBeforeMerging=new ArrayList<>();
        initialIntervalsBeforeMerging.add(new Intervals(1,3));
        initialIntervalsBeforeMerging.add(new Intervals(2,6));
        initialIntervalsBeforeMerging.add(new Intervals(8,10));
        initialIntervalsBeforeMerging.add(new Intervals(15,18));
        ArrayList<Intervals> resultAfterMerging=mergeOverLappingIntervals(initialIntervalsBeforeMerging);
        System.out.println("\nIntervals after merging overlapping intervals:  ");
        for (Intervals i:resultAfterMerging){
            System.out.print("["+i.start+","+i.end+"]  ");
        }


    }
}
