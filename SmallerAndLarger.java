/*
Given a sorted array Arr of size N and a value X, find the number of array elements
 less than or equal to X and elements more than or equal to X.
Input:
N = 7, X = 0
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 0 7
 */
public class SmallerAndLarger {
    static void countElements(int arr[], int X) {
        int countSmaller = 0;
        int countLarger = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= X) {
                countSmaller++;
            } if(arr[i]>=X) {
                countLarger++;

            }
        }

        System.out.println("Smaller or Equal: " + countSmaller);
        System.out.println("Larger or Equal: " + countLarger);
    }

    public static void main(String args[]) {
        int arr[] = {7, 2, 8, 10, 11, 12, 19};
        int X = 0;
        countElements(arr, X);
    }
}
