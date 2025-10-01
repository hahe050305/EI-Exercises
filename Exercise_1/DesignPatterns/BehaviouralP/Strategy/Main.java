public class Main
 {
    public static void main(String[] args) 
    {
        int[] arr1 = { 5, 2, 8, 1, 3 };
        int[] arr2 = { 10, 7, 8, 9, 1, 5 };

        SortContext sorter = new SortContext();

        sorter.setStrategy(new BubbleSort());
        sorter.sortArray(arr1);

        sorter.setStrategy(new InsertionSort());
        sorter.sortArray(arr2);
    }
}
