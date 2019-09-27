import java.util.Arrays;

public class MergeSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a)
    {
        int l = 0;
        int r = a.length -1;
        int m = (l + r + 1) / 2;
        if (a.length > 1)
        {
            int[] left = Arrays.copyOfRange(a,l,m);
            int[] right = Arrays.copyOfRange(a,m,a.length);

            sort(left);
            sort(right);

            merge(a, left, right);
        }


    }




    public void merge(int arr[], int l[], int r[])
    {
        int k = 0, i = 0, j = 0;
        while (i < l.length && j < r.length)
        {
            if (l[i] <= r[j])
            {
                arr[k++] = l[i++];
            }
            else
            {
                arr[k++] = r[j++];
            }
        }
        while (i < l.length)
        {
            arr[k++] = l[i++];
        }
        while (j < r.length)
        {
            arr[k++] = r[j++];
        }

    }



}
