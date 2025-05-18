package sorting.src;

public class insertion_sort {
   public static void main(String[] args) {
       int[] arr = { 5, 4, 10, 1, 6, 2 };
       for(int i=1;i<arr.length;i++)
       {
           int j;
           int temp = arr[i];
           for (j = i - 1; j >= 0 && temp < arr[j] ; j--) {
                   arr[j + 1] = arr[j];
           }
           arr[j + 1] = temp;
       }
       System.out.print("After the sorting = ");
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }

   } 
}
