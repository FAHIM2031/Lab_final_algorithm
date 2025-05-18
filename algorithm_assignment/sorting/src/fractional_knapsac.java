package sorting.src;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class fractional_knapsac {
    public static void main(String[] args) {
        double[] object = { 1, 2, 3, 4, 5, 6, 7 };
        double[] profit = { 12, 5, 16, 7, 9, 11, 6 };
        double[] weights = { 3, 1, 4, 2, 9, 4, 3 };
        double[] ratio = new double[object.length];

        for(int i=0;i<object.length;i++)
        {
            ratio[i] = profit[i] / weights[i];
        }
        // for(int i=0;i<ratio.length;i++)
        // {
        //     System.out.println(ratio[i]);
        // }

        Integer[] indices = new Integer[ratio.length];
        for(int i=0;i<ratio.length;i++)
        {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingDouble(i -> ratio[i]));
        for(int i=0;i<indices.length/2;i++)
        {
            
            int temp;
            temp = indices[i];
            indices[i] = indices[indices.length - i - 1];
            indices[indices.length - i - 1] = temp;
        }


        // for(int i=0;i<ratio.length;i++)
        // {

        //     System.out.print(indices[i] + " ");
        // }
        double remanining_weights = 15.0;
        double profit_value = 0.0;
        double weights_value=0.0;
        for(int i=0;i<ratio.length;i++)
        {
            if (remanining_weights == 0)
                break;
            else {
                profit_value += profit[indices[i]];
                remanining_weights -= weights[indices[i]];
                if (remanining_weights <= weights[indices[i]])
                    profit_value += profit[indices[i]] * (remanining_weights / weights[indices[i]]);

            }
        }
        System.out.print("The profit for knapsac problem is = "+(int)profit_value);

        

    }
}
