/*
You are given an array A of size N. You need to print elements of A
in alternate order (starting from index 0).
Input:
N = 4
A[] = {1, 2, 3, 4}
Output:
1 3
 */
public class AlternetiveElements {
    static void AlterElements(int arr[]){
        for(int i=0;i< arr.length;i+=2) {
            System.out.print(arr[i] + ",");
        }
    }
    public static void main(String args[]){
        int arr[]={2,5,4,7,7,8,9,10};
        AlterElements(arr);

    }
}
