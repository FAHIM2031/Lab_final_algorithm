package sorting.src;

public class quick_sort {

    public static int partiton(int arr[],int l,int r)
    {
        int left = l;
        int right = r;
        int pivot = arr[left];
        int i = left, j = right;
        while (i < j) {

            while (i<=right && arr[i] <= pivot ) {
                i++;

            }
            while (j>=left && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp01 = arr[left];
        arr[left] = arr[j];
        arr[j] = temp01;
        return j;
    }

    public static void quick_sorting(int arr[],int l,int r)
    {
        if(l<r)
        {
            int j = partiton(arr, l, r);
            quick_sorting(arr, l, j-1);
            quick_sorting(arr, j+1, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 10, 16, 14, 13, 15, 11, 12 };
        int left = 0;
        int right = arr.length-1;
        quick_sorting(arr, left, right);
        System.out.print("After sorting = ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }

}
