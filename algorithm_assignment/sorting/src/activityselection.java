package sorting.src;
import java.util.Arrays;
import java.util.Comparator;

public class activityselection {
    public static void main(String[] args) {
        int[] finish_time = {6, 4, 2,9,7,9};
        String[] activity = { "A1", "A2", "A3", "A4", "A5", "A6" };
        int[] start_time = { 0, 3, 1, 5, 5, 8 };

        Integer[] indices = new Integer[finish_time.length];
        for (int i = 0; i < finish_time.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, Comparator.comparingInt(i -> finish_time[i]));

        int[] finish_time_sort = new int[finish_time.length];
        String[] activity_sort = new String[activity.length];
        int[] start_time_sort = new int[start_time.length];

        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            finish_time_sort[i] = finish_time[idx];
            activity_sort[i] = activity[idx];
            start_time_sort[i] = start_time[idx];
        }

        System.out.println("Finish time:   " + Arrays.toString(finish_time_sort));
        System.out.println("Activity: " + Arrays.toString(activity_sort));
        System.out.println("Start_time:  " + Arrays.toString(start_time_sort));


        int n = 0;
        System.out.print("the selected activity are = ");
        System.out.print(activity_sort[n]+" ");
        for(int i=1;i<finish_time_sort.length;i++)
        {
               if (finish_time_sort[n]<=start_time_sort[i]) {
                   System.out.print(activity_sort[i]+" ");
                   n++;
               }
        }




    }
}


