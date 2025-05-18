package sorting.src;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 1, 3, 9 };
        for(int i=0;i<5;i++)
        {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("After sorting = ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
