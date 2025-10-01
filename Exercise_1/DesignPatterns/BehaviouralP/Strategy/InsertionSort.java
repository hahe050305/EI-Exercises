public class InsertionSort implements SortingStrategy 
{
    public void sort(int[] arr) 
    {
        System.out.println("Sorting using SelectionSort...");
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            // swap arr[minIndex] and arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
