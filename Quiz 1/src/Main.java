public class Main {
    public static void main(String[] args) {

        //initialize array...
        int[] numbers = new int [10];

        numbers[0] = 25;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 11;
        numbers[4] = 35;
        numbers[5] = 65;
        numbers[6] = 22;
        numbers[7] = 10;
        numbers[8] = 121;
        numbers[9] = 70;

        //Array Before Sorting...
        System.out.println("Array Before Sorting: ");
        printArrayElements(numbers);

        bubbleSort(numbers);

        //Array After Bubble Sort in descending order...
        System.out.println("\n\nAfter Bubble Sort in descending order: ");
        printArrayElements(numbers);

        selectionSort(numbers);

        //Array After Selection Sort in descending order...
        System.out.println("\n\nAfter Selection Sort in descending order: ");
        printArrayElements(numbers);

    }

    //function to sort array using bubble sort algorithm...
    private static void bubbleSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i < lastSortedIndex; i++)
            {
                if(arr[i] < arr[ i + 1]){

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    //function to sort array using selection sort algorithm...
    private static void selectionSort(int[]arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex < 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for(int i = 1 ; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = 1;
                }

            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }

    }

    //function to print array elements...
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
         System.out.print(j + " ");

        }

    }
}