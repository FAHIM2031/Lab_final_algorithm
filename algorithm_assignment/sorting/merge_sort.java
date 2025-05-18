package sorting;

public class merge_sort {

    public static void merge(int arr[],int left,int mid,int right)
    {
        int n1 = mid - left + 1;
        int n2 = right-mid;
        int arr_1[] = new int[n1];
        int arr_2[] = new int[n2];
        for(int i=0;i<n1;i++)
            arr_1[i] = arr[left + i];
        for(int j=0;j<n2;j++)
            arr_2[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (arr_1[i] <= arr_2[j]) {
                arr[k] = arr_1[i];
                i++;
            } else {
                arr[k] = arr_2[j];
                j++;
            }
            k++;

        }
        while (i < n1) {
            arr[k] = arr_1[i];
            i++;
            k++;

        }
        while (j<n2) {
            arr[k] = arr_2[j];
            j++;
            k++;
        }

    }



    public static void merge_sorting(int arr[],int l,int r)
    {
        int left=l;
        int mid;
        int right=r;
        if(left<right)
        {
            mid = (left + right) / 2;
            merge_sorting(arr, left, mid);
            merge_sorting(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10, 12, 11, 16, 14, 13, 15 };
        merge_sorting(arr,0,arr.length-1);
        System.out.print("sorted array = ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
