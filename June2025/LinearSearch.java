package June2025;

public class LinearSearch {
    public static void main(String args[]) {
        int arr[] = {12, 114, 0, 4, 9};
        int x = 4; // The value we want to search for

        int searchResult = linearSearch(arr, x); // Pass both the array and the search value

        System.out.println(searchResult); // Prints the index if found, or -1 if not found
    }

    public static int linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Return the index where the value was found
            }
        }
        return -1; // Return -1 if the value wasn't found
    }
}